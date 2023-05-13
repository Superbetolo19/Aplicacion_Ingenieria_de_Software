
package ingenieria_caja_registradora;

import javax.swing.JPanel;

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
