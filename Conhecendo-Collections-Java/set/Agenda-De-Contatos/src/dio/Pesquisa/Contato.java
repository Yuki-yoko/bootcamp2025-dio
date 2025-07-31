package dio.Pesquisa;

import java.util.Objects;

public class Contato {

	private String nome;
	private int numero;
	
	public Contato (String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero(int numero) {
		return numero;
	}
	
	public void setNumero(int numero) {
	    this.numero = numero;
	 }
	
	//Fazer para não ter mais de um contato com o mesmo nome
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}

/**
 * Crie uma classe chamada "AgendaContatos" que possui um conjunto 
 * de objetos do tipo "Contato" como atributo. Cada contato possui 
 * atributos como nome e número de telefone. Implemente os seguintes métodos:
 * 
 * adicionarContato(String nome, int numero): Adiciona um contato à agenda.
 * 
 * exibirContatos(): Exibe todos os contatos da agenda
 * 
 * pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto
 * com os contatos encontrados.
 * 
 * atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de 
 * telefone de um contato específico. 
*/
