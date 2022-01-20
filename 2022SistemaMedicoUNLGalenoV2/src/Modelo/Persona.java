/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author roberth
 */
public class Persona {

    private String nombre;
    private Date fechaNacimiento;
    private Date fechaActual;
    private int edadActual;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.fechaActual = Calendar.getInstance().getTime();
        System.out.println("Fecha Actual es:" + this.fechaActual);
        System.out.println("Fecha Nacimiento es: ");
        int anio = (this.fechaActual.getYear()+ 1900) - 1994;
        System.out.println(anio);
        this.edadActual = anio;
    }

    public Persona(String nombre, Date fechaN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaN;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the edadActual
     */
    public int getEdadActual() {
        return edadActual;
    }

}
