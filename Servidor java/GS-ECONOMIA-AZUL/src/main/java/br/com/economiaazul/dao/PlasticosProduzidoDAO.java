package br.com.economiaazul.dao;

import br.com.economiaazul.beans.PlasticoProduzido;
import br.com.economiaazul.beans.Praias;
import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.DatabaseException;
import br.com.economiaazul.exceptions.EnderecoDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlasticosProduzidoDAO {

    private Connection minhaConexao;

    public PlasticosProduzidoDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConnectFactory().conexao();
    }
    public String inserir(PlasticoProduzido plastico) throws EnderecoDatabase, DatabaseException {
        PreparedStatement statement;
        try {
            statement = minhaConexao.prepareStatement(
                    "INSERT INTO T_GS_Plastico_Produzido(id_ano, ano,  producao_anual) " +
                            "VALUES (?, ?, ?)");

            statement.setString(1, plastico.getIdAno());
            statement.setDouble(2, plastico.getAno());
            statement.setDouble(3, plastico.getProducaoAnual());
            statement.execute();
            statement.close();

            return "\nCadastrado com Sucesso";
        } catch (SQLException e) {
            throw new DatabaseException("Erro no cadastro", e);
        }
    }

}
