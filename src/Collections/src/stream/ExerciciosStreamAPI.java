package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) throws Exception {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        System.out.println("Lambda + Reference method");
        numerosAleatorios.forEach(elemento -> System.out.println(elemento));
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        System.out.println("Reference method");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return Integer.parseInt(string);
            }
        }).collect(Collectors.toList()); /* .forEach(System.out::println); */

        System.out.println("Lambda + Reference method");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(string -> Integer.parseInt(string))
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer numero) {
                        if (numero % 2 == 0 && numero > 2)
                            return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Lambda + Reference method");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(numero -> (numero % 2 == 0 && numero > 2))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nMostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String string) {
                        return Integer.parseInt(string);
                    }
                }).average().ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double valor) {
                        System.out.println(valor);
                    }
                });

        System.out.println("Reference method + Lambda");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(valor -> System.out.println(valor));

        System.out.println("\nRemova os valores ímpares: ");
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0)
                    return true;
                return false;
            }
        });

        System.out.println("Lambda");
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

        System.out.println("\nMostre o menor valor da lista: ");
        System.out.println("Reference method");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("\nMostre o maior valor da lista: ");
        System.out.println("Reference method");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
    }
}
