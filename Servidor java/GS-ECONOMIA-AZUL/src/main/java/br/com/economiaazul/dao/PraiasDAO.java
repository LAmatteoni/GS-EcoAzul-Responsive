package br.com.economiaazul.dao;

import br.com.economiaazul.beans.Praias;
import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.DatabaseException;
import br.com.economiaazul.exceptions.EnderecoDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PraiasDAO {

    private Connection minhaConexao;

    public PraiasDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConnectFactory().conexao();
    }
    public String inserir(Praias praias) throws EnderecoDatabase, DatabaseException {
        PreparedStatement statement;
        try {
            statement = minhaConexao.prepareStatement(
                    "INSERT INTO t_gs_praias(id_praia, nome, pais, st_banho) " +
                            "VALUES (?, ?, ?, ?)");

            statement.setString(1, praias.getIdPraia());
            statement.setString(2, praias.getNome());
            statement.setString(3, praias.getPais());
            statement.setString(4, praias.getStBanho());
            statement.execute();
            statement.close();

            return "\nCadastrado com Sucesso";
        } catch (SQLException e) {
            throw new DatabaseException("Erro no cadastro", e);
        }
    }

}
