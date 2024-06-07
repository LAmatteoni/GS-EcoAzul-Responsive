package br.com.economiaazul.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayMenu implements Display {

    @Override
    public void exibir() throws Exception {
        List<String> opcoesMenu = new ArrayList<>();

        opcoesMenu.add("\n[ 0 ] - Sair");
        opcoesMenu.add("[ 1 ] - Contato");
        opcoesMenu.add("[ 2 ] - Endereco");
        opcoesMenu.add("[ 3 ] - Ong");
        opcoesMenu.add("[ 4 ] - Praias");
        opcoesMenu.add("[ 5 ] - Plastico Produzido");
        opcoesMenu.add("[ 6 ] - Qualidade");

        Boolean exibindoMenu = true;

        Scanner scanner = new Scanner(System.in);

        while (exibindoMenu) {
            for (String op : opcoesMenu) {
                System.out.println(op);
            }

            System.out.print("Escolha uma opção para operar: ");
            String opcaoEscolhida = scanner.next();

            switch (opcaoEscolhida) {
                case "0":
                    exibindoMenu = false;
                    System.out.println("PROGRAMA FECHADO");
                    break;

                case "1":
                    MenuContato contatoDisplay = new MenuContato();
                    contatoDisplay.exibir();
                    ;
                    break;

                case "2":
                    MenuEndereco enderecoDisplay = new MenuEndereco();
                    enderecoDisplay.exibir();
                    break;
                case "3":
                    ListaOng menuOng = new ListaOng();
                    menuOng.exibir();
                    break;

                case "4":
                    PraiasInserir praiasInserir = new PraiasInserir();
                    praiasInserir.exibirMenu();
                    break;

                case "5":
                    PlasticoInserir plasticoInserir = new PlasticoInserir();
                    plasticoInserir.exibirMenu();
                    break;

                case "6":
                    QualidadeInserir qualidadeInserir = new QualidadeInserir();
                    qualidadeInserir.exibirMenu();
                    break;

                default:
                    break;
            }

        }


    }

}
