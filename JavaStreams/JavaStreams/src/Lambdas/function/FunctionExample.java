package Lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
         /*
         TIPO DE LAMDBA : Function.
         DESCRIPCION    : Recibe un parametro y retorna un resultado.
         */

        Function<String, String> function = (a) ->{
            String fusion = "Este es el valor de a:" + a;
            return fusion;
        };
        System.out.println(function.apply("CUALQUIER COSA"));

        //FORMA RESUMIDA
        Function<Integer, String> functionDos = (a) -> "El numero es " + a;
        System.out.println(functionDos.apply(100));


    }
}
