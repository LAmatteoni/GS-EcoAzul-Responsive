import ONGS from '../ONGs/ongs'
import './../../../public/css/ranking.css'


const Ranking = () => {
    return(
        <>
            <section className='secao-ongs'>
                <div className="filtro-ongs">
                    <h1>Conheça as ONGs brasileiras</h1>
                    <ONGS/>
                </div>
            </section>
        </>   
    )
}
export default Ranking;