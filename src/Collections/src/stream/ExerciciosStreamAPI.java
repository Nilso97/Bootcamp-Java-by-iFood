package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

	public static void main(String[] args) {

		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

		System.out.println("Imprima todos os elementos dessa lista de String: ");
		System.out.println("1° Forma - comum");
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String elemento) {
				// TODO Auto-generated method stub
				System.out.println(elemento);
			}
		});

		System.out.println("\n2° Forma - Lambda");
		numerosAleatorios.forEach(elemento -> System.out.println(elemento));

		System.out.println("\n3° Forma - Reference Method");
		numerosAleatorios.forEach(System.out::println);

		System.out.println("-----------------------------");

		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
		System.out.println("1° Forma");
		Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
		System.out.println(collectSet);

		System.out.println("\n2° Forma - Reference Method");
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println("-----------------------------");

		System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
		System.out.println("1° Forma - comum");
		numerosAleatorios.stream().map(new Function<String, Integer>() {
			@Override
			public Integer apply(String string) {
				// TODO Auto-generated method stub
				return Integer.parseInt(string);
			}
		});

		System.out.println("\n2° Forma - Lambda");
		numerosAleatorios.stream().map(string -> Integer.parseInt(string)).collect(Collectors.toList())
				.forEach(string -> System.out.println(string));

		System.out.println("\n3° Forma - Reference Method");
		List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(collectList);

		System.out.println("-----------------------------");

		System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
		List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt)
				.filter(numero -> (numero % 2 == 0 && numero > 2)).collect(Collectors.toList());
		System.out.println(listParesMaioresQue2);

		System.out.println("-----------------------------");

		System.out.println("Mostre a média dos números: ");
		System.out.println("1° Forma - Forma extensa");
		numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
			@Override
			public int applyAsInt(String string) {
				// TODO Auto-generated method stub
				return Integer.parseInt(string);
			}
		}).average().ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double valor) {
				// TODO Auto-generated method stub
				System.out.println(valor);
			}
		});

		System.out.println("\n2° Forma - Reference Method");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

		System.out.println("-----------------------------");

		System.out.println("Remova os valores ímpares: ");
		List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(string -> Integer.parseInt(string))
				.collect(Collectors.toList());
		System.out.println("1° Forma - Forma extensa");
		numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer numero) {
				// TODO Auto-generated method stub
				if (numero % 2 != 0)
					return true;
				return false;
			}
		});
		System.out.println(numerosAleatoriosInteger);

		System.out.println("\n2° Forma - Lambda");
		numerosAleatoriosInteger.removeIf(numero -> (numero % 2 != 0));
		System.out.println(numerosAleatoriosInteger);

		System.out.println("-----------------------------");

		System.out.println("Mostre o maior valor da lista: ");
		System.out.println("1° Forma - Reference Method");
		numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);

		System.out.println("-----------------------------");

		System.out.println("Mostre o menor valor da lista: ");
		System.out.println("1° Forma - Reference Method");
		numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);
	}
}
