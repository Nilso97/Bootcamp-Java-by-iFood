import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) throws Exception {
        
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(11);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(0);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(11);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        Iterator<Integer> numeros = sequenciaNumerica.iterator();
        while (numeros.hasNext()) {
            System.out.println(numeros.next());
        }

        for (Integer numero : sequenciaNumerica) {
            System.out.println("Número: " + numero);
        }

        sequenciaNumerica.clear();

        System.out.println(sequenciaNumerica.isEmpty());
    }
}
