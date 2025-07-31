package dio.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import main.java.set.Ordenacao.Aluno;

public class GerenciadorAlunos {
	
	private Set <Aluno> gerenciadorSet;
	
	public GerenciadorAlunos() {
		this.gerenciadorSet = new HashSet<>();
	}
	
	//adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
	public void adicionarAluno(String nome, Long matricula, double media) {
		gerenciadorSet.add(new Aluno(nome, matricula, media));
	}
	
	//removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		if (!gerenciadorSet.isEmpty()) {
			for (Aluno a : gerenciadorSet) {
				if (a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			gerenciadorSet.remove(alunoParaRemover);
		}
		else {
			System.out.println("Na lista não tem nada para remover");
		}
		
	}

	//exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
	public void exibirAlunosPorNome(){
		Set <Aluno> alunoPorNome = new TreeSet <>(gerenciadorSet);
		if(!gerenciadorSet.isEmpty()) {
			System.out.println(alunoPorNome);
		}
		else {
			System.out.println("Não tem nada na lista!");
		}
	}
	
	//exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
	public void exibirAlunosPorNota() {
		Set <Aluno> alunoPorNota = new TreeSet<>(gerenciadorSet);
		if(!gerenciadorSet.isEmpty()) {
			alunoPorNota.addAll(gerenciadorSet);
			System.out.println(alunoPorNota);
		}
		else {
			System.out.println("Não tem nada na lista!");
		}
	}
	
	//exibirAlunos(): Exibe todos os alunos do conjunto
	public void exibirAlunos() {
		for (Aluno a : gerenciadorSet) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
	    // Criando uma instância do GerenciadorAlunos
	    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

	    // Adicionando alunos ao gerenciador
	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    // Exibindo todos os alunos no gerenciador
	    System.out.println("Alunos no gerenciador:");
	    System.out.println(gerenciadorAlunos.gerenciadorSet);

	    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
	    gerenciadorAlunos.removerAluno(000L);
	    gerenciadorAlunos.removerAluno(123457L);
	    System.out.println(gerenciadorAlunos.gerenciadorSet);

	    // Exibindo alunos ordenados por nome
	    gerenciadorAlunos.exibirAlunosPorNome();

	    // Exibindo alunos ordenados por nota
	    gerenciadorAlunos.exibirAlunosPorNota();
	  }
}
