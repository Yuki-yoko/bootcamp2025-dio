package OperacoesBasicas;

public class Tarefa {
	
	//Atributo:
	private String descricao;
	
	//Contrutores 
	public Tarefa (String descricao) {
		this.descricao = descricao;
	}
	
	//Como a desrição está como privado e queremos acessar ela, então criamos o get
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return "Tarefa{" +
				"descrocao='" + descricao + '\'' + 
				'}';
	}
}
