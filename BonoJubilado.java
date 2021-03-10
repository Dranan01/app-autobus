/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author franm
 */
public class BonoJubilado extends BonoBus {

    private int edad;
    private String nombre;
    private String apellidos;
    private int dni;
/**
 * 
 * @param edad
 * @param nombre
 * @param apellidos
 * @param dni 
 */
    public BonoJubilado(int edad, String nombre, String apellidos, int dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
/**
 * 
 * @param dni
 * @return 
 */
    public boolean pagar(int dni) {
        if (edad >= 65) {
            double precioViejo = precio * 0.33;
            if (dni == this.dni && super.saldo > precioViejo) {
                saldo -= precioViejo;
                return true;
            }
        }
        return false;
    }
/**
 * 
 * @return 
 */
    public boolean pagarNViajes() {
        return false;
    }
/**
 * 
 * @param recarga
 * @return 
 */
    @Override
    public int recargar(int recarga) {
        if (edad>65) {
            
        
        saldo += recarga;
        
        }
        return saldo;
    }
}
