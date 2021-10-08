package br.com.turma.teste;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.AlunoDao;

public class TesteCadastrarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Vilma",4.5,3.0,2.5,1.5);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno);
		
		
		
		
		

	}

}
