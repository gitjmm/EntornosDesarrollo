/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entornosdesarrollo.pruebasJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }

    

    /**
     * Test of getN1 method, of class Operaciones.
     */
    @org.junit.jupiter.api.Test
    public void testGetN1() {
        System.out.println("getN1");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getN1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getN2 method, of class Operaciones.
     */
    @org.junit.jupiter.api.Test
    public void testGetN2() {
        System.out.println("getN2");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getN2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Operaciones.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        int n1 = 2;
        int n2 = 4;
        Operaciones instance = new Operaciones();
        int expResult = 6;
        int result = instance.suma(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Operaciones.
     */
    @org.junit.jupiter.api.Test
    public void testResta() {
        System.out.println("resta");
        int n1 = 0;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.resta(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
