/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.tav.projetoaula2610.model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class CAluguel {
    private boolean aprovacao, carDisp;
    private LocalDate dtInicio, dtFim, dtHoje;
    private String nomeCliente, cpf, numeroCartao, vencCartão, codSegCartao, car, placa;
    
    
    public static void main(String[] args) {
        
    }

   
    public CAluguel(String _car, String _placa, LocalDate _dtInicio, LocalDate _dtFim, String _nomeCliente, String _cpf,
            String _numeroCartao, String _vencCartão, String _codSegCartao, boolean _carDisp){
        this.dtInicio = _dtInicio;
        this.dtFim = _dtFim;
        this.nomeCliente = _nomeCliente;
        this.cpf = _cpf;
        this.numeroCartao = _numeroCartao;
        this.vencCartão = _vencCartão;
        this.codSegCartao = _codSegCartao;
        this.car = _car;
        this.placa = _placa;  
        this.carDisp = _carDisp;
    }


    
    public boolean ValidaAluguel()
    {
        if(carDisp == false)
        {
            System.out.println("Carro indisponível");
            return false;           
        }
        
        if(dtInicio.isEqual(dtFim) || dtInicio.isAfter(dtFim))
        {
            System.out.println("Datas inválidas");
            return false;
        }
        
        if(nomeCliente == "" || cpf == "")
        {
            System.out.println("Nome ou cpf está vazio");
            return false;
        }
        
        if(numeroCartao.length()!=16)
        {
            System.out.println("Cartão inválido");
            return false;
        }
        return true;
    }
    
}
