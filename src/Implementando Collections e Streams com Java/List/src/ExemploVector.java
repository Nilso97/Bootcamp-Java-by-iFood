import java.util.List;
import java.util.Vector;

public class ExemploVector {

     public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Ping Pong");
        esportes.add("Volêi");
        esportes.add("Basquete");
        esportes.add("Handebol");
        esportes.add("Queimada");

        System.out.println(esportes);

        esportes.set(1, "Tênis de Mesa");
        System.out.println(esportes);

        esportes.remove(5 /* ou pelo nome "Queimada" */);
        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for (String esporte : esportes) {
            System.out.println("Esporte: " + esporte);
        }

        esportes.removeAll(esportes);

        Boolean vetorStatus = esportes.isEmpty();
        System.out.println(vetorStatus);
     }
}
