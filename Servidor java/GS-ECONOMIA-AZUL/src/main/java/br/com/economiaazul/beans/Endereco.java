package br.com.economiaazul.beans;

public class Endereco {
	
	private String idEndereco;
	private String cep;
	private String lougradouro;
	private String complemento;
	private  String bairro;
	private String localidade;
	private String uf;


	public Endereco() {
		super();
	}


	public Endereco(String idEndereco, String cep, String lougradouro, String complemento, String bairro, String localidade, String uf) {
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.lougradouro = lougradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	public String getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(String idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "ID: " + idEndereco + "\ncep: " + cep + "\nlougradouro: "
				+ lougradouro + "\nComplemento: " + complemento + "\nBairro: " + bairro +
				"\nLocalidade: " + localidade + "\nUF: " + uf ;
	}


}
