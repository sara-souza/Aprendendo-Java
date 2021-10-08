package br.com.turma.teste;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.AlunoDao;

public class TesteAlterarPorCodigo {

	public static void main(String[] args) {
		
		Aluno alunos = new Aluno();
		alunos.setCodigo(5);
		alunos.setNome("Nelson Meirelles");
		alunos.setPrim(6.5);
		alunos.setSeg(9.5);
		alunos.setTer(8.5);
		alunos.setQua(7.5);
		alunos.setMedia(alunos.calcularMedia());
		alunos.setStatus_final(alunos.verificarStatus());
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.alterarPorCodigo(alunos);
		
		
		
		

	}

}
