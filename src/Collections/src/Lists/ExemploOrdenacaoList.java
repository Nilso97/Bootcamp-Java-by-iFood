package Lists;

import java.util.*;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {

		List<Gato> gatos = new ArrayList<>() {
			{
				add(new Gato("Jon", 18, "cinza"));
				add(new Gato("Simba", 6, "preto"));
				add(new Gato("Tom", 12, "tigrado"));
			}
		};
		
		System.out.println("--\tOrdem de Insersão\t---");
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		System.out.println("--\tOrdem aleatória\t---"); 
		// Aula - List - Ordenação de elementos em uma coleção List - parte 1 - 06 min e 20 seg
	}
}

class Gato {

	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}
}
