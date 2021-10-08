package br.com.produto.jdbc;

public class Produto {
	
	public Produto(String produto, double preco, int quantidade){
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.subtotal = this.calcularSubtotal();
		
		
				
	}
	
	public Produto(){
		
	}
	
	private int codigo;
	private String produto;
	private double preco;
	private int quantidade;
	private double subtotal;
	
	public double calcularSubtotal() {
		return (this.preco * this.quantidade );
	
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public String getProduto() {
		return produto;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getSubtotal() {
		return subtotal;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	
}
