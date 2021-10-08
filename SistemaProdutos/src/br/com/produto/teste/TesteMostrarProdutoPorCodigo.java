package br.com.produto.teste;

import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;

public class TesteMostrarProdutoPorCodigo {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.mostrarPorCodigo(3);
		
		System.out.println("C�digo: " + produto.getCodigo());
		System.out.println("Produto: " + produto.getProduto());
		System.out.println("Pre�o: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Subtotal: " + produto.getSubtotal());
		System.out.println();

	}

}
