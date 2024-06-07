package br.com.economiaazul.dao;

import br.com.economiaazul.beans.PlasticoProduzido;
import br.com.economiaazul.beans.QualidadeArAguaCidade;
import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.DatabaseException;
import br.com.economiaazul.exceptions.EnderecoDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QualidadeDAO {

    private Connection minhaConexao;

    public QualidadeDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConnectFactory().conexao();
    }
    public String inserir(QualidadeArAguaCidade qualidade) throws EnderecoDatabase, DatabaseException {
        PreparedStatement statement;
        try {
            statement = minhaConexao.prepareStatement(
                    "INSERT INTO T_GS_QUALIDADE_AR_AGUA_CIDADE(id_cidade, cidade, regiao, entidade, qualidade_do_ar, poluicao_agua) " +
                            "VALUES (?, ?, ?, ?, ?, ?)");

            statement.setString(1, qualidade.getIdCidade());
            statement.setString(2, qualidade.getCidade());
            statement.setString(3, qualidade.getRegiao());
            statement.setString(4, qualidade.getEntidade());
            statement.setString(5, qualidade.getQualidadeAr());
            statement.setString(6, qualidade.getPoluicaoAgua());
            statement.execute();
            statement.close();

            return "\nCadastrado com Sucesso";
        } catch (SQLException e) {
            throw new DatabaseException("Erro no cadastro", e);
        }
    }

}
