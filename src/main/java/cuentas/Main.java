
/**
 * Clase Main del proyecto
 * @author tarde
 */
public class Main {

    /**
     * Constructor
     * @param args
     */
    public static void main(String[] args) {
        operativaCuenta(0);
    }

    /**
     * Simula la creacián de una cuenta, además de distintas operaciones para comprobar su comportamiento.
     * 
     * @param cantidad
     */
    public static void operativaCuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500, cantidad);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
