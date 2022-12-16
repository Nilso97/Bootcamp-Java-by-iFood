import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) throws Exception {
        
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.2);
        notasAlunos.add(8.5);
        notasAlunos.add(7.8);
        notasAlunos.add(9.8);
        notasAlunos.add(10.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(5.8);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> notas = notasAlunos.iterator();

        while (notas.hasNext()) {
            System.out.println(notas.next());
        }

        for (Double nota : notasAlunos) {
            System.out.println("Nota: " + nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());
    }
}
