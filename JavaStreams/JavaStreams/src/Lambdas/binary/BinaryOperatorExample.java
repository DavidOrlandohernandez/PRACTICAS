package Lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String [] args) {

         /*
         TIPO DE LAMDBA : Binary.
         DESCRIPCION    : Recibe dos parametros del mismo tipo
                          y retorna un resultado del mismo tipo.
         */
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };

        BinaryOperator<Integer> binaryOperatorDos = (a, b) ->  a + b;

        binaryOperator.apply(10,10);
        System.out.println(binaryOperator.apply(10,10));
        System.out.println(binaryOperator.apply(100,300));
    }
}
