/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entornosdesarrollo.pruebasJunit2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CuentaTest {
    
    public CuentaTest() {
    }

    @Test
    public void testDeposita() {
        System.out.println("deposita");
        int q = 100;
        Cuenta instance = new Cuenta(0,"c");
        int expResult = 100;
        int result = instance.deposita(q);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRetira() {
        System.out.println("retira");
        int q = 200;
        String cc = "c";
        Cuenta instance = new Cuenta(300,"c");
        int expResult = 200; //Resultado esperado q
        int result = instance.retira(q, cc);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDimeSaldo() {
        System.out.println("dimeSaldo");
        Cuenta instance = null;
        int expResult = 0;
        int result = instance.dimeSaldo();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDimeContra() {
        System.out.println("dimeContra");
        Cuenta instance = new Cuenta(0,"contraseña");
        String expResult = "contraseña";
        String result = instance.dimeContra();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
