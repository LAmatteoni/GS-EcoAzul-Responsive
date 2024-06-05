import Image from 'next/image';
import './../../../public/css/sobrenos.css'
import Lucca from './../../../public/assets/lucca.png'
import Vitor from './../../../public/assets/vitor.png'
import Keven from './../../../public/assets/keven.png'

const Sobrenos = () => {
    return(
        <>
            <section className="equipe">
                    <h1>Nossa Equipe</h1>
                <div className="desenvolvedores">
                    <h2>Conheça nossos desenvolvedores:</h2>
                    <div className="integrantes">
                        <div className="card-integrante">
                            <Image src={Lucca} className='foto-perfil' alt='Foto de perfil do integrante Lucca'/>
                            <h3>Lucca Matteoni</h3>
                            <span>RM98146</span>
                            <span>-</span>
                            <span>1TDSPB</span>
                        </div>
                        <div className="card-integrante">
                            <Image src={Vitor} className='foto-perfil' alt='Foto de perfil do integrante Vitor'/>
                            <h3>Vitor Santos</h3>
                            <span>RM553621</span>
                            <span>-</span>
                            <span>1TDSPB</span>
                        </div>
                        <div className="card-integrante">
                            <Image src={Keven} className='foto-perfil' alt='Foto de perfil do integrante Keven'/>
                            <h3>Keven Pereira</h3>
                            <span>RM553215</span>
                            <span>-</span>
                            <span>1TDSPB</span>
                        </div>
                    </div>
                </div>
            </section>
        </>
    )
}
export default Sobrenos;