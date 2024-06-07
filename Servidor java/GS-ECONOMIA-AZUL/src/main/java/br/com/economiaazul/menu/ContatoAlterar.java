package br.com.economiaazul.menu;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

import br.com.economiaazul.beans.Contato;
import br.com.economiaazul.dao.ContatoDAO;
import br.com.economiaazul.exceptions.DatabaseException;

public class ContatoAlterar {

	public Contato exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");

		System.out.println("Informe o seu Email: ");
		String email = scanner.nextLine();

		System.out.println("Informe o seu telefone: ");
		String telefone = scanner.nextLine();

		System.out.println("Informe o ID: ");
		String idContato = scanner.nextLine();

		Contato contato = new Contato();

		contato.setEmail(email);
		contato.setTelefone(telefone);
		contato.setIdContato(idContato);

		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			String resultado = contatoDAO.alterar(contato);
			System.out.println(resultado);
		} catch (ClassNotFoundException | SQLException | DatabaseException e) {
			e.printStackTrace();
			System.out.println("ERRO AO ALTERAR CONTATO: " + e.getMessage());
		}

		System.out.println("\n" + contato.toString());

		return contato;

	}
}
