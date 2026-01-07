package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número o identificador de la cuenta.
     */
    private String cuenta;

    /**
     * Saldo actual disponible en la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor vacío.
     * Inicializa una cuenta sin datos.
     */
    public CCuenta() {
    }

    /**
     * Constructor con datos.
     *
     * @param nom  nombre del titular
     * @param cue  identificador o número de cuenta
     * @param sal  saldo inicial
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad importe a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + ca

