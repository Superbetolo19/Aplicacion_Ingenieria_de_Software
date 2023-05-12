
package ingenieria_caja_registradora;

import java.util.*;

public class SistemaPuntodeVenta {
    private Persona admin,encargado;
    private ArrayList<ClienteConsentido> clientes = new ArrayList<>();
    private String contradmin, contraencargado;

    public SistemaPuntodeVenta(){
        admin= new Persona ("ToñodelosMorales", "2212159376", "toñito21@gmail.com");
        encargado= new Persona( "MarthaFloresPerez", "2224869513", "martha4flopez@gmail.com");
        clientes.add(nuevocliente("DafneDíaz", "221144556699", "daf_diaz@gmail.com", 2000, 001, 2000, 0));
        clientes.add(nuevocliente("BrendadelaConcepcion", "2235961475", "conchitasalvaje69@gmail.com", 2000, 001, 1300, 700));
        clientes.add(nuevocliente("ErickCastro", "22453896765", "dios_salveje_ajedrecista_13@gmail.com", 2000, 001, 1416, 584));
    }
    
    public ClienteConsentido nuevocliente(String nombre, String telefono, String mail, double credito, int clienteID, float saldoDisponible, float deuda){
       ClienteConsentido n = new ClienteConsentido(nombre,telefono,mail,credito,clienteID,saldoDisponible,deuda);
       return n;
    }
    public void eliminarcliente(int clienteID){
        clientes.remove(clientes.indexOf(clienteID));
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
