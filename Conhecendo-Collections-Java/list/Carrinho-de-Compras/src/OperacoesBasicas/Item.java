package OperacoesBasicas;

public class Item {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "nome: " + nome +
				" preço: R$ " + String.format("%.2f", preco) +
				" quantidade: " + quantidade + "\n";
	}
}
