package br.com.economiaazul.service;

import java.sql.SQLException;
import java.util.List;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.dao.OngDAO;

public class OngService {

	private OngDAO ongDAO;

    public OngService() throws ClassNotFoundException, SQLException {
        this.ongDAO = new OngDAO();
    }

    public List<Ong> listarOngs() {
        return ongDAO.listarOngs();
    }
}