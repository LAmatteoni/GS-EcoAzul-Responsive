'use client'
import { useEffect, useState } from "react";
import "./../../../public/css/ongs.css"

const ONGS = () => {
    const [data, setData] = useState<any[]>([]);
    const [error, setError] = useState<string | null>(null);
    const [loading, setLoading] = useState<boolean>(true);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch("http://localhost:8081/ongs");
                if (!response.ok) {
                    throw new Error(`Erro de HTTP! Erro: ${response.status}`);
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
        return <div id="erro">{error}</div>;
    }

    return (
        <>
            <div className="content-ongs">
                <div className="content-card">
                    {data.map((ong) => (
                        <div className="ongs" key={ong.idOng}>
                            <h3>{ong.nome}</h3>
                            <p>{ong.pais}</p>
                            <p>{ong.estado}</p>
                            <p>{ong.areaAtuacao}</p>
                        </div>
                    ))}
                </div>
            </div>
        </>
    );
};

export default ONGS;