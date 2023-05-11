package sistemapuntodeventa;
import java.util.Scanner;

public class SistemaBancario {
    
    public static boolean validacionTarjeta() {
        Scanner input = new Scanner(System.in);
        boolean valido = false;
        String numTarjeta;
        int pin;
        
        while (!valido) {
            System.out.println("Ingrese el numero de tarjeta (16 digitos): ");
            numTarjeta = input.next();
            System.out.println("Ingrese el PIN (4 digitos): ");
            pin = input.nextInt();
            
            if (numTarjeta.length() != 16) {
                System.out.println("El numero de tarjeta debe contener 16 dígitos");
            } else if (pin < 1000 || pin > 9999) {
                System.out.println("El PIN debe contener 4 digitos");
            } else {
                valido = true;
            }
        }
        
        // Aquí se puede agregar la lógica para procesar la transacción con la tarjeta de crédito
        // y actualizar los registros de venta en el sistema de la tienda de abarrotes
        // por ejemplo, actualizar una base de datos con los detalles de la venta
        System.out.println("El pago ha sido procesado con exito.");
        return true;
    }
    
    // Aquí se pueden agregar otros métodos y atributos necesarios para el sistema de punto de venta
    // por ejemplo, un método para agregar productos al carrito de compras, un método para generar una factura, etc.
}
