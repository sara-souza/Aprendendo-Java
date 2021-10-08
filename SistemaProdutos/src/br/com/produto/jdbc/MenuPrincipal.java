package br.com.produto.jdbc;




import java.util.ArrayList;


import java.util.Scanner;





public class MenuPrincipal {

	public static void main(String[] args) {
		
		
		
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("========== MENU PRINCIPAL==========");
			System.out.println("| 1 - Cadastrar Produto           |");
			System.out.println("| 2 - Mostrar Todos os Produtos   |");
			System.out.println("| 3 - Mostrar Produto pelo Código |");
			System.out.println("| 4 - Alterar Produto             |");
			System.out.println("| 5 - Excluir Produto             |");
			System.out.println("| 6 - Sair do Sistema             |");
			System.out.println( "==================================");
			System.out.print("Escolha a opção desejada: ");
			opcao = leitor.nextInt();
			System.out.println();
			
			
		
			switch(opcao) {
				case 1:
					System.out.println("========== CADASTRO DE PRODUTOS ===========");
					ProdutoDao produtoDao = new ProdutoDao();
					System.out.print("Produto: ");
					String produto = leitor.next();
					
					System.out.print("Preço: ");
					double preco = leitor.nextDouble();
					
					System.out.print("Quantidade: ");
					int quantidade = leitor.nextInt();
							
					Produto produtos1 = new Produto(produto,preco,quantidade);
					
					produtoDao.cadastrar(produtos1);
					System.out.println( );
					break;
				case 2:
					System.out.println("========== MOSTRAR TODOS PRODUTOS==========");
					System.out.println("");
					ProdutoDao produto2 = new ProdutoDao();
					ArrayList<Produto> produtos = produto2.mostrarTodos();

					for (Produto produto1:produtos) {
						System.out.println("Código: " + produto1.getCodigo());
						System.out.println("Produto: " + produto1.getProduto());
						System.out.println("Preço: " + produto1.getPreco());
						System.out.println("Quantidade: " + produto1.getQuantidade());
						System.out.println("Subtotal: " + produto1.getSubtotal());
						System.out.println();
					}
					
					
					break;
				case 3:
					ProdutoDao produto3 = new ProdutoDao();
					System.out.println("==========MOSTRAR PRODUTO POR CÓDIGO ==========");
					System.out.println("Código do produto: ");
					int codigo = leitor.nextInt();
					Produto produto1 = produto3.mostrarPorCodigo(codigo);
					
					System.out.println("Código: " + produto1.getCodigo());
					System.out.println("Produto: " + produto1.getProduto());
					System.out.println("Preço: " + produto1.getPreco());
					System.out.println("Quantidade: " + produto1.getQuantidade());
					System.out.println("Subtotal: " + produto1.getSubtotal());
					System.out.println();
					
					break;
				case 4:
					
					System.out.println("==========ALTERAR OS PRODUTO ==========");
					System.out.println("Código do produto: ");
					int codigo2 = leitor.nextInt();
					
					System.out.print("Produto: ");
					String produt = leitor.next();
					
					System.out.print("Preço: ");
					double prec = leitor.nextDouble();
					
					System.out.print("Quantidade: ");
					int quantidad = leitor.nextInt();
					
					
					Produto produto5 = new Produto();
					produto5.setCodigo(codigo2);
					produto5.setProduto(produt);
					produto5.setPreco(prec);
					produto5.setQuantidade(quantidad);
					produto5.setSubtotal(produto5.calcularSubtotal());

					
					ProdutoDao produto4 = new ProdutoDao();
					produto4.alterarPorCodigo(produto5);
					
					
					break;
				case 5:
					System.out.println("==========EXCLUIR OS PRODUTO ==========");
					System.out.println("Código do produto: ");
					int codi = leitor.nextInt();
					
					ProdutoDao produto6 = new ProdutoDao();
					produto6.excluirPorCodigo(codi);

					break;
				case 6:
					System.out.println("========== FINALIZAR SISTEMA ==========");
					break;
				default:
					System.out.println("Opção Inválida");
			}
			
		}while(opcao!=6);
		
		leitor.close();

	}
	
	}
	
	


