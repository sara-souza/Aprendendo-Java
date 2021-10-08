package br.com.produto.teste;

import java.util.Scanner;

import br.com.produto.jdbc.Produto;
import br.com.produto.jdbc.ProdutoDao;


public class TesteCadastrarComScanner {

	public static void main(String[] args) {
		
Scanner  leitor = new Scanner(System.in);
		
		
		System.out.println("============= CADASTRO DE PRODUTOS ================");
		System.out.print("Produto: ");
		String produto = leitor.next();
		
		System.out.print("Preço: ");
		double preco = leitor.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = leitor.nextInt();
				
		Produto produtos = new Produto(produto,preco,quantidade);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produtos);
		
		leitor.close();

	}


	}

