package br.com.economiaazul.beans;

public class PlasticoProduzido {

    private String idAno;
    private double ano;
    private double producaoAnual;

    public PlasticoProduzido() {
        super();
    }

    public PlasticoProduzido(String idAno, double ano, double producaoAnual) {
        this.idAno = idAno;
        this.ano = ano;
        this.producaoAnual = producaoAnual;
    }

    public String getIdAno() {
        return idAno;
    }

    public void setIdAno(String idAno) {
        this.idAno = idAno;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public double getProducaoAnual() {
        return producaoAnual;
    }

    public void setProducaoAnual(double producaoAnual) {
        this.producaoAnual = producaoAnual;
    }

    @Override
    public String toString() {
        return "PlasticoProduzido{" +
                "idAno='" + idAno +
                "\nano=" + ano +
                "\nproducaoAnual=" + producaoAnual +
                '}';
    }
}
