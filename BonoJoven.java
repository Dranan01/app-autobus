/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Calendar;

/**
 *
 * @author franm
 */
public class BonoJoven extends BonoBus { //MENORES DE 25

    private int edad;
    private final String nombre;
    private final String apellidos;
    private final int dni;
   
/**
 * 
 * @param edad
 * @param nombre
 * @param apellidos
 * @param dni 
 */ 
    public BonoJoven(int edad, String nombre, String apellidos, int dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        for (int i = edad; i < 26; i++) {
            super.getFechaValidez().add(Calendar.YEAR, 1);
        }
    }

    /**
     *
     * @param dni
     * @return
     */ 
    public boolean pagar(int dni) {
        
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
        saldo += recarga;
        return saldo;
    }
    
    
}
