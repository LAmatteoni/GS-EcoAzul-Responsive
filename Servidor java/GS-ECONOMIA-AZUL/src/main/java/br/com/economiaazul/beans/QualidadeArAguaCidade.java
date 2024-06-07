package br.com.economiaazul.beans;

public class QualidadeArAguaCidade {
    private String idCidade;
    private String cidade;
    private String regiao;
    private String entidade;
    private String qualidadeAr;
    private String poluicaoAgua;

    public QualidadeArAguaCidade() {
        super();
    }

    public QualidadeArAguaCidade(String idCidade, String cidade, String regiao, String entidade, String qualidadeAr, String poluicaoAgua) {
        this.idCidade = idCidade;
        this.cidade = cidade;
        this.regiao = regiao;
        this.entidade = entidade;
        this.qualidadeAr = qualidadeAr;
        this.poluicaoAgua = poluicaoAgua;
    }

    public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public String getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(String qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public String getPoluicaoAgua() {
        return poluicaoAgua;
    }

    public void setPoluicaoAgua(String poluicaoAgua) {
        this.poluicaoAgua = poluicaoAgua;
    }

    @Override
    public String toString() {
        return "QualidadeArAguaCidade{" +
                "idCidade='" + idCidade + '\'' +
                ", cidade='" + cidade + '\'' +
                ", regiao='" + regiao + '\'' +
                ", entidade='" + entidade + '\'' +
                ", qualidadeAr='" + qualidadeAr + '\'' +
                ", poluicaoAgua='" + poluicaoAgua + '\'' +
                '}';
    }
}
