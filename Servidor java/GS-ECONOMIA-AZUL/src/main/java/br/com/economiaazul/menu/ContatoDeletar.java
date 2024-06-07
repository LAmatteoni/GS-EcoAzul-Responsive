package br.com.economiaazul.menu;

import java.util.Scanner;

import br.com.economiaazul.beans.Contato;
import br.com.economiaazul.dao.ContatoDAO;
import br.com.economiaazul.exceptions.DatabaseException;

public class ContatoDeletar {

	public Contato exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");

		System.out.println("Informe o id para deletar: ");

		String id = scanner.nextLine();

		Contato contato = new Contato();

		contato.setIdContato(id);

		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			String resultado = contatoDAO.deletar(contato);
			System.out.println(resultado);
		} catch (ClassNotFoundException | DatabaseException e) {
			e.printStackTrace();
			System.out.println("ERRO AO DELETAR INFORMAÇÕES: " + e.getMessage());
		}

		System.out.println("\n" + contato.getIdContato() + "\n INFORMAÇÕES DELETADA");

		return contato;
	}
}
