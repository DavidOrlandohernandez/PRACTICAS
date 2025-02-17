package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=wQOEWDvdvrU

public class StreamExamples {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Ana", "Luis", "Maria","Pedro","Juan","Carla", "Juan", "Juan");

        //El foreach es un operador FINAL que no regresa ningun tipo de valor.
        //Trabaja con una función lambda de tipo Consumer, la cual regresa solicita
        //un valor  como parametro de entrada. pero no retorna nada. FINAL
        names.stream()
                .forEach((name) -> { //Función lambda Consumer
                    System.out.println(name);
                });

        names.stream()
                .forEach((name) -> System.out.println(name)); //Por el tipo de ejemplo, podemos reducir la expresión lambda cuando se retorna el mismo dato que le estamos dando de entrada. En este caso el name.


        //OPERADOR NO FINAL FILTER : filtrar los elementos que cumplen una condición.
        //FUNCION LAMBDA PREDICATE : recibe un elemento y retorna un boolean.
        System.out.println("::::::::::::::::::::::::::::::::::::::::FILTER EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        names.stream()
                .filter((name)->{
                    return name.length() > 4;
                }).forEach((name) -> System.out.println(" "+ name));

        System.out.println("::::::::::::::::::::::::::::::::::::::::MAP EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        names.stream()
                .map((name)-> name.toUpperCase())
                .filter((name)-> name.startsWith("A"))
                .forEach((name)-> System.out.println(""+ name));

        names.stream()
                .map(String::toUpperCase).
                forEach(System.out::println);

        System.out.println("::::::::::::::::::::::::::::::::::::::::SORTED EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        //Sorted puede manipularse para agregar filtros mas especificos y utilizarlos segun la nececidad
        //Usa una funcion lamda que se llama Comparator
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::::FOREACH EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        names.stream()
                .forEach((name) -> {
                    //Consultas a bases de datos
                    //Inserciones ETC.
                });

        System.out.println("::::::::::::::::::::::::::::::::::::::::REDUCE EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        // Combina todos los elementos en un solo valor
        String result = names.stream()
                .reduce("RESULTADO",(a,b)-> a +"   "+ b);
        System.out.println(result);

        System.out.println("::::::::::::::::::::::::::::::::::::::::COLLECT EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        List<String> resultD =  names.stream()
                .map((name)-> name.toUpperCase()) // Tambien por versiones superiores de Java puedes usar el ToList directamente
                .collect(Collectors.toList()); //Lambda -> Collector

        resultD.stream().forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::::DISTINCT EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        names.stream().distinct().forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::::LIMIT EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        names.stream().limit(3).forEach(System.out::println);
        System.out.println("::::::::::::::::::::::::::::::::::::::::SKIP EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        names.stream().skip(3).forEach(System.out::println);

        System.out.println("::::::::::::::::::::::::::::::::::::::::ANYMATCH EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        boolean res =
        names.stream().anyMatch((name)-> name.startsWith("J"));
        System.out.println(res);

        System.out.println("::::::::::::::::::::::::::::::::::::::::ALLMATCH EXAMPLE::::::::::::::::::::::::::::::::::::::::");
        res = names.stream().allMatch((name)-> name.startsWith("J")); // Todos deberian de cumplir la codicion para que sea true
        System.out.println(res);

        res = names.stream()
                .allMatch((name) -> {
                   return name.startsWith("A");
                });

        System.out.println(res);
        System.out.println("::::::::::::::::::::::::::::::::::::::::NONEMATCH EXAMPLE::::::::::::::::::::::::::::::::::::::::");

        res = names.stream().noneMatch((name)-> {
           return name.length() == 100; // Ninguno cumple con la condición.
        });

        System.out.println(res);

        //Streams son la base de la programación reactiva. API STREAMS
    }
}
