
package ingenieria_caja_registradora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author otaku
 */
public class SistemaPuntodeVenta {
    private Persona admin,encargado;
    private ClienteConsentido a,b,c;
    private String contradmin, contraencargado;

    public SistemaPuntodeVenta(){
        admin= new Persona ("Toño de los Morales", "2212159376", "toñito21@gmail.com");
        encargado= new Persona( "Martha Flores Perez", "2224869513", "martha4flopez@gmail.com");
        a= new ClienteConsentido("Dafne Díaz", "221144556699", "daf_diaz@gmail.com", 2000, 001, 2000, 0);
        b= new ClienteConsentido("Brenda de la Concepcion", "2235961475", "conchitasalvaje69@gmail.com", 2000, 001, 1300, 700);
        c= new ClienteConsentido("Erick Castro", "22453896765", "dios_salveje_ajedrecista_13@gmail.com", 2000, 001, 1416, 584);
    }
}
