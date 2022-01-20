/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;

/**
 *
 * @author roberth
 */
public class Secretaria extends Persona  {

    private double sueldo;

    public Secretaria(String nombre) {
        super(nombre);
        this.sueldo = sueldo;
    }


    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
