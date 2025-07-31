package dio.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set <Contato> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	//Quando temos o mesmo nome e é permitido guardar com sobrenomes diferentes 
	//Quando pesquiso o nome Camila, vai retornar o set com os nomes que começam com Camila
	public Set<Contato> pesquisarPorNome(String nome) {
		Set <Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if (c.getNome().startsWith(nome));
			contatosPorNome.add(c);
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c :contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe AgendaContatos
	    AgendaContatos agendaContatos = new AgendaContatos();

	    // Exibindo os contatos no conjunto (deve estar vazio)
	    agendaContatos.exibirContatos();

	    // Adicionando contatos à agenda
	    agendaContatos.adicionarContato("João", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Carolina", 55555555);

	    // Exibindo os contatos na agenda
	    agendaContatos.exibirContatos();

	    // Pesquisando contatos pelo nome
	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

	    // Atualizando o número de um contato
	    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);

	    // Exibindo os contatos atualizados na agenda
	    System.out.println("Contatos na agenda após atualização:");
	    agendaContatos.exibirContatos();
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
