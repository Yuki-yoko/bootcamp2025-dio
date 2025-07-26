package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho 
 * de compras online. O carrinho deve ser implementado como uma lista de 
 * itens. Cada item é representado por uma classe chamada "Item" que possui 
 * atributos como nome, preço e quantidade. Implemente os seguintes métodos:
 * 
 * adicionarItem(String nome, double preco, int quantidade): Adiciona um 
 * item ao carrinho com o nome, preço e quantidade especificados.
 * 
 * removerItem(String nome): Remove um item do carrinho com base no seu nome.
 * 
 * calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando 
 * em consideração o preço e a quantidade de cada item.
 * 
 * exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus 
 * nomes, preços e quantidades.
 */

public class CarrinhoDeCompras {
	
	//No <> coloca a classe que tem todas as descrições dos itens do carrinho
	private List <Item> carrinhoDeCompras;
	private char[] calcularValorTotal;
	
	public CarrinhoDeCompras() {
		this.carrinhoDeCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List <Item> listaTemporario = new ArrayList<>();
		if (!carrinhoDeCompras.isEmpty()) {
			for (Item produto : carrinhoDeCompras) {
				if(produto.getNome().equalsIgnoreCase(nome)) {
					listaTemporario.add(produto);
				}
			}
			carrinhoDeCompras.removeAll(listaTemporario);
		}else {
			System.out.println("A lista está vazia. ");
		}
	}
	
	public String calcularValorTotal() {
		double valor = 0.0;
		if(!carrinhoDeCompras.isEmpty()) {
			for (Item produto : carrinhoDeCompras) {
				 double precoItem = produto.getPreco() * produto.getQuantidade();
				 valor = precoItem + valor;
			}
			return "O valor total é: R$" + valor;
		}else {
			return "Não há nada no carrinho: R$" + valor;
		}
	}
	
	public void exibirItens() {
		if (!carrinhoDeCompras.isEmpty()) {
			System.out.println(this.carrinhoDeCompras);
		}else {
			System.out.println("Não tem nada no carrinho.");
		}
	}
	
	public String toString() {
		return "Produto: " + carrinhoDeCompras ;
	}
	
	public static void main (String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("maça", 1.2, 12);
		carrinhoDeCompras.adicionarItem("maça", 1.2, 20);
		carrinhoDeCompras.adicionarItem("laranja", 0.89, 12);
		carrinhoDeCompras.adicionarItem("melancia", 10.50, 1);
		
		carrinhoDeCompras.removerItem("laranja");
		
		carrinhoDeCompras.exibirItens();
		
		System.out.println(carrinhoDeCompras.calcularValorTotal());
	}
	

}
