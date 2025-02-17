package Lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[]args){
         /*
         TIPO DE LAMDBA : Predicate.
         DESCRIPCION    : Recibe un parametro y retorna un resultado de tipo boolean.
         */

        Predicate<String> predicate = (param) -> {
            return param.length() > 5;
        };
        boolean result = predicate.test("Hola");
        System.out.println(result);

        //FORMA RESUMIDA
        Predicate<String> predicateDos = (param) ->  param.length() > 5;
        System.out.println(predicateDos.test("Hola mundo"));
    }

}
