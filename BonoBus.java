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
public class BonoBus {

    protected static final double precio = 1.2;
    private static int nBonoBus;
    private int id ; //autoincrementado
    protected int saldo=0;
    protected final Calendar fechaCreacion;
    protected final Calendar fechaValidez;
    

    public BonoBus() {
        this.fechaCreacion = Calendar.getInstance();
        this.fechaValidez = fechaCreacion;
        this.fechaValidez.add(Calendar.YEAR, 2);
        nBonoBus++;
        id=nBonoBus;
    }
/**
 * 
 * @return 
 */
    public int getSaldo() {
        return saldo;
    }
/**
 * 
 * @return 
 */
    public Calendar getFechaValidez() {
        return fechaValidez;
    }
    
    
/**
 * 
 * @return 
 */
    public boolean pagar() {
        if (this.getClass()== BonoJoven.class) {
          double precioJoven = precio/2;
          
        }
        if (this.getClass()==BonoJubilado.class) {
            double precioJubilado = precio*0.33;
            precio=precioJubilado;
        }
        if (saldo>precio) {
            saldo -= precio;
            return true;
        }
        return false;
        
    }
/**
 * 
 * @param nViajes
 * @return 
 */
    public boolean pagarNViajes(int nViajes) {
        double precioViajes = precio*nViajes;
        if (saldo>precioViajes) {
            saldo-=precioViajes;
            return true;
        }
        return false;
    }
/**
 * 
 * @param recarga
 * @return 
 */
    public int recargar(int recarga) {
        saldo+=recarga;
        return saldo;
    }
    public boolean validez(){
        if (fechaValidez.getTime() > fecha  {
            
        }
    }
}
