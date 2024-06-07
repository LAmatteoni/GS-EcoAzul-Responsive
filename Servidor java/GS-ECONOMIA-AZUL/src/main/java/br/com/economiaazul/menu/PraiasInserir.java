package br.com.economiaazul.menu;

import br.com.economiaazul.beans.Praias;
import br.com.economiaazul.dao.PraiasDAO;
import br.com.economiaazul.exceptions.DatabaseException;

import java.util.Scanner;
import java.util.UUID;

public class PraiasInserir {

    public Praias exibirMenu() throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====================");
        System.out.println("-------PRAIAS-----");
        System.out.println("====================\n");


        System.out.println("Informe o nome da praia: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o pais: ");
        String pais = scanner.nextLine();

        System.out.println("Informe o  status da praia: ");
        String status = scanner.nextLine();

        Praias praias = new Praias();

        praias.setIdPraia(UUID.randomUUID().toString());
        praias.setNome(nome);
        praias.setPais(pais);
        praias.setStBanho(status);

        try {
            PraiasDAO praiasDAO = new PraiasDAO();
            String resultado = praiasDAO.inserir(praias);
            System.out.println(resultado);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
        }

        System.out.println("\n" + praias.toString());

        return praias;
    }
}
