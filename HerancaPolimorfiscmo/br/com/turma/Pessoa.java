package br.com.turma;

public abstract class Pessoa {
	
	public Pessoa(String nome, String estado, double salario) {
		this.nome = nome;
		this.estado = estado;
		this.salario = salario;
	}
	
	private String nome;
	private String estado;
	private double salario;
	private double salarioBruto;
	
	public double bonus() {
		return 300;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	

}
