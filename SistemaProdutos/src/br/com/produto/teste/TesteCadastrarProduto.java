package br.com.produto.teste;

import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;

public class TesteCadastrarProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Arroz",20,1);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produto);

	}

}
