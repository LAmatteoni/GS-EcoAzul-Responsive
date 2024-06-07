package br.com.economiaazul.menu;

import br.com.economiaazul.beans.PlasticoProduzido;
import br.com.economiaazul.beans.QualidadeArAguaCidade;
import br.com.economiaazul.dao.PlasticosProduzidoDAO;
import br.com.economiaazul.dao.QualidadeDAO;

import java.util.Scanner;
import java.util.UUID;

public class QualidadeInserir {
    public QualidadeArAguaCidade exibirMenu() throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====================");
        System.out.println("-------QUALIDADE-DE-AR-AGUA-CIDADE-----");
        System.out.println("====================\n");


        System.out.println("Informe a cidade: ");
        String  cidade = scanner.nextLine();

        System.out.println("Informe a região: ");
        String  regiao = scanner.nextLine();

        System.out.println("Informe a entidade: ");
        String  entidade = scanner.nextLine();

        System.out.println("Informe a qualidade do ar: ");
        String  qualidade = scanner.nextLine();

        System.out.println("Informe a poluição da agua: ");
        String  poluicao = scanner.nextLine();



        QualidadeArAguaCidade qualidadeAr = new QualidadeArAguaCidade();

        qualidadeAr.setIdCidade(UUID.randomUUID().toString());
        qualidadeAr.setCidade(cidade);
        qualidadeAr.setRegiao(regiao);
        qualidadeAr.setEntidade(entidade);
        qualidadeAr.setQualidadeAr(qualidade);
        qualidadeAr.setPoluicaoAgua(poluicao);

        try {
            QualidadeDAO qualidadeDAO = new QualidadeDAO();
            String resultado = qualidadeDAO.inserir(qualidadeAr);
            System.out.println(resultado);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERRO NO CADASTRO DE CONTATO: " + e.getMessage());
        }

        System.out.println("\n" + qualidadeAr.toString());

        return qualidadeAr;
    }
}
