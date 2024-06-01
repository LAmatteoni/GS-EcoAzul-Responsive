'use client'

import Image from 'next/image';
import logo from './../../../public/assets/logo.png'
import menuHamburguer from './../../../public/assets/menuHamburguer.png'
import { useState } from 'react';
import Link from 'next/link';

    
const Header = () => {
    const [isOpen, setIsOpen] = useState(false);

    const toggleMenu = () => {
        setIsOpen(!isOpen);
    };
    return(
        <>
            <header>
                <div className="logo">
                    <Link href={"/"}>
                        <Image src={logo} width={100} height={100} alt="Logo da Salesforce"/>
                    </Link>
                </div>
                <div className="botoes-menu">
                    <label className="hamburger" onClick={toggleMenu}><Image src={menuHamburguer} alt='botão do menu hamburguer' className='imagemBurguer'/></label>
                    {isOpen && (
                        <nav className="menu-header">
                            <ul>
                                <li><Link href="/">Home</Link></li>
                                <li><Link href="./../Sobre-Nos">Sobre Nós</Link></li>
                                <li><Link href="./../Game">Game</Link></li>
                                <li><Link href="./../Ranking">Ranking</Link></li>
                                <li><Link href="./../ONGs">ONGs</Link></li>
                            </ul>
                        </nav>
                    )}
                    <nav className="menu-header-tela-maior">
                        <ul>
                            <li><Link href="/">Home</Link></li>
                            <li><Link href="./../Sobre-Nos">Sobre Nós</Link></li>
                            <li><Link href="./../Game">Game</Link></li>
                            <li><Link href="./../Ranking">Ranking</Link></li>
                            <li><Link href="./../ONGs">ONGs</Link></li>
                        </ul>
                    </nav>
                </div>
            </header>  
        </>
    )
}
export default Header;