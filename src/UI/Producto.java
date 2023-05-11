/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Javier Huerta
 */
public class Producto{
    private String nombre;
    private float precio;
    private JPanel panel;
    
    public Producto(){
        
    }
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
        panel.setSize(100, 100);
        panel.setBackground(Color.red);
    }
}
