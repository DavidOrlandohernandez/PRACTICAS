package Lambdas.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
         /*
         TIPO DE LAMDBA : Function.
         DESCRIPCION    : Recibe dos valores y retorna un resultado.
         */

        BiFunction<Integer, Integer, Integer> function = (a,b) ->{
            return a+b;
        };
        System.out.println(function.apply(10,20));

        //FORMA RESUMIDA
        BiFunction<Integer, Integer, Integer> functionDos = (a,b) -> a + b;
        System.out.println(functionDos.apply(100,200));

    }
}
