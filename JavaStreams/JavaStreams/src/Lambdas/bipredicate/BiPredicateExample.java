package Lambdas.bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[]args){
         /*
         TIPO DE LAMDBA : BiPredicate.
         DESCRIPCION    : Recibe dos parametros y retorna un resultado de tipo boolean.
         */

        BiPredicate<Integer,Integer> predicate = (a,b) -> {
            return a > b;
        };
        boolean result = predicate.test(10,10);
        System.out.println(result);

        //FORMA RESUMIDA
        BiPredicate<Integer,Integer> predicateDos = (a,b) -> a > b;
        System.out.println(predicateDos.test(100,1));
    }
}
