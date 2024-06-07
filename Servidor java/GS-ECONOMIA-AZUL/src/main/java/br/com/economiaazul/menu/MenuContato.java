package br.com.economiaazul.menu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuContato implements Display {

    @Override
    public void exibir() throws Exception {
        List<String> opcoesMenu = new ArrayList<>();

        opcoesMenu.add("\n[ 0 ] - Voltar");
        opcoesMenu.add("[ 1 ] - Inserir Contato");
        opcoesMenu.add("[ 2 ] - Deletar Contato");
        opcoesMenu.add("[ 3 ] - Alterar Contato");
        opcoesMenu.add("[ 4 ] - Selecionar Contato");

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
                    System.out.println("\nOpção escolhida: Inserir Contato");
                    ContatoInserir contatoMenu = new ContatoInserir();
                    contatoMenu.exibirMenu();
                    break;

                case "2":
                    System.out.println("\nOpção escolhida: Deletar Contato");
                    ContatoDeletar contatoDeletar = new ContatoDeletar();
                    contatoDeletar.exibirMenu();
                    break;

                case "3":
                    System.out.println("\nOpção escolhida: Alterar Contato");
                     ContatoAlterar contatoAlterar = new ContatoAlterar();
                     contatoAlterar.exibirMenu();
                    break;

                case "4":
                    System.out.println("\nOpção escolhida: Selecionar Contato");
                    ContatoSelecionar contatoSelecionar = new ContatoSelecionar();
                    contatoSelecionar.exibirMenu();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        }
    }
}
