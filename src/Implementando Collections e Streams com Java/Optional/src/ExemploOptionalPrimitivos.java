import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.LongConsumer;

public class ExemploOptionalPrimitivos {
    
    public static void main(String[] args) {
        
        System.out.println("--- Valor inteiro opcional ---");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("\n--- Valor decimal opcional ---");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("\n--- Valor longo opcional ---");
        OptionalLong.of(23L).ifPresent(new LongConsumer() {
            @Override
            public void accept(long value) {
                System.out.println(value);
            }
        });
        System.out.println("*with Lambda function");
        OptionalLong.of(23L).ifPresent((value) -> System.out.println(value));
    }
}
