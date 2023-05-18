/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricse
 */
public class CalculadoraTest {

    public CalculadoraTest() {

    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void ElevarCuboMain() throws Exception {
        double resultado;
        double numero = 5;
        resultado = numero * numero * numero;
        double delta = 0.0001; // Tolerancia para la comparación
        assertEquals(125.0, resultado, delta);
        
        double numero2 = 2;
        resultado = numero2 * numero2 * numero2;
        assertEquals(8.0, resultado, delta);
    }
}


