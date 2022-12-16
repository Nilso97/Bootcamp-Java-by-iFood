import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);
        System.out.println(nomes);

        int quantidade = nomes.size();
        System.out.println(quantidade);

        Boolean contemNome = nomes.contains("Juliana");
        System.out.println(contemNome);

        List<String> novaLista = new ArrayList<>();

        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println(novaLista);

        nomes.addAll(novaLista);

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        Boolean listaStatus = nomes.isEmpty();
        System.out.println(listaStatus);
    }
}
