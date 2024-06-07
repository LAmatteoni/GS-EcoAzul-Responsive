package br.com.economiaazul.beans;

public class Contato {
	
	private String idContato;
	private String email;
	private String telefone;
	
	public Contato() {
		super();
	}

	
	public Contato(String idContato, String email, String telefone) {
		super();
		this.idContato = idContato;
		this.email = email;
		this.telefone = telefone;
	}


	
	public String getIdContato() {
		return idContato;
	}


	public void setIdContato(String idContato) {
		this.idContato = idContato;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Numero do ID: " + idContato +  "\nemail: " + email + "\ntelefone: " + telefone;
	}
	
	
	
	
	
}
