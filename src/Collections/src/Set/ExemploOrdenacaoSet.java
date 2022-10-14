package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {

		System.out.println("--\tOrdem aleatória \t---");
		Set<Serie> minhasSeries = new HashSet<>() {
			{
				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that ´70s show", "comédia", 25));
			}
		};
		for (Serie serie : minhasSeries) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("-----------------------------------");

		System.out.println("--\tOrdem de Insersão\t---");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
			{
				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that ´70s show", "comédia", 25));
			}
		};

		for (Serie serie : minhasSeries1) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("-----------------------------------");

		System.out.println("--\tOrdem Natural (TempoEpisodio)\t---");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("-----------------------------------");

		System.out.println("--\tOrdem Nome/Cor/Idade\t---");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		for (Serie serie : minhasSeries3) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("-----------------------------------");

		System.out.println("--\tOrdem genêro\t---");
		Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
		minhasSeries4.addAll(minhasSeries);
		for (Serie serie : minhasSeries4) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("------------------------------------");

		System.out.println("--\tOrdem tempo de episódio\t---");
		Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
		minhasSeries5.addAll(minhasSeries);
		for (Serie serie : minhasSeries5) {
			System.out.println("Série: " + serie.getNome() + "\nGenêro: " + serie.getGenero() + "\nDuração episódio: "
					+ serie.getTempoEpisodio() + "\n");
		}
		System.out.println("-------------------------------------");
	}
}

class Serie implements Comparable<Serie> {

	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		// TODO Auto-generated method stub
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0)
			return tempoEpisodio;

		return this.getGenero().compareTo(serie.getGenero());
	}
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie serie1, Serie serie2) {
		// TODO Auto-generated method stub
		int nome = serie1.getNome().compareTo(serie2.getNome());
		if (nome != 0)
			return nome;

		int genero = serie1.getGenero().compareTo(serie2.getGenero());
		if (genero != 0)
			return genero;

		return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());

	}
}

class ComparatorGenero implements Comparator<Serie> {

	@Override
	public int compare(Serie serie1, Serie serie2) {
		// TODO Auto-generated method stub
		return serie1.getGenero().compareTo(serie2.getGenero());
	}
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie serie1, Serie serie2) {
		// TODO Auto-generated method stub
		return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
	}
}
