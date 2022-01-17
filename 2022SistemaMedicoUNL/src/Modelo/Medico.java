/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author roberth
 */
public class Medico extends Persona {

    private String jornadaLaboral;

    public Medico(String nombre) {
        super(nombre);
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
