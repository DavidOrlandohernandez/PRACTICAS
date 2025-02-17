package Lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String [] args){
       /*
         TIPO DE LAMDBA : Callable.
         DESCRIPCION    : No recibe parametros, pero retorna un resultado y puede lanzar una excepción.
         */

        Callable<String> callable = () -> {
            return "Resultado de la tarea";
        };

        try {
            String result = callable.call();
            System.out.println(result);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
