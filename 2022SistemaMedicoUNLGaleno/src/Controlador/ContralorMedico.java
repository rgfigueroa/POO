/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Medico;
import java.io.FileWriter;

/**
 *
 * @author roberth
 */
public class ContralorMedico extends Medico{

    public ContralorMedico(String nombre) {
        super(nombre);
    }
    public void guardarCitaMedica() {
//        try {
//            System.out.println("Se gurda la cita Medica " + this.getFecha() + this.getPaciente().getCodigoPaciente());
//            System.out.println("Se gurda la cita Medica " + this.getPaciente().getNombre());
//            System.out.println("Se gurda la cita Medica " + this.getMedico().getNombre());
//
//            FileWriter fw = new FileWriter("CitaMedica.txt", true);
//            fw.write("Cita guardada " + this.getFecha() + this.getPaciente().getNombre() + this.getPaciente().getCodigoPaciente() + "\n"+this.getMedico().getNombre());
//            fw.close();
//
//        } catch (Exception e) {
//            System.out.println("Error: no se pudo guardar la cita medica " + this.getPaciente().getNombre());
//        }

    }
    
}
