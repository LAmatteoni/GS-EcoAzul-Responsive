import ONGS from '../ONGs/ongs'
import './../../../public/css/ranking.css'


const Ranking = () => {
    return(
        <>
            <section className='secao-ongs'>
                <div className="filtro-ongs">
                    <ONGS/>
                </div>
            </section>
        </>   
    )
}
export default Ranking;