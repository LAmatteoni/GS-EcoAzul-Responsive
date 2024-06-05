
import Image from 'next/image';
import logo from './../../../public/assets/logo.png'
import logoFiap from './../../../public/assets/fiap-logo.svg'
import '../../../public/css/footer.css'
import Link from 'next/link';

const Footer = () => {
    return(
        <>
            <footer>
                <hr id='linha-footer'/>
                <div className="menu-navegacao">
                    <nav className='menu-footer'>
                        <ul>
                            <li><Link href="/">Home</Link></li>
                            <li><Link href="./../Game">Game</Link></li>
                            <li><Link href="./../Ranking">Ranking</Link></li>
                            <li><Link href="./../Sobre-Nos">Sobre Nós</Link></li>
                        </ul>
                    </nav>
                </div>

                <div className="endereco-logos">
                    <address>FIAP, 7th floor - Torre A, R. Fidêncio Ramos, 308 - Vila Olímpia, São Paulo - SP, 04551-000</address>
                    <div className="logos-footer">
                        <Link href={'/'}><Image className='logoSW' src={logo} width={100} height={100} alt='Logo'/></Link>
                        <Link href={'https://www.fiap.com.br/'} target='_blank'><Image className='logoFiap' src={logoFiap} alt='Logo da FIAP'/></Link>
                    </div>
                </div>
                
                <div className="copyright">
                    <p>&copy; Copyright 2024 Sky Waves, Inc.</p>
                </div>
            </footer>
        </>
    )
}
export default Footer;