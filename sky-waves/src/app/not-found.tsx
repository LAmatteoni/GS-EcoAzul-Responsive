import Link from 'next/link';
import './../../../sky-waves/public/css/notfound.css'
import Radar from './../../public/assets/nerd.gif'

const notfound = () =>{
    return(
        <>
            <div className="nf-content">
                <h1>Erro 404</h1>
                <h2>Oh não, parece que você se perdeu!</h2>
                <a id="voltar" href="/">Voltar para home</a>
                <Link href={Radar}></Link>
            </div>
        </>
    )
}
export default  notfound; 