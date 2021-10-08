package br.com.turma.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection receberConexao() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbalunos?useSSL=false","root","root");
			System.out.println("Banco de Dados conectado com sucesso!");
		
		}catch (SQLException | ClassNotFoundException e) {
			
			System.err.println("N�o foi poss�vel  conectar ao banco de dados!");
			e.printStackTrace();
		}
		return con;
		
	}

}
