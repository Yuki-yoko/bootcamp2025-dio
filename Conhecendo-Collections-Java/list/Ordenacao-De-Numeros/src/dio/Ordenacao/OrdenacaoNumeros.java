package dio.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List <Integer> ordenacaoList;
	
	public OrdenacaoNumeros() {
		this.ordenacaoList = new ArrayList<>();
	}
	

	public void adicionarNumero(int numero) {
		ordenacaoList.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List <Integer> listaAscendente = new ArrayList<>(this.ordenacaoList);
		if (!ordenacaoList.isEmpty()) {
			Collections.sort(listaAscendente);
		}
		return listaAscendente;
	}
	
	public List<Integer> ordenarDescendente(){
		List <Integer> listaDescendente = new ArrayList<>(this.ordenacaoList);
		if (!ordenacaoList.isEmpty()) {
			ordenacaoList.sort(Collections.reverseOrder());
		}
		return listaDescendente;
	}
	
	public void exibirNumeros() {
	    if (!ordenacaoList.isEmpty()) {
	      System.out.println(this.ordenacaoList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

	  public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	    System.out.println(numeros.ordenarAscendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem descendente
	    System.out.println(numeros.ordenarDescendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();
	  }
}

/**
 * Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números 
 * inteiros como atributo. Implemente os seguintes métodos:
 * 
 * adicionarNumero(int numero): Adiciona um número à lista
 * 
 * ordenarAscendente(): Ordena os números da lista em ordem ascendente usando 
 * a interface Comparable e a class Collections.
 * 
 * ordenarDescendente(): Ordena os números da lista em ordem descendente usando
 *  um Comparable e a class Collections.
 */
