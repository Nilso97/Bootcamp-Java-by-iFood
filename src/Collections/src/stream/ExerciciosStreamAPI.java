package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

	public static void main(String[] args) {

		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

		System.out.println("Imprima todos os elementos desta lista de Strings: ");
		// Stream API - 1° Forma
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String elementos) {
				// TODO Auto-generated method stub
				System.out.println(elementos);
			}
		});

		// Stream API com Lambda - 2° Forma
		numerosAleatorios.forEach(elemento -> System.out.println(elemento));

		// Stream API com Reference Method - 3° Forma
		numerosAleatorios.forEach(System.out::println);

		System.out.println("---------------------------------------------------------");

		System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
				.forEach(elemento -> System.out.println(elemento)); // lambda
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println); // reference
																										// method

		System.out.println("---------------------------------------------------------");

		System.out.println("Transforme esta lista de string em uma lista de numeros inteiros: ");
		// 1° Forma
		numerosAleatorios.stream().map(new Function<String, Integer>() {
			@Override
			public Integer apply(String elementos) {
				// TODO Auto-generated method stub
				return Integer.parseInt(elementos);
			}
		});
		// 2° Forma
		numerosAleatorios.stream().map(elementos -> Integer.parseInt(elementos)).collect(Collectors.toList())
				.forEach(elementos -> System.out.println(elementos)); // lambda

		// 3° Forma
		List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()); // reference method
		System.out.println(collectList);	
	}
}
