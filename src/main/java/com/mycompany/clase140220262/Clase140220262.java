/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase140220262;

import Paquete1.Cliente;
import Paquete1.Producto;
import java.math.BigDecimal;

/**
 *
 * @author Paul Granados
 */
public class Clase140220262 {

    public static void main(String[] args) {
      Cliente cliente=new Cliente();
      cliente.codigo=2;
      cliente.dpi="5564464";
      cliente.edad=20;
      cliente.nombre="pedro";
      
      System.out.println("codigo="+cliente.codigo);
      System.out.println("nombre="+cliente.nombre);
      System.out.println("edad="+cliente.edad);
      System.out.println("dpi="+cliente.dpi);

      Carro carro=new Carro();
      carro.codigo=2;
     carro.marca="toyota";
     carro.modelo="2026";
     carro.precio=new BigDecimal (2000000);
     
      System.out.println("carro");
      System.out.println("Codigo="+carro.codigo);
      System.out.println("Marca="+carro.marca);
      System.out.println("Modelo="+carro.modelo);
      System.out.println("Precio="+carro.precio);

      Moto moto=new Moto();
     moto.codigo=1;
     moto.marca="Yamaha";
     moto.modelo="2025";
     System.out.println("Codigo="+moto.codigo);
      System.out.println("Marca="+moto.marca);
      System.out.println("Modelo="+moto.modelo);
      
      Producto producto=new Producto();
      producto.setCodigo(1);
      producto.setNombre("monitor");
      producto.setPrecio(new BigDecimal(4000));
      
      System.out.println("+++++++++++++++++producto++++++++++++");
       System.out.println("codigo="+producto.getCodigo());
      System.out.println("nombre="+producto.getNombre());
      System.out.println("precio="+producto.getPrecio());
    }
}
