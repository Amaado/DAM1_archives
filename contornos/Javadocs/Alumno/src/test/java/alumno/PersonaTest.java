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
 * Clase para hacer pruebas sobre Alumno
 * @author Usuario
 */
public class PersonaTest {

    /**
     * Constructor por defecto
     */
    public PersonaTest() {
    }

    /**
     * Método que se ejecuta siempre antes de todas las pruebas
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
     * Método que se ejecuta al finalizar cada prueba
     */
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Prueba del método comprobarDNI
     * Comprueba si el DNI es correcto o no
     */
    @Test
    public void testComprobarDNI() {
        System.out.println("comprobarDNI");
        Persona instance = new Persona("PersonaTest", "12345678Z", LocalDate.now());
        boolean expResult = true;
        boolean result = instance.comprobarDNI();
        assertEquals(expResult, result);
        instance.setDni("12345678A");
        expResult = false;
        result = instance.comprobarDNI();
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método asignarLetraDNI
     * Asigna una letra correcta para el DNI de la persona
     */
    @Test
    public void testAsignarLetraDNI() {
        System.out.println("asignarLetraDNI");
        Persona instance = new Persona("PersonaTest", "12345678", LocalDate.now());
        instance.asignarLetraDNI();
        String expResult = "12345678Z";
        assertEquals(expResult, instance.getDni());
    }
    
}
