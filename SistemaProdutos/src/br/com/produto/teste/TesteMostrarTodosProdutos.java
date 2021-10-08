package br.com.produto.teste;

import java.util.ArrayList;


import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;


public class TesteMostrarTodosProdutos {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		ArrayList<Produto> produtos = produtoDao.mostrarTodos();
		
		for(Produto produto:produtos) {
			
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Produto: " + produto.getProduto());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Subtotal: " + produto.getSubtotal());
			
			
			System.out.println();
		}
		


	}

}
