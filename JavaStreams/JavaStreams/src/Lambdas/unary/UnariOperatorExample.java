package Lambdas.unary;

import java.util.function.UnaryOperator;

public class UnariOperatorExample {
    public static void main(String [] args){


          /*
         TIPO DE LAMDBA : Binary.
         DESCRIPCION    : Recibe un parametro del mismo tipo
                          y retorna un resultado del mismo tipo.
         */
        UnaryOperator<Integer> unaryOperator = (a) ->{
          return a * a;
        };

        UnaryOperator<Integer> unaryOperatorDos = (a) -> a * a;
        System.out.println(unaryOperatorDos.apply(10));

    }
}
