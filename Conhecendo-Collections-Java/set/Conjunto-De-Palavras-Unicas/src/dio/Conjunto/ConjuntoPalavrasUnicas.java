package dio.Conjunto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set <Palavra> palavraSet;
	
	public ConjuntoPalavrasUnicas() {
		this.palavraSet = new HashSet<>();
	}
	
	//adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
	public void adicionarPalavra (String palavra) {
		palavraSet.add(new Palavra (palavra));
	}
	
	//removerPalavra(String palavra): Remove uma palavra do conjunto.
	public void removerPalavra(String palavra) {
		Palavra palavraParaRemover = null;
		for (Palavra p : palavraSet) {
			if (p.getPalavra() == palavra) {
				palavraParaRemover = p;
				break;
			}
		}
		palavraSet.remove(palavraParaRemover);
	}
	
	//verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
	public boolean verificarPalavra(String palavra) {
		return palavraSet.contains(palavra);
	}
	
	//exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
	public void exibirPalavrasUnicas() {
		System.out.println(palavraSet);
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ConjuntoPalavrasUnicas
	    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

	    // Adicionando linguagens únicas ao conjunto
	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    // Exibindo as linguagens únicas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem do conjunto
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();

	    // Removendo uma linguagem inexistente
	    conjuntoLinguagens.removerPalavra("Swift");

	    // Verificando se uma linguagem está no conjunto
	    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

	    // Exibindo as linguagens únicas atualizadas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	  }
	
	
	
}
