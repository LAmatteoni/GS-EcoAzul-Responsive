package br.com.economiaazul.menu;

import java.util.Scanner;


import br.com.economiaazul.dao.EnderecoDAO;
import br.com.economiaazul.beans.Endereco;

public class EnderecoDeletar {
	
	public Endereco exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------ENDEREÇO-----");
		System.out.println("====================\n");

		System.out.println("Informe o id para deletar: ");
		String id = scanner.nextLine();


		Endereco endereco = new Endereco();

		endereco.setIdEndereco(id);

		try {
			EnderecoDAO enderecoDAO = new EnderecoDAO();
			String resultado = enderecoDAO.deletar(endereco);
			System.out.println(resultado);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
		}
		return endereco;


	}
	
}
