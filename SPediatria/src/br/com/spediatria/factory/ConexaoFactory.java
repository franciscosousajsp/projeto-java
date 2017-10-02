package br.com.spediatria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.faces.event.SystemEvent;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "q1w2e3r4";
	private static final String URL = "jdbc:mysql://localhost:3306/dbspediatria";

	public static Connection conectar() throws SQLException {
		Connection conexao = DriverManager.getConnection(USUARIO, SENHA, URL);
		return conexao;
	}

	public static void main(String[] args) {
		try{
		Connection conexao = ConexaoFactory.conectar();
		System.out.println("Conex�o realizada com sucesso!");
		}catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("N�o foi possivel realizar a conex�o");
		}
	}
}
