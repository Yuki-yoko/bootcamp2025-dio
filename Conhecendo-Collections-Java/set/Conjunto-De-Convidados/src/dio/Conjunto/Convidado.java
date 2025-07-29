package dio.Conjunto;

import java.util.Objects;

public class Convidado {
	
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
 /**Crie uma classe chamada "ConjuntoConvidados" que possui 
  * um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado 
  * possui atributos como nome e código do convite. Implemente os seguintes métodos:
  * 
  * adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto
  * 
  * removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto 
  * com base no código do convite.
  * 
  * contarConvidados(): Conta o número total de convidados no Set.
  * 
  * exibirConvidados(): Exibe todos os convidados do conjunto.
  */
