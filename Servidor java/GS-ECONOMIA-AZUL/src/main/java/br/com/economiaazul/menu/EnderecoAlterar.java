package br.com.economiaazul.menu;

import java.util.Scanner;

import br.com.economiaazul.dao.EnderecoDAO;
import br.com.economiaazul.beans.Endereco;
import br.com.economiaazul.service.ViaCepService;

public class EnderecoAlterar {
	
	public Endereco exibirMenu() throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================");
		System.out.println("-------CONTATO-----");
		System.out.println("====================\n");



		System.out.println("Informe o cep: ");
		String cep = scanner.nextLine();

		System.out.println("Informe o ID: ");
		String idEndereco = scanner.nextLine();


		Endereco endereco = new Endereco();

		endereco.setCep(cep);
		endereco.setIdEndereco(idEndereco);


		ViaCepService viaCepService = new ViaCepService();

        try {
            Endereco enderecoVia = viaCepService.getContatoUsuario(cep);
            endereco.setLougradouro(enderecoVia.getLougradouro());
            endereco.setBairro(enderecoVia.getBairro());
            endereco.setComplemento(enderecoVia.getComplemento());
            endereco.setLocalidade(enderecoVia.getLocalidade());
			endereco.setUf(enderecoVia.getUf());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO AO CONSULTAR O CEP");
        }



		try {
			EnderecoDAO enderecoDAO = new EnderecoDAO();
			String resultado = enderecoDAO.alterar(endereco);
			System.out.println(resultado);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
		}

		return endereco;
	}
}
