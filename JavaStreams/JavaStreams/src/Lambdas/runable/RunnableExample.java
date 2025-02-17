package Lambdas.runable;

public class RunnableExample {
    public static void main(String[]args) {
         /*
         TIPO DE LAMDBA : Runnable.
         DESCRIPCION    : No recibe parametros ejecuta una tarea .
         */

        Runnable runnable = () ->  {
            System.out.println("Ejecutando tarea...");
        };

        Runnable runnableDos = () -> System.out.println("Ejecutando tarea...");


        runnable.run();
        runnableDos.run();
    }
}
