package br.com.economiaazul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.DatabaseException;
import br.com.economiaazul.exceptions.EnderecoDatabase;
import br.com.economiaazul.beans.Endereco;

public class EnderecoDAO {
    
    public Connection minhaConexao;
    
    public EnderecoDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConnectFactory().conexao(); 
    }
    
    public String inserir(Endereco endereco) throws EnderecoDatabase {
        PreparedStatement statement;
        try {
        	statement = minhaConexao.prepareStatement(
                    "INSERT INTO t_gs_endereco(idEndereco, cep, lougradouro, complemento, bairro, localidade, uf) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)");
            
        	statement.setString(1, endereco.getIdEndereco());
        	statement.setString(2, endereco.getCep());
        	statement.setString(3, endereco.getLougradouro());
        	statement.setString(4, endereco.getComplemento());
			statement.setString(5, endereco.getBairro());
			statement.setString(6, endereco.getLocalidade());
            statement.setString(7, endereco.getUf());
        	statement.execute();
        	statement.close();

            return "\nCadastrado com Sucesso";
        } catch (SQLException e) {
            throw new EnderecoDatabase("Erro no cadastro", e);
        }
    }
    
    
	public String deletar(Endereco endereco) throws DatabaseException {
		PreparedStatement statement;
		try {
			statement = minhaConexao.prepareStatement("delete from t_gs_endereco where idEndereco = ?");
			statement.setString(1, endereco.getIdEndereco());
			int rowsDeleted = statement.executeUpdate();
			statement.close();

			if (rowsDeleted > 0) {
				return "Contato deletado com sucesso";
			} else {
				return "Contato não encontrado";
			}
		} catch (SQLException e) {
			throw new DatabaseException("Erro ao deletar contato", e);
		}
	}

	
	public String alterar(Endereco endereco) throws DatabaseException {
		PreparedStatement statement;
		try {
			statement = minhaConexao
					.prepareStatement("update t_gs_endereco set cep = ?, lougradouro = ?, complemento = ? , bairro = ?, localidade = ?, uf = ? where idEndereco = ?");

			statement.setString(1, endereco.getCep());
			statement.setString(2, endereco.getLougradouro());
			statement.setString(3, endereco.getComplemento());
			statement.setString(4, endereco.getBairro());
			statement.setString(5, endereco.getLocalidade());
			statement.setString(6, endereco.getUf());
			statement.setString(7, endereco.getIdEndereco());


			int Updated = statement.executeUpdate();
			statement.close();

			if (Updated > 0) {
				return "\nContato atualizado com sucesso";
			} else {
				return "Contato não encontrado";
			}
		} catch (SQLException e) {
			throw new DatabaseException("Erro ao atualizar contato", e);
		}
	}
	
	
	public Endereco selecionar(String idEndereco) throws DatabaseException {
		PreparedStatement statement;
		ResultSet resultSet;
		try {
			statement = minhaConexao.prepareStatement("select * from t_gs_contato where idEndereco = ?");
			statement.setString(1, idEndereco);
			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				Endereco endereco = new Endereco();
				endereco.setIdEndereco(resultSet.getString("idEndereco"));
				endereco.setCep(resultSet.getString("cep"));
				endereco.setLougradouro(resultSet.getString("lougradouro"));
				endereco.setComplemento(resultSet.getString("complemento"));
				endereco.setBairro(resultSet.getString("bairro"));
				endereco.setLocalidade(resultSet.getString("locaidade"));
				endereco.setUf(resultSet.getString("uf"));
				resultSet.close();
				statement.close();
				return endereco;
			} else {
				resultSet.close();
				statement.close();
				return null;
			}
		} catch (SQLException e) {
			throw new DatabaseException("Erro ao selecionar contato", e);
		}
	}

}
