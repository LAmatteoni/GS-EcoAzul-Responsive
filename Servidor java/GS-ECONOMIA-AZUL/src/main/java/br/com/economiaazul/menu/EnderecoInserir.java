package br.com.economiaazul.menu;

import java.util.Scanner;
import java.util.UUID;

import br.com.economiaazul.dao.EnderecoDAO;
import br.com.economiaazul.beans.Endereco;
import br.com.economiaazul.service.ViaCepService;

public class EnderecoInserir {
	public Endereco exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------ENDEREÇO-----");
		System.out.println("====================\n");

		System.out.println("Informe o cep: ");
		String cep = scanner.nextLine();


		Endereco endereco = new Endereco();

		endereco.setIdEndereco(UUID.randomUUID().toString());
		endereco.setCep(cep);
	
		
		ViaCepService viaCepService = new ViaCepService();

        try {
            Endereco enderecoVia = viaCepService.getContatoUsuario(cep);
            endereco.setLougradouro(enderecoVia.getLougradouro());
			endereco.setComplemento(enderecoVia.getComplemento());
			endereco.setBairro(enderecoVia.getBairro());
            endereco.setLocalidade(enderecoVia.getLocalidade());
			endereco.setUf(enderecoVia.getUf());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO AO CONSULTAR O CEP");
        }

		try {
			EnderecoDAO enderecoDAO = new EnderecoDAO();
			String resultado = enderecoDAO.inserir(endereco);
			System.out.println(resultado);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
		}

		System.out.println("\n" + endereco.toString());

		return endereco;

	}
}
