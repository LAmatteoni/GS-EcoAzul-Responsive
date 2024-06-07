'use client'

import Image from 'next/image';
import logo from './../../../public/assets/logo.png'
import menuHamburguer from './../../../public/assets/menuHamburguer.svg'
import { useState,useEffect } from 'react';
import Link from 'next/link';
import './../../../public/css/header.css'

    
const Header = () => {
    const [isOpen, setIsOpen] = useState(false);
    const [hasBackground, setHasBackground] = useState(false);

    const toggleMenu = () => {
        setIsOpen(!isOpen);
    };

    useEffect(() => {
        const handleScroll = () => {
            const threshold = 30;
            const scrollPosition = window.scrollY;

            setHasBackground(scrollPosition > threshold);
        };

        window.addEventListener('scroll', handleScroll);

        return () => window.removeEventListener('scroll', handleScroll);
    }, []);

    return(
        <>
            <div className={`sobreposto ${hasBackground? 'scroll-fundo' : ''}`}>
                <header>
                    <div className="logo">
                        <Link href={"/"}>
                            <Image className='logoSW' src={logo} width={100} height={100} alt="Logo"/>
                        </Link>
                    </div>
                    <div className="botoes-menu">
                        <label className="hamburger" onClick={toggleMenu}><Image src={menuHamburguer} alt='botão do menu hamburguer' className='imagemBurguer'/></label>
                        {isOpen && (
                            <nav className="menu-header">
                                <ul>
                                    <li><Link className='menu-link' href="/">Home</Link></li>
                                    <li><Link className='menu-link' href="./../Game">Game</Link></li>
                                    <li><Link className='menu-link' href="./../Ongs">ONGs</Link></li>
                                    <li><Link className='menu-link' href="./../Sobre-Nos">Sobre Nós</Link></li>
                                </ul>
                            </nav>
                        )}
                        <nav className="menu-header-tela-maior">
                            <ul>
                                <li><Link className={`menu-link-tela-maior ${hasBackground? 'menu-scroll' : ''}`} href="/">Home</Link></li>
                                <li><Link className={`menu-link-tela-maior ${hasBackground? 'menu-scroll' : ''}`} href="./../Game">Game</Link></li>
                                <li><Link className={`menu-link-tela-maior ${hasBackground? 'menu-scroll' : ''}`} href="./../Ongs">ONGs</Link></li>
                                <li><Link className={`menu-link-tela-maior ${hasBackground? 'menu-scroll' : ''}`} href="./../Sobre-Nos">Sobre Nós</Link></li>
                            </ul>
                        </nav>
                    </div>
                </header> 
            </div> 
        </>
    )
}
export default Header;