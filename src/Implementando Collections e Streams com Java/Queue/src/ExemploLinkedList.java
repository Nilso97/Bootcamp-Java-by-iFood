import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) throws Exception {
        
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("João");
        filaBanco.add("Carlos");
        filaBanco.add("Roberto");
        filaBanco.add("Pamela");
        filaBanco.add("Flávia");
        filaBanco.add("Anderson");

        String clienteASerAtendido = filaBanco.poll();
        System.out.printf("Primeiro(a) cliente a ser atendido será %s\n", clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }
        
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("Nome: " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();
        System.out.println(filaBanco.isEmpty());
    }
}
