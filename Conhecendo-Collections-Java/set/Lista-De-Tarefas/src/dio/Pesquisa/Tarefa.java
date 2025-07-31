package dio.Pesquisa;

import java.util.Objects;

public class Tarefa {
	
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isconcluida() {
		return concluida;
	}
	
	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
	}
	
	
}

/**
 * Crie uma classe chamada "ListaTarefas" que possui um conjunto 
 * de objetos do tipo "Tarefa" como atributo. Cada tarefa possui 
 * um atributo de descrição e um atributo booleano para indicar 
 * se a tarefa foi concluída ou não. Implemente os seguintes métodos:
 * 
*/
