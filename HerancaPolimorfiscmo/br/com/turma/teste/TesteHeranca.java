package br.com.turma.teste;

import java.util.ArrayList;

import br.com.turma.Pessoa;
import br.com.turma.PessoaFisica;
import br.com.turma.PessoaJuridica;
import br.com.turma.Temporario;

public class TesteHeranca {

	public static void main(String[] args) {
		

		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new PessoaFisica("Maria Francisca","BA",4000,"1111","1111"));
		pessoas.add(new PessoaFisica("Roberta Torres","MG",3000,"1111","1111"));
		pessoas.add(new PessoaFisica("Humberto Franco","SP",2000,"1111","1111"));
		pessoas.add(new PessoaJuridica("Jurandir Torres","AM",7000,"2222","2222"));
		pessoas.add(new PessoaJuridica("Jonas Fernandes","RJ",6000,"2222","2222"));
		pessoas.add(new Temporario("Humberto Praga","SC",2000));
		pessoas.add(new Temporario("Robson Francisco","RS",1800));
		pessoas.add(new Temporario("Tatiana Queiroz","PR",1600));
		pessoas.add(new Temporario("Jefferson Rocha","SP",1500));
		
		for(Pessoa temp:pessoas) {
			System.out.println("Nome: " + temp.getNome());
			System.out.println("Estado: " + temp.getEstado());
			System.out.println("Salário: " + temp.getSalario());
			System.out.println("Salário+Bonus: " + temp.bonus());
			System.out.println();
		}

		
		/*
		UtilReajuste util = new UtilReajuste();
		
		Pessoa obj = new PessoaFisica("Joana","BA",5000,"1111","1111");
		obj.setSalarioBruto(util.reajuste(obj));
		
		PessoaFisica pf = (PessoaFisica)obj;
		
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Estado: " + pf.getEstado());
		System.out.println("CPF: " + pf.getCpf());
		System.out.println("RG: " + pf.getRg());
		System.out.println("Salário: " + pf.getSalario());
		System.out.println("Salário Bruto: " + pf.getSalarioBruto());
		System.out.println();
		*/
	}

}
