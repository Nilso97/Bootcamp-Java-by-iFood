import java.util.Optional;

public class ExemploOptional {
    
    public static void main(String[] args) {
        
        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString.isPresent());

        optionalString.ifPresent(System.out::println);

        if (optionalString.isPresent()) {
            System.out.println(optionalString);
        } else {
            System.out.println("Valor não está presente");
        }

        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        Optional<String> optionalStringEmpty = Optional.empty();
        System.out.println(optionalStringEmpty.orElseThrow(IllegalStateException::new));
    }
}
