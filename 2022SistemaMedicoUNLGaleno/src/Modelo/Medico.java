/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class Medico extends Persona {

    private String jornadaLaboral;

    public Medico(String nombre) {
        super(nombre);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa jornada laboral: ");
        this.jornadaLaboral = entrada.next();
        System.out.println("Edad del medico es: " + this.getEdadActual());
        System.out.println("Te cambio el nombre mEdico: ");
        super.setNombre(entrada.next());
        System.out.println("Ver nombre medico: " + this.getNombre());

    }

    /**
     * @return the jornadaLaboral
     */
    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    /**
     * @param jornadaLaboral the jornadaLaboral to set
     */
    public void setJornadaLaboral(String jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }

}
