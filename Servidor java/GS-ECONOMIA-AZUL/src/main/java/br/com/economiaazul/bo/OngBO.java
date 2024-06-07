package br.com.economiaazul.bo;

import java.sql.SQLException;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.dao.OngDAO;
import br.com.economiaazul.exceptions.EnderecoDatabase;

public class OngBO {
	
	 private OngDAO ongDAO;
	 
	 public OngBO() throws ClassNotFoundException, SQLException {
	        this.ongDAO = new OngDAO();
	    }
	 
	 public void inserirBO(Ong ong) throws EnderecoDatabase {
		 ongDAO.inserir(ong);
	 }
	
}
