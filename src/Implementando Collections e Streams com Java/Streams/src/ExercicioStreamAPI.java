import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("João", 12));
        estudantes.add(new Estudante("Paulo", 18));
        estudantes.add(new Estudante("Julia", 14));
        estudantes.add(new Estudante("Carina", 16));
        estudantes.add(new Estudante("Vitor", 13));
        estudantes.add(new Estudante("Sabrina", 10));
        estudantes.add(new Estudante("Barbara", 15));
        estudantes.add(new Estudante("Danilo", 11));

        // Transforme cada estudante em uma string com os atributos do objeto
        System.out.println(estudantes.toString());

        // Conte a quantidade de estudantes que tem na lista
        System.out.println("\nQuantos estudantes estão na lista? " + estudantes.stream().count());

        // Filtre estudantes com a idade superior ou igual a 18 anos
        System.out.println("\nIdade igual ou superior a 18 anos: " + estudantes.stream()
                .filter((estudante) -> estudante.getIdade() >= 18)
                .collect(Collectors.toList()));

        // Exiba cada elemento no console
        System.out.println("\nExibir todos os estudantes: ");
        estudantes.stream().forEach(System.out::println);

        // Retorne estudantes com nome que possui a letra 'B'
        System.out.println("\nEstudantes que contém a letra 'B' no nome: ");
        System.out.println(estudantes.stream()
                .filter((estudante) -> estudante.getNome().toLowerCase().contains("b"))
                .collect(Collectors.toList()));

        // Retorn se existe ao menos um estudante com a letra 'D' no nome
        System.out.println("\nExiste algum estudante com a letra 'd' no nome? ");
        System.out.println(estudantes.stream().anyMatch((estudante) -> estudante.getNome().contains("d")));
        System.out.println("\nExiste algum estudante com a letra 'D' no nome? ");
        System.out
                .println(estudantes.stream().anyMatch((estudante) -> estudante.getNome().toLowerCase().contains("d")));

        // Retorne o estudante mais velho da lista
        System.out.println(
                "\nEstudante mais velho: (Forma extensa) " + estudantes.stream().max(new Comparator<Estudante>() {
                    @Override
                    public int compare(Estudante obj1, Estudante obj2) {
                        return obj1.getIdade() - obj2.getIdade();
                    }
                }));

        // Retorne o estudante mais velho da lista
        System.out.println("Estudante mais velho: (Lambda Function) " + estudantes.stream()
                .max(Comparator.comparingInt((estudante) -> estudante.getIdade())));

        // Retorne o estudante mais novo da lista
        System.out.println(
                "\nEstudante mais novo: (Forma extensa) " + estudantes.stream().min(new Comparator<Estudante>() {
                    @Override
                    public int compare(Estudante obj1, Estudante obj2) {
                        return obj1.getIdade() - obj2.getIdade();
                    }
                }));

        // Retorne o estudante mais novo da lista
        System.out.println("Estudante mais novo: (Lambda Function) " + estudantes.stream()
                .min(Comparator.comparingInt((estudante) -> estudante.getIdade())));
    }
}
