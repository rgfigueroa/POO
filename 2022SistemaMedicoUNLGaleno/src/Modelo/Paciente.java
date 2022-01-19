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
public class Paciente extends Persona {

    private static int incremento = 1;
    private int codigoPaciente;

    public Paciente(String nombre) {
        super(nombre);
//          Crea codigo aleatorio 
//        int codigoAleatorio;
//        codigoAleatorio = (int) (Math.random() * 100);
//        System.out.println("Paciente con codigo: " + this.codigoPaciente + codigoAleatorio);
        this.codigoPaciente = this.codigoPaciente + incremento;
        System.out.println("Paciente  " + this.getNombre() + " tiene el código aleatorio: " + codigoPaciente);      
        this.incremento++;
    }

    /**
     * @return the codigoPaciente
     */
    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * @param codigoPaciente the codigoPaciente to set
     */
    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCodigoPaciente: ");
        sb.append(codigoPaciente);
        sb.append("\nNombre: ");
        sb.append(this.getNombre());
        return sb.toString();
    }
}
