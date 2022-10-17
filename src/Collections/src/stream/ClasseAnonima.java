package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ClasseAnonima {

	public static void main(String[] args) {

		System.out.println("--\tOrdem aleatória\t--");
		Map<Integer, Contato> agenda = new HashMap<>() {
			{
				put(1, new Contato("Simba", 5555));
				put(4, new Contato("Cami", 1111));
				put(3, new Contato("Jon", 2222));
			}
		};

		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("----------------------");

		System.out.println("--\tOrdem Inserção\t--");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
			{
				put(1, new Contato("Simba", 5555));
				put(4, new Contato("Cami", 1111));
				put(3, new Contato("Jon", 2222));
			}
		};
		for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("----------------------");

		System.out.println("--\tOrdem id\t--");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("----------------------");

		System.out.println("--\tOrdem número telefone\t--");
		// Classe anônima
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
			@Override
			public int compare(Entry<Integer, Contato> contato1, Entry<Integer, Contato> contato2) {
				// TODO Auto-generated method stub
				return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
			}
		});

		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out
					.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
		}

		System.out.println("----------------------");

		System.out.println("--\tOrdem nome contato\t--");
		// Classe anônima
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
			@Override
			public int compare(Entry<Integer, Contato> contato1, Entry<Integer, Contato> contato2) {
				// TODO Auto-generated method stub
				return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
			}
		});

		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
	}
}
