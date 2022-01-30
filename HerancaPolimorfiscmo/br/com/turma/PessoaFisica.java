package br.com.turma;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String nome,String estado, double salario,String cpf,String rg) {
		super(nome,estado,salario);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public double bonus() {
		return super.getSalario()+super.bonus()+500;
	}

}
