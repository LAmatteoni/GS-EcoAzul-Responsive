package br.com.economiaazul.menu;

import java.util.List;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.dao.OngDAO;

public class ListaOng implements Display {

	@Override
	public void exibir() throws Exception {
		System.out.println("\n====================");
		System.out.println("-------LISTA DE ONG-----");
		System.out.println("====================\n");

		OngDAO ongDAO = new OngDAO();

		List<Ong> listaOngs = ongDAO.listarOngs();

		for (Ong ong : listaOngs) {
			System.out.println(ong);
		}
	}

}
