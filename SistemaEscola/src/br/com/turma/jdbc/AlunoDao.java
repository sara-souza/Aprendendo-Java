package br.com.turma.jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDao {
	
	public void cadastrar(Aluno aluno) {

		
		try {
		
		//1°)Pegar uma conexão com o banco de dados
		Connection con = Conexao.receberConexao();
		
		//2°) Definir o comando que será executado no banco de dados
		String sql = "INSERT INTO aluno(nome,prim,seg,ter,qua,media,status_final) VALUES(?,?,?,?,?,?,?)";
		
		//3°) Preparar a linha de instrução
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, aluno.getNome());
		preparador.setDouble(2, aluno.getPrim());
		preparador.setDouble(3, aluno.getSeg());
		preparador.setDouble(4, aluno.getTer());
		preparador.setDouble(5, aluno.getQua());
		preparador.setDouble(6, aluno.getMedia());
		preparador.setString(7, aluno.getStatus_final());

		//4°)Executar no banco de dados
		preparador.execute();
		
		System.out.println("Aluno cadastrado com sucesso!");
		
		}catch (SQLException  e) {
			System.err.println("Não foi possível cadastrar o aluno!");
			e.printStackTrace();
		}
		
	}

	public ArrayList<Aluno> mostrarTodos(){
		
		Connection con = Conexao.receberConexao();
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		String sql = "SELECT * from aluno";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			
			while (resultado.next()) {
				
				Aluno aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrim(resultado.getDouble("prim"));
				aluno.setSeg(resultado.getDouble("seg"));
				aluno.setTer(resultado.getDouble("ter"));
				aluno.setQua(resultado.getDouble("qua"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatus_final(resultado.getString("status_final"));
				
				alunos.add(aluno);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return alunos;

	}
	
	public Aluno mostrarPorCodigo(int codigo) {
		
		Connection con = Conexao.receberConexao();
		Aluno aluno = null;
		String sql = "SELECT * from aluno WHERE codigo=?";
		
		PreparedStatement preparador;
		try {
			 preparador = con.prepareStatement(sql);
			 preparador.setInt(1, codigo);
			 
			 ResultSet resultado = preparador.executeQuery();
			 
			 if(resultado.next()) {
				 aluno= new Aluno();
				 aluno.setCodigo(resultado.getInt("codigo"));
				 aluno.setNome(resultado.getString("nome"));
				 aluno.setPrim(resultado.getDouble("prim"));
				 aluno.setSeg(resultado.getDouble("seg"));
				 aluno.setTer(resultado.getDouble("ter"));
				 aluno.setQua(resultado.getDouble("qua"));
				 aluno.setMedia(resultado.getDouble("media"));
				 aluno.setStatus_final(resultado.getString("status_final"));
				 
			 }
			 
			 
			 	
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return aluno;
	}

	public void excluirPorCodigo(int codigo) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "DELETE FROM aluno WHERE codigo=?";
		
		try {
			 PreparedStatement preparador = con.prepareStatement(sql);
			 preparador.setInt(1, codigo);
			 
			 preparador.execute();
			 preparador.close();
			 
			 System.out.println("Aluno excluído com sucesso!!!");
			 
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}

	public void alterarPorCodigo(Aluno aluno) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "UPDATE aluno SET nome=?,prim=?,seg=?,ter=?,qua=?,media=?,status_final=? WHERE codigo=? ";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5, aluno.getQua());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setString(7, aluno.getStatus_final());
			preparador.setInt(8, aluno.getCodigo());

			preparador.execute();
			preparador.close();
			
			System.out.println("O aluno foi alterado com sucesso!");
			
			}catch (SQLException  e) {
				System.err.println("Erro ao alterar o aluno!");
				e.printStackTrace();
			}
	}
}
