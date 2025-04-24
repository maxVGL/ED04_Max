
/**
 * Simula una cuenta bancaria.
 * 
 * @author tarde
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo actual
     * 
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Añade la cantidad pasada por parámetro al saldo de la cuenta
     * 
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira la cantidad pasada por parámetro al saldo de la cuenta
     * 
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Accesor del nombre de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador del nombre de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesor del identificador de la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Mutador del identificador de la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Accesor del saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Mutador del saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Accesor del tipo de interés de la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Mutador del tipo de interés de la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
