import java.util.Optional;

public class ExercicioOptional {
    
    public static void main(String[] args) {
        
        System.out.println("1 - Optional presente");
        Optional<String> optionalString = Optional.of("Valor presente");

        optionalString.ifPresent(System.out::println);

        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("---")).ifPresent(System.out::println);

        System.out.println("\n-------------------------------------------------");
        System.out.println("\n2 - Optional vazio");
        Optional<String> optionalEmpty = Optional.empty();
        if (!optionalEmpty.isPresent()) {
            System.out.println("Optional vazio");
        }
        
        System.out.println(optionalEmpty.orElseThrow(IllegalStateException::new));
    }
}
