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
public class AluguelCarroTest {
        
    @Test
    public void reservarCarroIndisponivel()
    {
        //Arrange
        LocalDate dtNascimento = LocalDate.of(1990, 3, 15);
        LocalDate dtinicio = LocalDate.of(2020, 11, 29);
        LocalDate dtfim = LocalDate.of(2021, 11, 29);
        CCarro car = new CCarro("Ford", "EcoSport", "2011", true, "HHY-3211");
        CCliente cliente = new CCliente("Fernando Peçanha", "17005488721", "Rua jabutica 475, Bananal, Rio de janeiro", dtNascimento);
        CAluguel Aluguel = new CAluguel(car.getModelo(), car.getPlaca(), dtinicio, dtfim, cliente.getNome(), cliente.getCpf(), "4220538925224411", "11/27", "113", car.carroEstaLivre());
                
        //Act
        boolean resultado = Aluguel.ValidaAluguel();
        
        //Assert
        assertTrue(resultado);
    }
    
    @Test
    public void reservarCarroDataFimMenor(){
        
        //Arrange
        LocalDate dtNascimento = LocalDate.of(1984, 6, 03);
        LocalDate dtinicio = LocalDate.of(2021, 05, 16);
        LocalDate dtfim = LocalDate.of(2021, 05, 19);
        CCarro car = new CCarro("Toyota", "Corolla", "2020", true, "LPM3211");
        CCliente cliente = new CCliente("Maria Fernanda", "005005424781", "Rua peneira 11, ap 44, centro, Espirito Santo", dtNascimento);
        CAluguel Aluguel = new CAluguel(car.getModelo(), car.getPlaca(), dtinicio, dtfim, cliente.getNome(), cliente.getCpf(), "3842538925224229", "05/25", "453", car.carroEstaLivre());
                
        //Act
        boolean resultado = Aluguel.ValidaAluguel();
        
        //Assert
        assertTrue(resultado);
    }
}
