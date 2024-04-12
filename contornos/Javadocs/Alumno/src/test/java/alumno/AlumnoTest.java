/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase para hacer pruebas de Alumno
 * @author Usuario
 */
public class AlumnoTest {

    /**
     * Constructor por defecto
     */
    public AlumnoTest() {
    }

    /**
     * Método que se ejecuta siempre antes de ejecutar los demás métodos
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Método que se ejecuta al finalizar todas las pruebas
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Método que se ejecuta antes de cada prueba
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Método que se ejecuta después de cada prueba
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Prueba del método esMayorDeEdad
     * Comprueba si una persona es mayor de edad
     */
    @Test
    public void testEsMayorDeEdad() {
        System.out.println("esMayorDeEdad");
        Alumno instance = new Alumno("PersonaTest1", "12345678Z", LocalDate.parse("2000-01-01"));
        boolean expResult = true;
        boolean result = instance.esMayorDeEdad();
        assertEquals(expResult, result);
    
        instance = new Alumno("PersonaTest2", "12345678Z", LocalDate.parse("2010-01-01"));
         expResult = false;
         result = instance.esMayorDeEdad();
        assertEquals(expResult, result);
    }
    
}
