'use client'
import { useEffect, useState } from "react";
import "./../../../public/css/ongs.css"
import Link from "next/link";

const ONGS = () => {
    const [data, setData] = useState<any[]>([]);
    const [error, setError] = useState<string | null>(null);
    const [loading, setLoading] = useState<boolean>(true);

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
            <div className="content-ongs">
                <div className="content-card">
                    {data.map((ong) => (
                        <div className="ongs" key={ong.idOng}>
                            <h3>{ong.nome}</h3>
                            <div className="descricao-ongs">
                                <p>- {ong.estado}</p>
                                <p>Atuação: <br /> {ong.areaAtuacao}</p>
                            </div>
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
};

export default ONGS;