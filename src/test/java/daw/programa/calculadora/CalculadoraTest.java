package daw.programa.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void dosSumarDosEsCuatro() {
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.sumar(numero1, numero2));
    }
}
