package br.com.economiaazul.menu;

import java.util.Scanner;

import br.com.economiaazul.dao.EnderecoDAO;
import br.com.economiaazul.exceptions.DatabaseException;
import br.com.economiaazul.beans.Endereco;

public class EnderecoSelecionar {

	public Endereco exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------ENDEREÇO-----");
		System.out.println("====================\n");

		System.out.println("Informe o id: ");
		String idEndereco = scanner.nextLine();

		System.out.println("Informe o cep: ");
		String cep = scanner.nextLine();


		Endereco endereco = new Endereco();

		endereco.setIdEndereco(idEndereco);
		endereco.setCep(cep);


		try {
			EnderecoDAO enderecoDAO = new EnderecoDAO();
			endereco = enderecoDAO.selecionar(idEndereco);
			if (endereco != null) {
				System.out.println("Contato encontrado: \n" + endereco.toString());
			} else {
				System.out.println("Contato não encontrado.");
			}
		} catch (ClassNotFoundException | DatabaseException e) {
			e.printStackTrace();
			System.out.println("ERRO AO SELECIONAR CONTATO: " + e.getMessage());
		}


		System.out.println("\n" + endereco.toString());

		return endereco;

	}
}
