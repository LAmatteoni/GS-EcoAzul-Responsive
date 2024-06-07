
import Link from 'next/link'
import Image from 'next/image';
import Infografico from './../../public/assets/infografico.png'
import YouTubePlayer from './components/YoutubePlayer';
import './../../public/css/home.css'

export default function Home() {
  return(
    <>
      <section id="oceano">
        <h1>O oceano depende de você.</h1>
      </section>

      <section className='home-container'>
        <div className="home-texto">
          <h2>O que está acontecendo?</h2>

          <p>
            "A natureza tem capacidade de se reconstruir e refazer, no caso dos oceanos isso não é diferente, no entanto, nas últimas três décadas as águas marinhas ingressaram em um intenso processo de poluição, os níveis se elevaram de tal forma que os oceanos e mares já não conseguem se regenerar. As águas dos oceanos e mares são contaminadas e poluídas, principalmente, pelos dejetos introduzidos pelos rios que, em sua maioria, deságuam no litoral, desse modo, a poluição pode ser emitida em grandes distâncias, porém seus reflexos são percebidos em áreas costeiras."
          </p>
          <span>
            Veja mais sobre "Poluição Oceânica" em: <Link className='links' href={"https://brasilescola.uol.com.br/geografia/poluicao-oceanica.htm"} target='new'>https://brasilescola.uol.com.br/geografia/poluicao-oceanica.htm</Link>
          </span>
        </div>

          <hr />

        <div className="economia-azul">
          <h2>Economia Azul</h2>

          <ol>
            <li><Link className='links' href={"#introducao"}>Introdução</Link></li>
            <li><Link className='links' href={"#oqueEconoAzul"}>O que é a Economia Azul?</Link></li>
            <li><Link className='links' href={"#impactoEconomico"}>Impacto Econômico</Link></li>
            <li><Link className='links' href={"#Tecnologia"}>Tecnologia na Economia Azul</Link></li>
            <li><Link className='links' href={"#CrescimentoAzul"}>Crescimento Azul</Link></li>
          </ol>

          <div className="conteudo">
            <div id="introducao" className='mini-secoes'>
              <h3>1. Introdução</h3>
              <p>
                Os impérios eram completamente baseados na exploração de recursos naturais, bem como no comércio de bens de consumo (têxteis, especiarias, louças) e (infelizmente) escravos e dependiam do oceano para transporte. Até a revolução industrial foi impulsionada pelo petróleo do oceano, pois sem o óleo de espermacete para lubrificar as máquinas, a escala de produção não poderia ter mudado. Investidores, especuladores e a nascente indústria de seguros (Lloyd's de Londres) foram todos construídos a partir da participação no comércio marítimo internacional de especiarias, óleo de baleia e metais preciosos.
              </p>
              <p>
                Assim, investir na economia oceânica é quase tão antigo quanto a própria economia oceânica. Então, por que estamos falando como se houvesse algo novo? Por que estamos inventando a frase “a economia azul”? Por que achamos que há uma nova oportunidade de crescimento em uma “economia azul”?
              </p>
              <p>
                A (nova) Economia Azul refere-se a atividades econômicas baseadas e que são ativamente boas para o oceano, embora as definições variem. Enquanto o conceito de Economia Azul continua a mudar e se adaptar, o desenvolvimento econômico no oceano e nas comunidades costeiras pode ser projetado para servir como base para o desenvolvimento sustentável em todo o mundo.
              </p>

              <span>
                No centro do novo conceito de Economia Azul está a dissociação do desenvolvimento socioeconômico da degradação ambiental… de meios de subsistência sustentáveis.
                <br />
                Mark J. Spalding | fevereiro de 2016
              </span>

              <br />
              <Link href={"#oceano"} className='volta'>Voltar ao topo</Link>
            </div>

            <div id="oqueEconoAzul" className='mini-secoes'>
              <h3>2. O que é a Economia Azul?</h3>
              <YouTubePlayer videoId="ZsVxTrluCvI" />
              <span>
                Spalding, MJ (2021, 26 de maio) Investindo na Nova Economia Azul. A Fundação Oceano. Retirado de:
                <br />
                <Link className='links' href={"https://youtu.be/ZsVxTrluCvI"} target='new'>https://youtu.be/ZsVxTrluCvI</Link>
              </span>

              <p>
                A Ocean Foundation é parceira e consultora da Rockefeller Capital Management, ajudando a identificar empresas públicas cujos produtos e serviços atendam às necessidades de um relacionamento humano saudável com o oceano. O presidente da TOF, Mark J. Spalding, discute esta parceria e o investimento em uma economia azul sustentável em um recente webinar de 2021.
              </p>
              <p>
                A Economia Azul serve como estrutura e política para atividades econômicas marinhas sustentáveis, bem como novas tecnologias baseadas no mar. Este documento fornece uma visão abrangente, bem como estudos de caso teóricos e do mundo real, representando diversas regiões do mundo para fornecer um consenso da Economia Azul como um todo.
              </p>
              <p>
                Em uma breve introdução à Economia Azul, a emissora internacional da Deutsche Welle Alemanha fornece uma visão geral direta da multifacetada Economia Azul. Discutindo ameaças como pesca predatória, mudança climática e poluição plástica, o autor argumenta que o que é ruim para o oceano é ruim para a humanidade e ainda existem muitas áreas que precisam de cooperação contínua para proteger a vasta riqueza econômica do oceano.
              </p>

              <YouTubePlayer videoId="cmw4kvfUnZI" />
              <span>
                Organização das Nações Unidas para Agricultura e Alimentação. (2017, 3 de maio). Carta do Crescimento Azul em Cabo Verde. Nações Unidas. Retirado de:
                <br />
                <Link className='links' href={"https://www.youtube.com/watch?v=cmw4kvfUnZI"} target='new'>https://www.youtube.com/watch?v=cmw4kvfUnZI</Link>
              </span>

              <br />
              <Link href={"#oceano"} className='volta'>Voltar ao topo</Link>
            </div>

            <div id="impactoEconomico" className='mini-secoes'>
              <h3>3. Impacto Econômico</h3>

              <p>
                Novas orientações sobre títulos azuis para ajudar a desbloquear financiamento para uma economia oceânica sustentável | A Associação Internacional do Mercado de Capitais (ICMA), juntamente com a Corporação Financeira Internacional (IFC) - um membro do Grupo Banco Mundial, do Pacto Global das Nações Unidas, do Banco Asiático de Desenvolvimento e da UNEP FI desenvolveram um guia prático global para títulos para financiar o desenvolvimento sustentável. economia azul. Esta orientação voluntária fornece aos participantes do mercado critérios, práticas e exemplos claros para empréstimos e emissões de “títulos azuis”. Reunindo contributos dos mercados financeiros, da indústria oceânica e de instituições globais, fornece informações sobre os principais componentes envolvidos no lançamento de um “título azul” credível; como avaliar o impacto ambiental dos investimentos em “títulos azuis”; e as etapas necessárias para facilitar transações que preservem a integridade do mercado.
              </p>

              <p>
              O Sistema Mesoamericano de Barreiras de Corais (MBRS ou MAR) é o maior ecossistema de recifes da América e o segundo maior do mundo. O estudo considerou serviços de abastecimento, serviços culturais e serviços reguladores fornecidos pelos ecossistemas de recifes na região MAR e descobriu que o turismo e a recreação contribuíram com 4,092 milhões de dólares na região mesoamericana, com a pesca contribuindo com 615 milhões de dólares adicionais. Os benefícios anuais da proteção costeira equivaleram a 322.83-440.71 milhões de dólares. Este relatório é o resultado de quatro sessões de trabalho online em um workshop em janeiro de 2021 com mais de 100 participantes representando quatro países MAR: México, Belize, Guatemala e Honduras. O infográfigo do Sumário Executivo pode ser encontrados abaixo:
              </p>
              <div id="img-center">
                <Image className='infografico' src={Infografico} alt='Informativo'/>
              
              <span>Metroeconomica, The Ocean Foundation e WRI México. (2021, 15 de janeiro). Valoração Económica dos Ecossistemas Recifais da Região MAR e dos Bens e Serviços que Provêm, Relatório Final. Banco Interamericano de Desenvolvimento.</span>
              </div>
              <p>
                A Economia Azul como um modelo econômico baseado no oceano exige discussão sobre o papel de uma licença social para operar. O artigo argumenta que a licença social, por meio da aprovação pelas comunidades locais e partes interessadas, afeta a lucratividade de um projeto em relação à Economia Azul.
              </p>

              <br />
              <Link href={"#oceano"} className='volta'>Voltar ao topo</Link>
            </div>

            <div id="Tecnologia" className='mini-secoes'>
              <h3>4. Tecnologia na Economia Azul</h3>

              <p>
              Por meio de uma análise de alto nível das oportunidades de mercado potenciais, o Departamento de Energia dos EUA analisa a capacidade de novos recursos e desenvolvimento econômico em energia marítima. O relatório analisa o poder para indústrias offshore e nearshore, incluindo a alimentação de dessalinização, resiliência costeira e recuperação de desastres, aquicultura offshore e sistemas de energia para comunidades isoladas. Informações adicionais sobre tópicos de energia marinha, incluindo algas marinhas, dessalinização, resiliência costeira e sistemas de energia isolados podem ser encontradas.
              </p>
              <p>
              Michel e Noble discutem os avanços técnicos nas principais inovações na indústria de transporte marítimo comercial. Os autores enfatizam a necessidade de práticas ecologicamente corretas. As principais áreas de discussão no artigo incluem práticas atuais da indústria, design de navios, navegação e implementação bem-sucedida de tecnologias emergentes. A navegação e o comércio são os principais impulsionadores do crescimento dos oceanos e entender os transportes marítimos é essencial para alcançar uma Economia Azul sustentável.
              </p>

              <br />
              <Link href={"#oceano"} className='volta'>Voltar ao topo</Link>
            </div>

            <div id="CrescimentoAzul" className='mini-secoes'>
              <h3>5. Crescimento Azul</h3>

              <p>
              O crescimento azul estratégico proposto pela União Europeia busca atrair novas tecnologias e ideias de baixo impacto ambiental, além de levar em consideração as interações sociais necessárias para práticas sustentáveis. Em um estudo de caso de aquicultura no Mar do Norte holandês, os pesquisadores identificaram práticas que poderiam se beneficiar da inovação, ao mesmo tempo em que consideraram atitudes, promoveram a colaboração e exploraram os efeitos de longo prazo no meio ambiente. Embora ainda existam muitos desafios, incluindo a adesão de produtores locais, o artigo destaca a importância de um aspecto social na economia azul.
              </p>

              <p>
              A Agenda de Crescimento Azul da União Europeia analisa o fornecimento marinho de serviços ambientais, particularmente nas áreas de aquicultura, biotecnologia azul, energia azul e o fornecimento físico da extração de recursos minerais marinhos e turismo. Todos esses setores dependem de ecossistemas marinhos e costeiros saudáveis, que só são possíveis por meio da regulamentação e manutenção adequada dos serviços ambientais. Os autores argumentam que as oportunidades de Crescimento Azul requerem a negociação de compensações entre as limitações econômicas, sociais e ambientais, embora o desenvolvimento se beneficie de uma legislação administrativa adicional.
              </p>

              <br />
              <Link href={"#oceano"} className='volta'>Voltar ao topo</Link>
            </div>

          </div>
        </div>
      </section>
    </>
  )
}
