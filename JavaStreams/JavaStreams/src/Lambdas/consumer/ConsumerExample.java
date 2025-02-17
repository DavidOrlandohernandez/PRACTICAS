package Lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        /*
         TIPO DE LAMDBA : Consumer.
         DESCRIPCION    : Recibe un valor y no retorna nada
        */

        Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };

        Consumer<String> consumerResumido = System.out::println;

        consumer.accept("Exemplo de expresión Lamdba Consumer");
        consumerResumido.accept("Ejemplo de expresión dos resumida");
    }
}