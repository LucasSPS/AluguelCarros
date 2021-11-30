/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.faeterj.tav.projetoaula2610.model.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas
 */
public class ClienteTeste {
    
    @Test
    public void ClienteTeste() {
        //Arrange
        LocalDate dtNascimento = LocalDate.of(2002, 11, 28);
        CCliente cliente = new CCliente("Fernando Peçanha", "17058721411", 
                "Rua jabutica 475, Bananal, Rio de janeiro", dtNascimento);
        
        //Act
        boolean resultado = cliente.validaCliente();
        
        //Assert
        assertTrue(resultado);
               
    }
    
    
    
}
