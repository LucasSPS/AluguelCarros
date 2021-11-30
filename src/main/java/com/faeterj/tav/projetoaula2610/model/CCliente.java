/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.tav.projetoaula2610.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class CCliente {
    private String nome;
    private String cpf;
    private String endereço;
    private LocalDate dataNascimento;
    public LocalDate diaAtual = LocalDate.now();

    public CCliente(String nome, String cpf, String endereço, LocalDate dataNascimento) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
    }
    
    public boolean validaCliente()
    {
        if(dataNascimento.isBefore(diaAtual.minusYears(18)))
        {
            if(cpf!="" && nome!="")
            {
                return true;
            }
        }
        return false;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     public static void main(String[] args) {
        
    }
       
}
