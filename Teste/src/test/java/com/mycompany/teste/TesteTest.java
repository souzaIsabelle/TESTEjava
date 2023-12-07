/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TesteTest {
    
    @Test
    public void testMETODO() {
      
        Teste proj = new Teste();
        assertEquals(10,proj.metodoSOMA());
    }
    
     @Test
    public void testMETODOSUB() {
      
        Teste proj = new Teste();
        assertEquals(0,proj.metodoSUB());
    }
    
     @Test
    public void testMETODODIV() {
      
        Teste proj = new Teste();
        assertEquals(3,proj.metodoDIVISAO());
    }
    
       @Test
    public void testMETODOMULTI() {
      
        Teste proj = new Teste();
        assertEquals(12,proj.metodoMULTIPLICACAO());
    }
    
    
    
}
