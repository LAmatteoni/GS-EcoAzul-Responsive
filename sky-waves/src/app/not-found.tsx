import './../../../sky-waves/public/css/notfound.css'

const notfound = () =>{
    return(
        <>
            <div className="nf-content">
                <h1>Erro 404</h1>
                <h2>Oh não, parece que você se perdeu!</h2>
                <div className="newtons-cradle">
                    <div className="newtons-cradle__dot"></div>
                    <div className="newtons-cradle__dot"></div>
                    <div className="newtons-cradle__dot"></div>
                    <div className="newtons-cradle__dot"></div>
                </div>
                    <a id="voltar" href="/">Voltar para home</a>
            </div>
        </>
    )
}
export default  notfound; 