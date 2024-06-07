
import './../../../public/css/game.css'
import Image from 'next/image'
import Personagens from './../../../public/assets/personagens.png'
import Exemplo_fase from './../../../public/assets/exemplo_fase.png'
import Exemplo_lixo from './../../../public/assets/exemplo_lixo.png'

const Game = () => {
    return(
        <>
            <div className="container-game">
                <h1>Oceano em Perigo</h1>

                <div className="sobre-game">
                    <h2>Sobre o jogo</h2>
                    <div className="conteudo-game">
                        <h3>Visão Geral</h3>
                        <p>"Oceano em Perigo" é um jogo educativo de conscientização ambiental, projetado para dispositivos móveis e compatível com VR. O jogador assume o papel de um pesquisador marinho, explorando os oceanos do mundo, documentando e analisando a poluição, e observando os impactos ambientais nos ecossistemas marinhos. O objetivo é educar o jogador sobre a importância da preservação dos oceanos e incentivar ações para reduzir a poluição marinha.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Ambientação e Cenários</h3>
                        <p>O jogo apresenta vários ambientes marinhos realistas, como recifes de corais, águas abertas, zonas costeiras e profundezas abissais. Cada ambiente está repleto de vida marinha detalhada e possui diferentes desafios e tipos de poluição para o jogador investigar.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Personagens Principais</h3>
                        <p><b>Jogador (Pesquisador Marinho):</b> Um cientista dedicado à preservação dos oceanos.</p>
                        <p><b>Inteligência Artificial Assistente (Aqua):</b> Um assistente virtual que fornece informações e orientações ao jogador.</p>
                        <p><b>Ambientalistas Locais:</b> NPCs que fornecem missões e compartilham histórias sobre os impactos locais da poluição.</p>
                        <div className="img-center">
                            <Image className="imgs-jogo" src={Personagens} alt='Personagens'/>
                        </div>
                    </div>

                    <div className="conteudo-game">
                        <h3>Mecânicas de Jogo</h3>
                        <p><b>Navegação e Exploração:</b> O jogador usa o celular ou um dispositivo VR para navegar por diferentes locais oceânicos. A interface intuitiva permite mover-se em 360 graus e mergulhar para explorar as profundezas.</p>
                        <p><b>Análise de Poluição:</b> Usando ferramentas virtuais, o jogador coleta amostras de água, fotografa áreas poluídas, e documenta a vida marinha afetada.</p>
                        <p><b>Telas Explicativas:</b> Após documentar uma área, o jogador vê uma tela explicativa mostrando o estado antes e depois do local, com informações detalhadas sobre o tipo de poluição e seus impactos.</p>
                        <p><b>Missões e Desafios:</b> Missões específicas são dadas pelos ambientalistas locais, como limpar uma área de lixo, restaurar um recife de coral, ou resgatar animais marinhos em perigo.</p>
                        <p><b>Educação e Conscientização:</b> Durante a exploração, Aqua fornece informações educativas sobre a biodiversidade marinha e os efeitos da poluição.</p>
                        <div className="img-flex">
                            <Image className="imgs-jogo-2" src={Exemplo_fase} alt='Exemplo de fase do jogo'/>
                            <Image className="imgs-jogo-2" src={Exemplo_lixo} alt='Exemplo de como o oceano fica após o lixo'/>
                        </div>
                    </div>
                </div>

                <div className="historia-game">
                    <div className="conteudo-game">
                        <h2>História do Jogo</h2>
                        <p>A narrativa principal do jogo é dividida em capítulos, cada um focando em uma região diferente do mundo e um tipo específico de poluição:</p>
                    </div>
                    <div className="conteudo-game">
                        <h3>Capítulo 1: Recifes de Coral na Grande Barreira de Corais</h3>
                        <p>O jogador documenta o branqueamento dos corais causado pelo aumento da temperatura da água e a poluição.</p>
                        <p><b>Missão:</b> Coletar dados sobre a temperatura da água e resíduos químicos.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Capítulo 2: Plásticos no Oceano Pacífico</h3>
                        <p>O jogador explora o Giro do Pacífico Norte, uma grande área coberta por detritos plásticos.</p>
                        <p><b>Missão:</b> Limpar áreas específicas e salvar animais marinhos presos em resíduos plásticos.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Capítulo 3: Derramamento de Óleo no Golfo do México</h3>
                        <p>O jogador documenta os efeitos de um derramamento de óleo recente.</p>
                        <p><b>Missão:</b> Limpar o óleo da superfície e ajudar na recuperação da vida marinha.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Capítulo 4: Zonas Mortas no Atlântico Norte</h3>
                        <p>O jogador investiga áreas com baixos níveis de oxigênio causados pela poluição de nutrientes.</p>
                        <p><b>Missão:</b> Analisar amostras de água e sugerir soluções para reduzir a poluição de nutrientes.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Capítulo 5: Impactos do Turismo nas Ilhas Maldivas</h3>
                        <p>O jogador examina os efeitos do turismo descontrolado nos ecossistemas marinhos locais.</p>
                        <p><b>Missão:</b> Educar turistas virtuais sobre práticas sustentáveis e ajudar a restaurar habitats danificados.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Finais Alternativos</h3>
                        <p>O final do jogo depende das ações do jogador ao longo da narrativa. Um final positivo mostra a recuperação dos ecossistemas marinhos e a conscientização global crescente sobre a importância da preservação dos oceanos. Um final negativo destaca as consequências devastadoras da inação e da continuação da poluição.</p>
                    </div>
                </div>

                <div className="recursos-educativos">
                    <div className="conteudo-game">
                        <h3>Recursos Educativos</h3>
                        <p><b>Galeria de Imagens:</b> Comparações visuais do "antes" e "depois" dos esforços de limpeza.</p>
                        <p><b>Documentários Curto:</b> Vídeos curtos integrados ao jogo que mostram histórias reais de poluição e recuperação.</p>
                        <p><b>Fatos e Dicas:</b> Informações e dicas práticas sobre como reduzir a poluição na vida diária.Fatos e Dicas: Informações e dicas práticas sobre como reduzir a poluição na vida diária.</p>
                    </div>

                    <div className="conteudo-game">
                        <h3>Integração com VR</h3>
                        <p>A versão VR do jogo oferece uma experiência imersiva, permitindo ao jogador sentir-se verdadeiramente submerso nos oceanos. O uso de controles de movimento torna a coleta de amostras e a limpeza de áreas poluídas mais interativas e envolventes.</p>

                        <p>"Oceano em Perigo" visa não apenas entreter, mas também educar e inspirar os jogadores a agir em prol da preservação dos mares e oceanos, promovendo uma compreensão mais profunda dos problemas ambientais que enfrentamos.</p>
                    </div>
                </div>

            </div>
        </>
    )
}
export default Game;