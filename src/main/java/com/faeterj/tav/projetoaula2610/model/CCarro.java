/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.tav.projetoaula2610.model;

/**
 *
 * @author Lucas
 */
public class CCarro {
    
    private String marca;
    private String modelo;
    private String ano;
    private boolean estaLivre;
    private String placa;

    public CCarro(String _marca, String _modelo, String _ano, boolean _livre, String _placa) {
        marca = _marca;
        modelo = _modelo;
        ano = _ano;
        estaLivre = _livre;
        placa = _placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public boolean carroEstaLivre(){
        return estaLivre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isEstaLivre() {
        return estaLivre;
    }

    public void setEstaLivre(boolean estaLivre) {
        this.estaLivre = estaLivre;
    }
    
}
