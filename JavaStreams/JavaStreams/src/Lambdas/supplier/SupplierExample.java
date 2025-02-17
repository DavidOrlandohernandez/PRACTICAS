package Lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
         /*
         TIPO DE LAMDBA : Supplier.
         DESCRIPCION    : No recibe valor pero si retorna un resultado
         */

        Supplier<String> spplier = () -> {
          return "Hola, soy un supplier";
        };
        String result = spplier.get();
        System.out.println(result);

        Supplier<String> spplierDos = () -> "Hola, soy un supplier Dos";
        System.out.println(spplierDos.get());
    }
}
