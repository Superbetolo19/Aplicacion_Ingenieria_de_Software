
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
        admin= new Persona ("ToñodelosMorales", "2212159376", "toñito21@gmail.com");
        encargado= new Persona( "MarthaFloresPerez", "2224869513", "martha4flopez@gmail.com");
        a= new ClienteConsentido("DafneDíaz", "221144556699", "daf_diaz@gmail.com", 2000, 001, 2000, 0);
        b= new ClienteConsentido("BrendadelaConcepcion", "2235961475", "conchitasalvaje69@gmail.com", 2000, 001, 1300, 700);
        c= new ClienteConsentido("ErickCastro", "22453896765", "dios_salveje_ajedrecista_13@gmail.com", 2000, 001, 1416, 584);
    }

    public Persona getAdmin() {
        return admin;
    }

    public void setAdmin(Persona admin) {
        this.admin = admin;
    }

    public Persona getEncargado() {
        return encargado;
    }

    public void setEncargado(Persona encargado) {
        this.encargado = encargado;
    }

    public ClienteConsentido getA() {
        return a;
    }

    public void setA(ClienteConsentido a) {
        this.a = a;
    }

    public ClienteConsentido getB() {
        return b;
    }

    public void setB(ClienteConsentido b) {
        this.b = b;
    }

    public ClienteConsentido getC() {
        return c;
    }

    public void setC(ClienteConsentido c) {
        this.c = c;
    }

    public String getContradmin() {
        return contradmin;
    }

    public void setContradmin(String contradmin) {
        this.contradmin = contradmin;
    }

    public String getContraencargado() {
        return contraencargado;
    }

    public void setContraencargado(String contraencargado) {
        this.contraencargado = contraencargado;
    }
}
