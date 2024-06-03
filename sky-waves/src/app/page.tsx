
import Link from 'next/link'
import './../../public/css/home.css'

export default function Home() {
  return(
    <>
      <section className="oceano">
        <h1>O oceano depende de você</h1>
      </section>

      <section className='home-container'>
        <div className="home-texto">
          <h2>O que está acontecendo?</h2>

          <p>
            "A natureza tem capacidade de se reconstruir e refazer, no caso dos oceanos isso não é diferente, no entanto, nas últimas três décadas as águas marinhas ingressaram em um intenso processo de poluição, os níveis se elevaram de tal forma que os oceanos e mares já não conseguem se regenerar. As águas dos oceanos e mares são contaminadas e poluídas, principalmente, pelos dejetos introduzidos pelos rios que, em sua maioria, deságuam no litoral, desse modo, a poluição pode ser emitida em grandes distâncias, porém seus reflexos são percebidos em áreas costeiras."
          </p>
          <span>
            Veja mais sobre "Poluição Oceânica" em: <Link href={"https://brasilescola.uol.com.br/geografia/poluicao-oceanica.htm"} target='new'>https://brasilescola.uol.com.br/geografia/poluicao-oceanica.htm</Link>
          </span>
        </div>

          <hr />

        <div className="economia-azul">
          <h2>Economia Azul</h2>

          <ol>
            <li>Introdução</li>
            <li>O que é a Economia Azul?</li>
            <li>Impacto Econômico</li>
            <li>Aquicultura e Pescas</li>
            <li>Turismo, Cruzeiros e Pesca Recreativa</li>
            <li>Tecnologia na Economia Azul</li>
            <li>Crescimento Azul</li>
            <li>Governo Nacional e Ação Organizacional Internacional</li>
          </ol>
        </div>
      </section>
    </>
  )
}
