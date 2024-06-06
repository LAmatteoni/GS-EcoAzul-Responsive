'use client'
import { useEffect, useState } from "react";
import "./../../../public/css/ongs.css"
import Link from "next/link";
import Image from "next/image";

type Ong = {
    idOng: number;
    nome: string;
    estado: string;
    pais: string;
    areaAtuacao: string;
    imagem: string;
    materialColetado: number;
};

const ONGS = () => {
    const [data, setData] = useState<Ong[]>([]);
    const [error, setError] = useState<string | null>(null);
    const [loading, setLoading] = useState<boolean>(true);
    const [sortOrder, setSortOrder] = useState<'crescente' | 'decrescente'>('crescente');

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch("http://localhost:8081/ongs");
                if (!response.ok) {
                    throw new Error(`Erro de HTTP! Erro ${response.status}`);
                }
                const jsonData = await response.json();
                setData(jsonData);
            } catch (error: any) {
                setError(error.message);
            } finally {
                setLoading(false);
            }
        };

        fetchData();
    }, []);

    const handleSortOrderToggle = () => {
        setSortOrder(sortOrder === 'decrescente' ? 'crescente' : 'decrescente');
    };

    const sortedData = [...data].sort((a, b) => {
        if (sortOrder === 'decrescente') {
            return a.materialColetado - b.materialColetado;
        } else {
            return b.materialColetado - a.materialColetado;
        }
    });

    if (loading) {
        return <div id="carregando">
                <div className="loader"></div>
                <h2>Carregando...</h2>
               </div>;
    }

    if (error) {
        return <div id="erro">
                <p>Pedimos desculpas pelo imprevisto! Nossa equipe está fazendo seu melhor para corrigir este erro! :D</p>
                <h2>Erro: {error}</h2>
                <br />
                <Link id="voltar" href="/">Voltar para home</Link>
               </div>;
    }

    return (
        <>
            <div className="container-ranking">
                <h1>Conheça as melhores ONGs</h1>
                <div className="filtro">
                    <h4>Filtro:</h4>
                    <button onClick={handleSortOrderToggle}>
                        {sortOrder === 'decrescente' ? 'Menos lixo coletado' : 'Mais lixo coletado'}
                    </button>
                </div>
                <div className="content-ongs">
                    <div className="content-card">
                        {sortedData.map((ong) => (
                            <div className="ongs" key={ong.idOng}>
                                <Image className="img-ongs" src={"/assets/" + ong.imagem} width={300} height={300} alt={"Imagem da ONG " + ong.nome}/>
                                <hr className="borda-img"/>
                                <div className="descricao-ongs">
                                    <h3>{ong.nome}</h3>
                                    <p>{ong.estado}, {ong.pais}</p>
                                    <p>Atuação: <br /> {ong.areaAtuacao}</p>
                                </div>
                                <p id="lixo">Lixo coletado: <br /> <b>{ong.materialColetado} Toneladas</b></p>
                            </div>
                        ))}
                    </div>
                </div>
            </div>
        </>
    );
};

export default ONGS;