package br.com.economiaazul.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEndereco {

	 public void exibir() throws Exception {
	        List<String> opcoesMenu = new ArrayList<>();

	        opcoesMenu.add("\n[ 0 ] - Voltar");
	        opcoesMenu.add("[ 1 ] - Inserir Endereco");
	        opcoesMenu.add("[ 2 ] - Deletar Endereco");
	        opcoesMenu.add("[ 3 ] - Alterar Endereco");
	        opcoesMenu.add("[ 4 ] - Selecionar Endereco");

	        Boolean exibindoMenu = true;

	        Scanner scanner = new Scanner(System.in);

	        while (exibindoMenu) {
	            for (String op : opcoesMenu) {
	                System.out.println(op);
	            }

	            System.out.print("\nEscolha uma opção para operar: ");
	            String opcaoEscolhida = scanner.next();

	            switch (opcaoEscolhida) {
	                case "0":
	                    exibindoMenu = false;
	                    System.out.println("Voltando para o menu principal...");
	                    break;

	                case "1":
	                    System.out.println("\nOpção escolhida: Inserir Endereço");
	                    EnderecoInserir enderecoInserir = new EnderecoInserir();
	                    enderecoInserir.exibirMenu();
	                    break;

	                case "2":
	                    System.out.println("\nOpção escolhida: Deletar Endereço");
	                    EnderecoDeletar enderecoDeletar = new EnderecoDeletar();
	                    enderecoDeletar.exibirMenu();
	                    break;

	                case "3":
	                    System.out.println("\nOpção escolhida: Alterar Endereço");
	                    EnderecoAlterar enderecoAlterar = new EnderecoAlterar();
	                    enderecoAlterar.exibirMenu();
	                    break;

	                case "4":
	                    System.out.println("\nOpção escolhida: Selecionar Endereço");
	                    EnderecoSelecionar enderecoSelecionar = new EnderecoSelecionar();
	                    enderecoSelecionar.exibirMenu();
	                    break;

	                default:
	                    System.out.println("Opção inválida, tente novamente.");
	                    break;
	            }

	        }
	    }
}
