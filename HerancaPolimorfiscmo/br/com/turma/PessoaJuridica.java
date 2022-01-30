package br.com.turma;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String nome, String estado, double salario, String ie,String cnpj) {
		super(nome, estado, salario);
		this.ie = ie;
		this.cnpj = cnpj;
	}
	
	private String ie;
	private String cnpj;
	
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public double bonus() {
		return super.getSalario()+super.bonus()+200;
	}

}
