package Lists;

import java.util.*;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>() {
			{
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}
		};

		System.out.println("--\tOrdem de Insersão\t---");
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		
		System.out.println("--\tOrdem aleatória \t---"); 
		Collections.shuffle(gatos);
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		
		System.out.println("--\tOrdem Natural (Nome)\t---");
		Collections.sort(gatos);
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		
		System.out.println("--\tOrdem Idade\t---");
		Collections.sort(gatos, new ComparatorIdade());
		// gatos.sort(new ComparatorIdade()); também funciona
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		
		System.out.println("--\tOrdem cor\t---");
		Collections.sort(gatos, new ComparatorCor());
		System.out.println(gatos);
		System.out.println("--------------------------");
		
		
		System.out.println("--\tOrdem Nome/Cor/Idade\t---");
		Collections.sort(gatos, new ComparatorNomeCorIdade());
		System.out.println(gatos);
		System.out.println("--------------------------");
	}
}

class Gato implements Comparable<Gato> {
	
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

	@Override
	public int compareTo(Gato gato) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		// TODO Auto-generated method stub
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {
		// TODO Auto-generated method stub
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
	
	/**
	 * 
	 * Ex. Cor == Cor retorna 0
	 * Ex. Gato1 > Gato2 retorna 1
	 * Ex. Gato1 < Gato2 retorna -1
	 */

	@Override
	public int compare(Gato gato1, Gato gato2) {
		// TODO Auto-generated method stub
		int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
		if (nome != 0) return nome;
		
		int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
}
