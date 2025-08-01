package main.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> dicionarioMap;
	
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}

	//adicionarPalavra(String palavra, String definicao): 
	//Adiciona uma palavra e sua definição ao dicionário, 
	//associando a palavra à sua definição correspondente
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	//removerPalavra(String palavra): Remove uma palavra do 
	//dicionário, dado o termo a ser removido.
	public void removerPalavra(String palavra) {
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
	}
	
	//exibirPalavras(): Exibe todas as palavras e suas 
	//definições do dicionário, mostrando cada palavra 
	//seguida de sua respectiva definição.
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	//pesquisarPorPalavra(String palavra): Pesquisa uma 
	//palavra no dicionário e retorna sua definição 
	//correspondente.
	public String pesquisarPorPalavra(String palavra) {
	    String definicao = dicionarioMap.get(palavra);
	    if (definicao != null) {
	      return definicao;
	    }
	    return "Linguagem não encontrada no dicionário.";
	}
	

	  public static void main(String[] args) {
	    Dicionario dicionario = new Dicionario();

	    // Adicionar palavras (linguagens de programação)
	    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
	    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
	    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

	    // Exibir todas as palavras
	    dicionario.exibirPalavras();

	    // Pesquisar palavras
	    String definicaoJava = dicionario.pesquisarPorPalavra("java");
	    System.out.println("Definição da linguagem 'java': " + definicaoJava);

	    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
	    System.out.println(definicaoCSharp);

	    // Remover uma palavra
	    dicionario.removerPalavra("typescript");
	    dicionario.exibirPalavras();
	  }

}
