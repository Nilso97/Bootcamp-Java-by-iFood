import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) throws Exception {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem dos elementos de stream
        System.out.println("Contagem: " + estudantes.stream().count() + " estudantes");

        // Retorna o elemento com o maior número de letras
        System.out.println(
                "\nMaior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor número de letras
        System.out.println("\nMenor número de letras: " + estudantes.stream().min(new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                return obj1.length() - obj2.length();
            }
        }));

        // Retorna os elementos que contém a letra "r" no nome
        System.out.println("\nContém a letra R no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenando a quantidade de letras de cada nome
        System.out.println("\nRetorna uma nova coleção com a quantidade de letras de cada nome: " + estudantes.stream()
                .map((estudante) -> estudante.concat(" - ")
                        .concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("\nRetorna os 3 primeiros elementos da coleção: "
                + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção - Forma 1 extensa
        System.out.println("\nRetorna os elementos: " + estudantes.stream()
                .peek(new Consumer<String>() {
                    @Override
                    public void accept(String estudante) {
                        System.out.println(estudante);
                    }
                }).collect(Collectors.toList()));

        System.out.println("\nRetorna os elementos: " + estudantes.stream()
                .peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("\nRetorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra "W" no nome - Forma extensa
        System.out.println("\nTem algum elemento com a letra 'W' no nome? " + estudantes.stream()
                .allMatch(new Predicate<String>() {
                    @Override
                    public boolean test(String elemento) {
                        if (elemento.contains("W")) {
                            return true;
                        }
                        return false;
                    }
                }));

        System.out.println("Todos os elementos contém a letra 'W' no nome? "
                + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elementos possui a letra "a" minúscula no nome
        System.out.println("\nTem algum elemento que contém a letra 'a' no nome? "
                + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna true se nenhum elemento possui a letra "a" minúscula no nome
        System.out.println("\nNenhum elemento que contém a letra 'a' no nome? "
                + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("\nRetorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada - Forma extensa
        System.out.println("\nOperação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
                // .collect(Collectors.toList())
                .collect(Collectors.joining(", "))
                // .collect(Collectors.toSet())
                // .collect(Collectors.groupingBy((estudante) -> estudante.substring(estudante.indexOf("-") + 1)))
                );
    }
}
