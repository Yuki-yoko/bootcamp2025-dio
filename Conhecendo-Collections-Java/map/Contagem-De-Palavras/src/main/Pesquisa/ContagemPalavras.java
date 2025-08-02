package main.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map <String, Integer> palavras;
	
	public ContagemPalavras() {
		this.palavras = new HashMap<>();
	}
	
	//adicionarPalavra(String palavra, Integer contagem): 
	//Adiciona uma palavra à contagem.
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavras.put(palavra, contagem);
	}
	
	//removerPalavra(String palavra): 
	//Remove uma palavra da contagem, se estiver presente.
	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			palavras.remove(palavra);
		}
		else {
			System.out.println("Não tem nenhum elemento no map.");
		}
	}
	
	//exibirContagemPalavras(): 
	//Exibe todas as palavras e suas respectivas contagens.
	public void exibirContagemPalavras() {
		if (!palavras.isEmpty()) {
			System.out.println(palavras);
		}
		else {
			System.out.println("Não tem nada para exibir.");
		}
	}
	
	//encontrarPalavraMaisFrequente(): 
	//Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
	public String encontrarPalavrasMaisFrequente() {
	    String linguagemMaisFrequente = null;
	    int maiorContagem = 0;
	    for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
	      if (entry.getValue() > maiorContagem) {
	    	  //entry.getValue() → retorna o valor associado àquela chave (neste caso, um Integer, como 3, 5, etc.).
	        maiorContagem = entry.getValue();
	        linguagemMaisFrequente = entry.getKey();
	      }
	    }
	    return linguagemMaisFrequente;
	  }
	
	/**
	 * for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
	 * entry.getKey() → a palavra
     * entry.getValue() → a frequência da palavra
     * }
	 */
	
	public static void main(String[] args) {
	    ContagemPalavras contagemLinguagens = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
	    contagemLinguagens.adicionarPalavra("Java", 2);
	    contagemLinguagens.adicionarPalavra("Python", 8);
	    contagemLinguagens.adicionarPalavra("JavaScript", 1);
	    contagemLinguagens.adicionarPalavra("C#", 6);

	    // Exibe a contagem total de linguagens
	    contagemLinguagens.exibirContagemPalavras();
	    System.out.println("Existem " + contagemLinguagens.palavras.size() + " palavras.");

	    // Encontra e exibe a linguagem mais frequente
	    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
	    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}
}
/** 
 * Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar 
 * as palavras e a quantidade de vezes que cada palavra aparece em um texto. 
*/
// adicionarPalavra(String palavra, Integer contagem)