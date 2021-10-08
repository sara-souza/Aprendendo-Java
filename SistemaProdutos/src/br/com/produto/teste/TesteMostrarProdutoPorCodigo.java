package br.com.produto.teste;

import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;

public class TesteMostrarProdutoPorCodigo {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.mostrarPorCodigo(3);
		
		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Produto: " + produto.getProduto());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Subtotal: " + produto.getSubtotal());
		System.out.println();

	}

}
