/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class CitaMedica {

    private String fecha;
    private double precio;
    private Medico medico;
    private Paciente paciente;
    private Medicamento listaMedicamento;

    public CitaMedica(String fecha, double precio, Medico medico, Paciente paciente, Medicamento listaMedicamento) {
        this.fecha = fecha;
        this.precio = precio;
        this.medico = medico;
        this.paciente = paciente;
        this.listaMedicamento = listaMedicamento;
    }

    public void guardarCitaMedica() {
        try {
            System.out.println("Se gurda la cita Medica " + this.getFecha() + this.getPaciente().getCodigoPaciente());
            System.out.println("Se gurda la cita Medica " + this.getPaciente().getNombre());
            System.out.println("Se gurda la cita Medica " + this.getMedico().getNombre());

            FileWriter fw = new FileWriter("CitaMedica.txt", true);
            fw.write("Cita guardada " + this.getFecha() + this.getPaciente().getNombre() + this.getPaciente().getCodigoPaciente() + "\n"+this.getMedico().getNombre());
            fw.close();

        } catch (Exception e) {
            System.out.println("Error: no se pudo guardar la cita medica " + this.getPaciente().getNombre());
        }

    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the listaMedicamento
     */
    public Medicamento getListaMedicamento() {
        return listaMedicamento;
    }

    /**
     * @param listaMedicamento the listaMedicamento to set
     */
    public void setListaMedicamento(Medicamento listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

}
