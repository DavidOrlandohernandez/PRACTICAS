package Lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        /*
         TIPO DE LAMDBA : BiConsumer.
         DESCRIPCION    : Recibe dos valores y no retorna nada
        */

        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println(a + " " + b );
        };

        BiConsumer<String, String> biConsumer2 = (a,b) -> System.out.println(a + " " + b );

        biConsumer.accept("Hola", "Mundo");
        biConsumer2.accept("HOLA", "DE NUEVO");
    }
}
