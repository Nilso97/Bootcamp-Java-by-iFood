import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    
    public static void main(String[] args) {
        
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Paulo", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Sabrina", 18));
        estudantes.add(new Estudante("Suzana", 20));
        estudantes.add(new Estudante("Fábio", 22));
        estudantes.add(new Estudante("João", 21));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(estudantes);

        System.out.println("\n--- Menor para o Maior (no Lambda functions) ---");
        estudantes.sort(new Comparator<Estudante>() {
            @Override
            public int compare(Estudante obj1, Estudante obj2) {
                return obj1.getIdade() - obj2.getIdade();
            }
        });
        System.out.println(estudantes);

        System.out.println("\n--- Menor para o Maior (no Lambda functions) ---");
        estudantes.sort(new Comparator<Estudante>() {
            @Override
            public int compare(Estudante obj1, Estudante obj2) {
                return obj2.getIdade() - obj1.getIdade();
            }
        });
        System.out.println(estudantes);

        System.out.println("\n--- Menor para o Maior ---");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);
        System.out.println("Reference method ::");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        System.out.println("\n--- Ordem inversa: Maior para o Menor ---");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);
        System.out.println("Reference method ::");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("\n--- Menor para o Maior (with Collections) ---");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("\n--- Ordem inversa: Maior para o Menor (with Collections) ---");
        Collections.sort(estudantes, new EstudanteOrdemReversaComparator());
        System.out.println(estudantes);
    }
}
