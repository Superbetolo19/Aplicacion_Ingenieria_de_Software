/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingenieria_caja_registradora;

import javax.swing.JPanel;

/**
 *
 * @author Kirby
 */
public class Producto {
    private String nombre;
    private float precio;
    private JPanel panelPro;
    
    public Producto(){
        nombre = "";
        precio = 0;
        
    }
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
}
