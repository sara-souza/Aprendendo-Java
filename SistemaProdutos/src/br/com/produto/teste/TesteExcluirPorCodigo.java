package br.com.produto.teste;

import br.com.produto.jdbc.ProdutoDao;

public class TesteExcluirPorCodigo {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.excluirPorCodigo(5);

	}

}
