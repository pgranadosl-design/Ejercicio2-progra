/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase140220262;

import java.math.BigDecimal;

/**
 *
 * @author Paul Granados
 */
public class Carro {
    protected Integer codigo;
    protected String marca;
    protected String modelo;
    protected BigDecimal precio;

    public Carro(Integer codigo, String marca, String modelo, BigDecimal precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Carro() {
    }
}
