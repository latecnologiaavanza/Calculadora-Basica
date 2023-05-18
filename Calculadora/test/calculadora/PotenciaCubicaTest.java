/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class PotenciaCubicaTest {
    
    public PotenciaCubicaTest() {
    }

    @Test
    public void testGetPotenciaCubica() {
        System.out.println("getPotenciaCubica");
        String entrada = "-5";
        Calculadora instance = new Calculadora();
        double expResult = -125.0;
        double result = instance.getPotenciaCubica(entrada);
        assertEquals(expResult, result, 0.0);
    }
    
}
