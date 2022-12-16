import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) throws Exception {
        
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();
        
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa.get("Brasil"));

        System.out.println(campeoesMundialFifa.containsKey("Alemanha"));
        System.out.println(campeoesMundialFifa.containsValue(8));

        System.out.println(campeoesMundialFifa.remove("Itália", 4));
        System.out.println(campeoesMundialFifa);
        System.out.println(campeoesMundialFifa.containsKey("Itália"));

        System.out.println(campeoesMundialFifa.size());

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        System.out.println("\n---------------------------------------------\n");

        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " --- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));
        System.out.println(campeoesMundialFifa.containsValue(5));

        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.isEmpty());
        
        System.out.println(campeoesMundialFifa.size());
    }
}
