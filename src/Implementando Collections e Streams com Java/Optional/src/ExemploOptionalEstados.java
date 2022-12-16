import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Valor opcional que está presente");
        Optional<String> optionalString = Optional.of("Valor presente");
        if (optionalString.isPresent()) {
            System.out.println(optionalString);
        } else {
            System.out.println("não está presente");
        }
        
        System.out.println("\nValor opcional que não está presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        if (optionalNull.isPresent()) {
            System.out.println("Valor presente");
        }
        System.out.println("null = é nulo");

        System.out.println("\nValor opcional que não está presente");
        Optional<String> emptyOptional = Optional.empty();
        if (emptyOptional.isPresent()) {
            System.out.println("Valor presente");
        }
        System.out.println("empty = está vazio");

        System.out.println("\nValor opcional que lança erro NullPointerException");
        Optional<String> optionalNullErro = Optional.of(null);
        if (optionalNullErro.isPresent()) {
            System.out.println("Valor presente");
        }
    }
}
