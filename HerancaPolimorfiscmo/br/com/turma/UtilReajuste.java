package br.com.turma;

public class UtilReajuste {
	
	public double reajuste(Pessoa pessoa) {
		
		if(pessoa instanceof PessoaFisica) {
			return pessoa.getSalario() * 1.10;			
		}else if(pessoa instanceof PessoaJuridica){
			return pessoa.getSalario() * 1.20;
		}else{
			return pessoa.getSalario() * 1.30;
		}
			
	}


}
