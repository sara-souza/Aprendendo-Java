package br.com.turma.teste;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.AlunoDao;

public class TesteMostrarAlunoPorCodigo {

	public static void main(String[] args) {
		
		AlunoDao alunoDao = new AlunoDao();
		Aluno aluno = alunoDao.mostrarPorCodigo(5);
		
		System.out.println("C?digo: " + aluno.getCodigo());
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("1? Bimestre: " + aluno.getPrim());
		System.out.println("2? Bimestre: " + aluno.getSeg());
		System.out.println("3? Bimestre: " + aluno.getTer());
		System.out.println("4? Bimestre: " + aluno.getQua());
		System.out.println("M?dia: " + aluno.getMedia());
		System.out.println("Status Final: " + aluno.getStatus_final());
		System.out.println();

	}

}
