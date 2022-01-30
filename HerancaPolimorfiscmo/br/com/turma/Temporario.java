package br.com.turma;

public class Temporario extends Pessoa {

	public Temporario(String nome, String estado, double salario) {
		super(nome, estado, salario);
	}
	
	@Override
	public double bonus() {
		return super.getSalario() + super.bonus();
	}
	
}
