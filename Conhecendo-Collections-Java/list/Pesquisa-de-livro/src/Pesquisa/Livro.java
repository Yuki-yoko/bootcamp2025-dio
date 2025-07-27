package Pesquisa;

public class Livro {
	//atributos
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	//Para não aparecer o endereço dee memoria desses atributos:
	public String toString () {
		return "Livro{" + 
				"titulo=" + titulo + '\'' + 
				", autor=" + autor +'\''+
				", anoPublicacao=" + anoPublicacao +
				'}';
	}
	
}
