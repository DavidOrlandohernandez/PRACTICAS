package org.example;

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

    
}
