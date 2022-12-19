package daw.programa.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void dosSumarDosEsCuatro() {
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.sumar(numero1, numero2));
    }

    @Test
    public void dosRestarDosEs0() {
        int expected = 0;
        int numero1 = 2, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.Restar(numero1, numero2));
    }

    @Test
    public void TresMultiplicarDosEsSeis() {
        int expected = 6;
        int numero1 = 3, numero2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.Multiplicar(numero1, numero2));
    }

}
