package dio.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set <Tarefa> tarefaSet;
	
	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}
	
	//adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa (descricao));
	}
	
	//removerTarefa(String descricao): Remove uma tarefa do Set de acordo 
	//com a descrição, se estiver presente.
	public void removerTarefa(String descricao) {
		Tarefa tarefaRemover = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaRemover = t;
					break;
				}
			}
			tarefaSet.remove(tarefaRemover);
		}
		else {
			System.out.println("Não tem nada na lista!");
		}
	}
	
	//exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
	public void exibirTarefas() {
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				System.out.println(tarefaSet);
			}
		}
		else {
			System.out.println("Não tem nada na lista!");
		}
	}
	
	//contarTarefas(): Conta o número total de tarefas na lista de tarefas.
	public int contarTarefas() {
		return tarefaSet.size();
	}
	
	//obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
	public Set <Tarefa> obterTarefasConcluidas(){
		Set <Tarefa> tarefasConcluidas = new HashSet<>();
		
		for (Tarefa t : tarefaSet) {
			if (t.isconcluida() == true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	
	//obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
	public Set <Tarefa> obterTarefasPendentes(){
		Set <Tarefa> tarefasPendentes = new HashSet<>();
		
		for (Tarefa t : tarefaSet) {
			if (t.isconcluida() == false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	//marcarTarefaConcluida(String descricao): Marca uma tarefa como 
	//concluída de acordo com a descrição.
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefaSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
			}
		}
	}
	
	//marcarTarefaPendente(String descricao): Marca uma tarefa como 
	//pendente de acordo com a descrição.
	public void marcartarefaPendente(String descricao) {
		for (Tarefa t : tarefaSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
			}
		}
	}
	
	//limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
	public void limparListaTarefas() {
		if(tarefaSet.isEmpty()) {
			System.out.println("A lista já está vazia!");
		}
		else {
			tarefaSet.clear();
		}
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcartarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	}
}
