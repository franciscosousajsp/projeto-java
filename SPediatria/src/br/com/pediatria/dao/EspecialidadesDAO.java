package br.com.pediatria.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import br.com.spediatria.domain.Tbespecialidades;
import br.com.spediatria.factory.ConexaoFactory;

public class EspecialidadesDAO {
	public void salvar(Tbespecialidades esp) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO Tbespecialidades ");
		sql.append("(descricao) ");
		sql.append("VALUES (?)");

		Connection conexao = (Connection) ConexaoFactory.conectar();

		PreparedStatement comando = (PreparedStatement) conexao.prepareStatement(sql.toString());
		comando.setString(1, esp.getDescricao());

		comando.executeUpdate();
	}

	public static void main(String[] args) {
		Tbespecialidades esp1 = new Tbespecialidades();
		esp1.setDescricao("DESCRICAO 01");
		
		Tbespecialidades esp2 = new Tbespecialidades();
		esp2.setDescricao("DESCRICAO 02");
		
		EspecialidadesDAO espdao = new EspecialidadesDAO();
		try{
		espdao.salvar(esp1);
		espdao.salvar(esp2);
		System.out.println("As especialidades salvas com sucesso");
		}catch (SQLException e){
			System.out.println("Ocorreu um erro ao tentar salvar uma das Especialidades");
			e.printStackTrace();
		}
	}
}