package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	//Atributo
	//Dentro da Lista temos tarefas e chamamos o atributo de "tarefaList"
	private List<Tarefa> tarefaList;
	
	//Contrutor: Para criar a lista vazia
	//Em () não colocamos nada, prque não quemos receber nada
	public ListaTarefa(){
		//Quando criar um objeto queremos criar um novo arraylist vazio
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa (String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		//Como podemos ter o caso de ter mais de uma mesma descrição na lista, precisamos percorrer ela para exclir todos iguais a que queremos remover
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t: tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				//Se houver algum elemento da lista com a mesma desrição que quero remover, essa lista é adicionada a nova lista
				tarefasParaRemover.add(t);
			}
		}
		//Remove todos que tiverem na nova lista que está na tarefaList ( que a lista original)
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main (String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		//Para verificar que há 0 elementos na lista:
		System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		String descricao;
		listaTarefa.adicionarTarefa(descricao = "Tarefa 1");
		listaTarefa.adicionarTarefa(descricao = "Tarefa 1");
		listaTarefa.adicionarTarefa(descricao = "Tarefa 2");
		
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa(descricao = "Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//Quando colocamos somente isso aparece o endereço:
		listaTarefa.obterDescricoesTarefas();
		//Aparece dessa forma: [OperacoesBasicas.Tarefa@5e265ba4, OperacoesBasicas.Tarefa@156643d4]
		//Por isso, vamos na classe Tarefa e criamos o toString
	
	}
}
