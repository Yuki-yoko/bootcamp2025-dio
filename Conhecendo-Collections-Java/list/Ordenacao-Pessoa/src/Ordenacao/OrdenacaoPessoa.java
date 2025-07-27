package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	//atributo
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	public void adicionarPessoa(String nome, int idade, double altura){
		pessoaList.add(new Pessoa (nome, idade, altura));
	}
	
	public List <Pessoa> ordenarPorIdade(){
		//estou pegando todos os elementos da lista chamada pessoaList na lista pessoaPorIdade
		//Mas os elementos ainda não estão ordenados 
		List<Pessoa> pessoaPorIdade = new ArrayList<>();
		Collections.sort (pessoaPorIdade);
		//vai ordenar a lista de idades Usando o Comparable que já sabe como comparar
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List <Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		//Como queremos comparar por comparator usamos o new com a achamada do método do comparator, e quando queremos utilizar o comparable chamamos somente a lista com elementos
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		  // Criando uma instância da classe OrdenacaoPessoas
		    OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

		    // Adicionando pessoas à lista
		    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
		    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
		    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

		    // Exibindo a lista de pessoas adicionadas
		    System.out.println(ordenacaoPessoas.pessoaList);

		    // Ordenando e exibindo por idade
		    System.out.println(ordenacaoPessoas.ordenarPorIdade());

		    // Ordenando e exibindo por altura
		    System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}
