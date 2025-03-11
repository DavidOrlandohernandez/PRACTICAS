package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    /*@Test
    public void testSumar(){
        //Example example = new Example();
        //int result = example.sumar(10,5);
        //VALOR ESPERADO Y VALOR ACTUAL
        //assertEquals(15,result);

    }*/

    private Example example;
    //Genera una nueva instancia para cada metodo que utilize el objeto
    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        //Given - Teniendo: Insumos
            //Example example = new Example();
            int parametroA = 3;
            int parametroB = 3;
        //When - Cuando
            int result =
                    example.sumar(parametroA, parametroB);
        //Then - Entonces
            assertEquals(6, result);
            assertNotNull(result);
            assertInstanceOf(Integer.class, result);
    }
    @Test
    public void testCheckPositivo(){

        //Given
        //Example example = new Example();
        int number = 4;
        //When
        boolean result = example.checkPositivo(number);
        //Then
        assertTrue(result);
        assertInstanceOf(Boolean.class,result);
    }
    @Test
    public void checkPostivoError(){
        //Given
        //Example example = new Example();
        int number = -1;

        //Then
        assertThrows(IllegalArgumentException.class, () ->
                example.checkPositivo(number));

    }

    @Test
    public void testContarLetras(){

        //Given
        //Example example = new Example();
        String letra = "Un programador nace";

        //When
        int result = example.contarLetras(letra);

        //Then
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    public void testContieneElemento(){

        //Given
        List<String> ciudades = List.of("Culiacan", "Mazatlan", "Mochis");
        String ciudad = "Mazatlan";
        //When
        boolean result = example.contieneElemento(ciudades,ciudad);
        //Then
        assertTrue(result);
    }

    @Test
    public void testReverseCadena(){
        //Given
        String cadena = "david";
        //When
        String result = this.example.reverseCadena(cadena);
        //Then
        assertEquals("divad", result);
    }

    @Test
    public void testFactorial(){
        //Given
        int num = 6;
        //When
        long result = this.example.factorial(num);
        //Then
        assertEquals(720, result); ;
    }

    @Test
    public void testFactorialError(){
        //Given
        int num = -1;
        //When
        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(num);
        });
    }

    @Test
    public void testEsPrimo(){
        //GIVEN
        int number = 3;
        //WHEN
        boolean result = this.example.esPrimo(number);
        //THEN
        assertTrue(result);
    }

    @Test
    public void testEsPrimoLessThatOne(){
        //GIVEN
        int number = 1;
        //WHEN
        boolean result = this.example.esPrimo(number);
        //THEN
        assertFalse(result);
    }

    @Test
    public void testNoEsPrimoLess(){
        //GIVEN
        int number = 8;
        //WHEN
        boolean result = this.example.esPrimo(number);
        //THEN
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        String result = this.example.mensajeConRetraso();
        assertEquals( "Listo despues de retraso", result);
    }

    @Test
    public void convertirAString(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        List<String> res = this.example.convertirAString(numbers);
        assertEquals(List.of("1","2","3","4","5","6","7"), res);
    }

}
