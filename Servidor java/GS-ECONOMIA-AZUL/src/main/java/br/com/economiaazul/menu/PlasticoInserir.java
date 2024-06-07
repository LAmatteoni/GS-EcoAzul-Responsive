package br.com.economiaazul.menu;

import br.com.economiaazul.beans.PlasticoProduzido;
import br.com.economiaazul.beans.Praias;
import br.com.economiaazul.dao.PlasticosProduzidoDAO;
import br.com.economiaazul.dao.PraiasDAO;

import java.util.Scanner;
import java.util.UUID;

public class PlasticoInserir {

    public PlasticoProduzido exibirMenu() throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====================");
        System.out.println("-------Plastico-Produzido-----");
        System.out.println("====================\n");


        System.out.println("Informe o ano: ");
        double ano = scanner.nextDouble();

        System.out.println("Informe a produção anual: ");
        double anual = scanner.nextDouble();

        PlasticoProduzido plastico = new PlasticoProduzido();

        plastico.setIdAno(UUID.randomUUID().toString());
        plastico.setAno(ano);
        plastico.setProducaoAnual(anual);

        try {
            PlasticosProduzidoDAO plasticoDAO = new PlasticosProduzidoDAO();
            String resultado = plasticoDAO.inserir(plastico);
            System.out.println(resultado);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
        }

        System.out.println("\n" + plastico.toString());

        return plastico;
    }
}
