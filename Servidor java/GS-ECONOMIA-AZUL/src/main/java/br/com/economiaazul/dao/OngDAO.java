package br.com.economiaazul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.conexao.ConnectFactory;
import br.com.economiaazul.exceptions.EnderecoDatabase;

public class OngDAO {

	public List<Ong> listarOngs() {
		List<Ong> listaOngs = new ArrayList<>();
		Connection conexao = null;
		Statement consulta = null;
		ResultSet resultado = null;

		try {
			// Obtém a conexão
			ConnectFactory factory = new ConnectFactory();
			conexao = factory.conexao();

			// Cria a consulta SQL
			String sql = "SELECT * FROM T_GS_ONG";

			// Cria um statement
			consulta = conexao.createStatement();

			// Executa a consulta
			resultado = consulta.executeQuery(sql);

			// Itera sobre o resultado e cria objetos Ong
			while (resultado.next()) {
				String idOng = resultado.getString("idOng");
				String nome = resultado.getString("nome");
				String pais = resultado.getString("pais");
				String estado = resultado.getString("estado");
				String areaAtuacao = resultado.getString("areaAtuacao");
				int materialColetado = Integer.parseInt(resultado.getString("materialColetado"));
				String imagem = resultado.getString("imagem");


				Ong ong = new Ong(idOng, nome, pais, estado, areaAtuacao, materialColetado, imagem);
				listaOngs.add(ong);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// Fecha os recursos
			try {
				if (resultado != null)
					resultado.close();
				if (consulta != null)
					consulta.close();
				if (conexao != null)
					conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaOngs;
	}

	public String inserir(Ong ong) throws EnderecoDatabase {
		Connection minhaConexao = null;
		PreparedStatement statement = null;
		try {
			// Obtém a conexão
			ConnectFactory factory = new ConnectFactory();
			minhaConexao = factory.conexao();

			// Prepara a query SQL
			statement = minhaConexao.prepareStatement(
					"INSERT INTO T_GS_ONG(nome, pais, estado, areaAtuacao) VALUES (?, ?, ?, ?)");

			// Define os parâmetros da query
			statement.setString(1, ong.getNome());
			statement.setString(2, ong.getPais());
			statement.setString(3, ong.getEstado());
			statement.setString(4, ong.getAreaAtuacao());

			// Executa a query
			statement.executeUpdate();

			return "\nCadastrado com Sucesso";
		} catch (SQLException | ClassNotFoundException e) {
			throw new EnderecoDatabase("Erro no cadastro", e);
		} finally {
			// Fecha os recursos
			try {
				if (statement != null)
					statement.close();
				if (minhaConexao != null)
					minhaConexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}