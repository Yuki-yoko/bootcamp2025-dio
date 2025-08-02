package main.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map <Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos () {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	//adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente 
	//com a quantidade disponível e o preço.
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	//exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	//calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0.0;
		if(!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	//obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		for (Produto p : estoqueProdutosMap.values()) {
			if(p.getPreco() > maiorPreco) {
				produtoMaisCaro = p;
			}
		}
		return produtoMaisCaro;
	}
	
	//obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		for (Produto p : estoqueProdutosMap.values()) {
			if (p.getPreco() < menorPreco) {
				produtoMaisBarato = p;
			}
		}
		return produtoMaisBarato;
	}
	
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
	    Produto produtoMaiorQuantidadeValorNoEstoque = null;
	    //0d = numero zero do tipo double
	    double maiorValorTotalProdutoEstoque = 0d;
	    if (!estoqueProdutosMap.isEmpty()) {
	    	//estoqueProdutosMap.put(101L, new Produto("Caneta", 2.5, 100));
	      for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
	        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
	        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
	          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
	          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
	        }
	      }
	    }
	    return produtoMaiorQuantidadeValorNoEstoque;
	  }

	  public static void main(String[] args) {
	    EstoqueProdutos estoque = new EstoqueProdutos();

	    // Exibe o estoque vazio
	    estoque.exibirProdutos();

	    // Adiciona produtos ao estoque
	    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

	    // Exibe os produtos no estoque
	    estoque.exibirProdutos();

	    // Calcula e exibe o valor total do estoque
	    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

	    // Obtém e exibe o produto mais caro
	    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	    System.out.println("Produto mais caro: " + produtoMaisCaro);

	    // Obtém e exibe o produto mais barato
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    System.out.println("Produto mais barato: " + produtoMaisBarato);

	    // Obtém e exibe o produto com a maior quantidade em valor no estoque
	    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	  }

}
