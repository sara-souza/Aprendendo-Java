package br.com.turma.teste;

import java.util.Scanner;

import br.com.turma.jdbc.Aluno;
import br.com.turma.jdbc.AlunoDao;

public class TesteCadastrarComScanner {

	public static void main(String[] args) {
		
Scanner  leitor = new Scanner(System.in);
		
		
		System.out.println("============= CADASTRO DE ALUNOS ================");
		System.out.print("Nome: ");
		String nome = leitor.next();
		
		System.out.print("1� Bimestre: ");
		double prim = leitor.nextDouble();
		
		System.out.print("2� Bimestre: ");
		double seg = leitor.nextDouble();
		
		System.out.print("3� Bimestre: ");
		double ter = leitor.nextDouble();
		
		System.out.print("4� Bimestre: ");
		double qua = leitor.nextDouble();
		Aluno aluno = new Aluno(nome,prim,seg,ter,qua);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno);
		
		leitor.close();

	}

}
