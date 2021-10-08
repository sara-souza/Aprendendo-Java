package br.com.produto.teste;

import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;

public class TesteAlterarPorCodigo {

	public static void main(String[] args) {
		
		Produto produtos = new Produto();
		produtos.setCodigo(3);
		produtos.setProduto("Arroz sete cereais");
		produtos.setPreco(12);
		produtos.setQuantidade(2);
		produtos.setSubtotal(produtos.calcularSubtotal());
		
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterarPorCodigo(produtos);

	}

}
