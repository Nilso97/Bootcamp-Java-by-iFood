import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) throws Exception {
        
        List<String> nomes = new ArrayList<>();

        nomes.add("Paulo");
        nomes.add("João");
        nomes.add("Anderson");
        nomes.add("Carol");
        nomes.add("Sabrina");

        nomes.set(3, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(2);
        System.out.println(nomes);

        String nome = nomes.get(0);
        System.out.println(nome);

        int posicao = nomes.indexOf("Paulo");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        Boolean contemNome = nomes.contains("Paulo");
        System.out.println(contemNome);

        Boolean listaStatus = nomes.isEmpty();
        System.out.println(listaStatus);

        for (String item : nomes) {
            System.out.println("Nome (for): " + item);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("Nome (while): " +iterator.next());
        }

        nomes.clear();

        listaStatus = nomes.isEmpty();
        System.out.println(listaStatus);
    }
}
