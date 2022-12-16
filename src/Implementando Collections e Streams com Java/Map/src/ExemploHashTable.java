import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    
    public static void main(String[] args) {
        
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 23);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 38);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        estudantes.remove("Pedro");
        System.out.println(estudantes);

        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> estudante : estudantes.entrySet()) {
            System.out.println(estudante.getKey() + " --- " + estudante.getValue());
        }

        for (String key : estudantes.keySet()) {
            System.out.println(key + " --- " + estudantes.get(key));
        }

        System.out.println(estudantes);
    }
}
