/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel Dória
 */
public class Registro2Test {
    
    public Registro2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of validaEmail method, of class Registro2.
     */
    @Test
    public void testValidaEmail() {
        System.out.println("validaEmail");
        String email = "";
        boolean expResult = false;
        boolean result = Registro2.validaEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaUsuario method, of class Registro2.
     */
    @Test
    public void testValidaUsuario() {
        System.out.println("validaUsuario");
        String usuario = "";
        boolean expResult = false;
        boolean result = Registro2.validaUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaData method, of class Registro2.
     */
    @Test
    public void testValidaData() {
        System.out.println("validaData");
        String data = "";
        boolean expResult = false;
        boolean result = Registro2.validaData(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
