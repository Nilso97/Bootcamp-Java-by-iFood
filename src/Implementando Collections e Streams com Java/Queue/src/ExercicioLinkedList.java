import java.util.LinkedList;
import java.util.Queue;

public class ExercicioLinkedList {

    public static void main(String[] args) throws Exception {
        
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        for (String cliente : filaBanco) {
            System.out.println("Nome cliente: " + cliente);
        }

        System.out.println(filaBanco.peek());

        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);

        filaBanco.add("Daniel");
        System.out.println(filaBanco);

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        Boolean contemCliente = filaBanco.contains("Carlos");
        System.out.println(contemCliente);
    }
}
