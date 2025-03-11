package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

    //1.- Método para sumar dos numeros para prueba unitaria.
    public int sumar(int a, int b){
        return a+b;
    }

    //2-. Metodo que lanza una excepción si el argumento es negativo
    public boolean checkPositivo(int numero){
        if(numero < 0){
            throw  new IllegalArgumentException("El numero no puede ser negativo");
        }
        return true;
    }

    public int contarLetras(String cadena){
        return (int) cadena.chars()
                .filter(filter -> filter == 'a')
                .count();
    }

    public boolean contieneElemento(List<String> elementlist, String elemento){
        return elementlist.contains(elemento);
    }

    public String reverseCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

    public long factorial(int numero){
        if(numero < 0 ){
            throw new IllegalArgumentException("Factorual no definidio para numeros negativos");
        }
        long resultado = 1;
        for(int i = 1; i <= numero; i++ ){
            resultado *=i;
        }
        return resultado;
    }

    public boolean esPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for(int i = 2; i *i <= numero;i++) {
            if (numero % i ==0){
                return false;
            }
        }
        return true;
    }

    public String mensajeConRetraso() throws InterruptedException{
        Thread.sleep(5000);
        return "Listo despues de retraso";
    }

    public List<String> convertirAString(List<Integer> list){
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
