
package ingenieria_caja_registradora;
public class ClienteConsentido extends Persona {
    private double credito;
    private int clienteID;
    private float saldoDisponible;
    private float deuda;
    
    public ClienteConsentido(String nombre, String telefono, String mail, double credito, int clienteID, float saldoDisponible, float deuda) {
        super(nombre, telefono, mail);
        this.credito = credito;
        this.clienteID = clienteID;
        this.saldoDisponible = saldoDisponible;
        this.deuda = deuda;
    }
    
    // Getter y setter para credito
    public double getCredito() {
        return credito;
    }
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    // Getter y setter para clienteID
    public int getClienteID() {
        return clienteID;
    }
    
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }
    
    // Getter y setter para saldoDisponible
    public float getSaldoDisponible() {
        return saldoDisponible;
    }
    
    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    
    // Getter y setter para deuda
    public float getDeuda() {
        return deuda;
    }
    
    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }
    
    // Método toString para imprimir los detalles del cliente
    @Override
    public String toString() {
        return "Cliente [nombre=" + getNombre() + ", telefono=" + getTelefono() + ", mail=" + getMail() +
                ", credito=" + credito + ", clienteID=" + clienteID + ", saldoDisponible=" + saldoDisponible +
                ", deuda=" + deuda + "]";
    }
}
