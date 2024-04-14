/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entornosdesarrollo.pruebasJunit3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CocheTest {
    
    public CocheTest() {
    }

  
    @Test
    public void testPrecioFinal() throws Exception {
        System.out.println("precioFinal");
        float descuento = 10.0F;
        Coche instance = new Coche("renault",10000);
        float expResult = 9000.0F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 1);
        //fail("The test case is a prototype.");
    }
    
}
