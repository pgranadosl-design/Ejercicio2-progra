/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase140220262;

/**
 *
 * @author Paul Granados
 */
public class Moto {
    // las variables de la clase son default
    // Solamente son accesibles en el mismo paquete 
    // La diferencia con las protected es que la 
    // protected si se puede fuera del paquete 
    // siempre y cuando sea con una subclase
    Integer codigo;
    String marca;
    String modelo;

    public Moto(Integer codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Moto() {
    }
    
}
