/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.faeterj.tav.projetoaula2610.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas
 */
public class carroTest {
    
    public carroTest() {
    }
    
    @Test
    public void carroLivreTest(){
        //Arrange
        CCarro car = new CCarro("GM", "Chevette", "1985", false, "GTA-5544"); 
           
        //Act
        boolean resultado = car.carroEstaLivre();
        
        //Assert
        assertTrue(resultado);
    }
    
    @Test
    public void carroTemMarcaTest(){
        //Arrange
        CCarro car = new CCarro("Ford", "Fusion", "2020", false, "TRF-1147"); 
        String esperado = "Fusion";
        
        //Act
        String  resultado = car.getModelo();
        
        //Assert
        assertEquals(esperado, resultado);
        
    }
}
