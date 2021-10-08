package br.com.turma.jdbc;


public class Aluno {
	
	public Aluno(String nome, double prim, double seg, double ter, double qua){
		this.nome = nome;
		this.prim = prim;
		this.seg = seg;
		this.ter = ter;
		this.qua = qua;
		this.media = this.calcularMedia();
		this.status_final = this.verificarStatus();
				
	}
	
	public Aluno(){
		
	}
	
	private int codigo;
	private String nome;
	private double prim;
	private double seg;
	private double ter;
	private double qua;
	private double media;
	private String status_final;
	
	public double calcularMedia() {
		return (this.prim + this.seg + this.ter + this.qua) / 4;
	
	}
	
public String verificarStatus() {
		
		if(this.media >= 7) {
			return "APROVADO";
		}else if(this.media >= 5 && this.media < 7) {
			return "RECUPERAÇÃO";
		}else if(this.media >= 0 && this.media < 5) {
			return "REPROVADO";	
		}else {
			return "NOTA INVÁLIDA";
		}
	}


public int getCodigo() {
	return codigo;
}

public String getNome() {
	return nome;
}

public double getPrim() {
	return prim;
}

public double getSeg() {
	return seg;
}

public double getTer() {
	return ter;
}

public double getQua() {
	return qua;
}

public double getMedia() {
	return media;
}

public String getStatus_final() {
	return status_final;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setPrim(double prim) {
	this.prim = prim;
}

public void setSeg(double seg) {
	this.seg = seg;
}

public void setTer(double ter) {
	this.ter = ter;
}

public void setQua(double qua) {
	this.qua = qua;
}

public void setMedia(double media) {
	this.media = media;
}

public void setStatus_final(String status_final) {
	this.status_final = status_final;
}


	
	
	
	
	

}
