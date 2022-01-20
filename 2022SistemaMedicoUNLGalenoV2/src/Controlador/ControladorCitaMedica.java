/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CitaMedica;
import Modelo.Medicamento;
import Modelo.Medico;
import Modelo.Paciente;
import java.io.FileWriter;

/**
 *
 * @author roberth
 */
public class ControladorCitaMedica {

    CitaMedica cita = new CitaMedica();

    public void guardarCitaMedica() {
        try {
            System.out.println("Se gurda la cita Medica " + cita.getFecha() + cita.getPaciente().getCodigoPaciente());
            System.out.println("Se gurda la cita Medica " + cita.getPaciente().getNombre());
            System.out.println("Se gurda la cita Medica " + cita.getMedico().getNombre());

            FileWriter fw = new FileWriter("CitaMedica.txt", true);
            fw.write("Cita guardada " + cita.getFecha() + cita.getPaciente().getNombre() + cita.getPaciente().getCodigoPaciente() + "\n" + cita.getMedico().getNombre());
            fw.close();

        } catch (Exception e) {
            System.out.println("Error: no se pudo guardar la cita medica " + cita.getPaciente().getNombre());
        }

    }

}
