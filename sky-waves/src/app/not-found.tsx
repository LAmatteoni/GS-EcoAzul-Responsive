import Image from 'next/image';
import './../../../sky-waves/public/css/notfound.css'
import Radar from './../../public/assets/radar.gif'
import Link from 'next/link';

const notfound = () =>{
    return(
        <>
            <div className="nf-content">
                <h1>Erro 404</h1>
                <h2>Oh não, parece que você se perdeu!</h2>
                <Image className='radar' src={Radar} alt='Gif de radar submarino'></Image>
                <Link id="voltar" href="/">Voltar para home</Link>
            </div>
        </>
    )
}
export default  notfound; 