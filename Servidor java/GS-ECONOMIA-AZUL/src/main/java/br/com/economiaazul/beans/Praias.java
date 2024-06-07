package br.com.economiaazul.beans;

public class Praias {

    private String idPraia;
    private String nome;
    private String pais;
    private String stBanho;

    public Praias() {
        super();
    }

    public Praias(String idPraia, String nome, String pais, String stBanho) {
        this.idPraia = idPraia;
        this.nome = nome;
        this.pais = pais;
        this.stBanho = stBanho;
    }

    public String getIdPraia() {
        return idPraia;
    }

    public void setIdPraia(String idPraia) {
        this.idPraia = idPraia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getStBanho() {
        return stBanho;
    }

    public void setStBanho(String stBanho) {
        this.stBanho = stBanho;
    }

    @Override
    public String toString() {
        return "PRAIA{" +
                "\nidPraia: " + idPraia +
                "\nnome: " + nome +
                "\npais: " + pais +
                "\nstBanho: " + stBanho +
                '}';
    }
}
