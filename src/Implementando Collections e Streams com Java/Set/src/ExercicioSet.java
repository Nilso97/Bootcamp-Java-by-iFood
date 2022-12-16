import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;
import java.util.Set;

public class ExercicioSet {
    
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
        // LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        // TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (Integer numero : numeros) {
            System.out.println("Número: " + numero);
        }

        numeros.remove(3);
        System.out.println(numeros);

        numeros.add(23);
        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());
    }
}
