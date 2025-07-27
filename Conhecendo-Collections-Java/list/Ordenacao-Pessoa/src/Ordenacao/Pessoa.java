package Ordenacao;

import java.util.Comparator;

//implementando a interface Comparable
public class Pessoa implements Comparable <Pessoa>{

	//atributos 
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa (String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, p.getIdade());
	}
	
	@Override
    public String toString() {
        return String.format("Pessoa{nome='%s', idade=%d, altura=%.2f}", nome, idade, altura);
    }
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}

	
	
}

//diferente do comparable, o comparator é criado fora
class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}