package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    /*@Test
    public void testSumar(){
        //Example example = new Example();
        //int result = example.sumar(10,5);
        //VALOR ESPERADO Y VALOR ACTUAL
        //assertEquals(15,result);

    }*/

    @Test
    public void testSumar(){
        //Given - Teniendo: Insumos
            Example example = new Example();
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
        Example example = new Example();
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
        Example example = new Example();
        int number = -1;

        //Then
        assertThrows(IllegalArgumentException.class, () ->
                example.checkPositivo(number));

    }
}
