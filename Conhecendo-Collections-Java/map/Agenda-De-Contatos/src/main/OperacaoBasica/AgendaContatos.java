package main.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	//adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome,telefone);
	}
	
	//removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			//Como o map mexe com o key, não precisamos percorrer a lista do map pelo for 
			agendaContatoMap.remove(nome);
		}
	}
	
	//exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	//pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	 public static void main(String[] args) {
		    AgendaContatos agendaContatos = new AgendaContatos();

		    // Adicionar contatos
		    agendaContatos.adicionarContato("Camila", 123456);
		    agendaContatos.adicionarContato("João", 5665);
		    agendaContatos.adicionarContato("Carlos", 1111111);
		    agendaContatos.adicionarContato("Ana", 654987);
		    agendaContatos.adicionarContato("Maria", 1111111);
		    //Quando é colocado com o mesmo nome que é o key, o hashMap desse mesmo elemento com a mesma chave é atualizado
		    agendaContatos.adicionarContato("Camila", 44444);

		    agendaContatos.exibirContatos();

		    // Remover um contato
		    agendaContatos.removerContato("Maria");
		    agendaContatos.exibirContatos();

		    // Pesquisar número por nome
		    String nomePesquisa = "João";
		    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
		    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

		    String nomePesquisaNaoExistente = "Paula";
		    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
		    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}

}
