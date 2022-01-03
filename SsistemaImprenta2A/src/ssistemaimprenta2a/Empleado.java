package ssistemaimprenta2a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roberth
 */
public abstract class Empleado extends Persona {

    private int numeroHoras;
    private double precioHora;

    public void horario() {
    }

    public void calcularSueldo() {
        System.out.println("Gana el sueldo Básico de $425");
    }
  
    public abstract void CalcularSueldoVariable(int horasExtra);
  

    /**
     * @return the numeroHoras
     */
    public int getNumeroHoras() {
        return numeroHoras;
    }

    /**
     * @param numeroHoras the numeroHoras to set
     */
    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    /**
     * @return the precioHora
     */
    public double getPrecioHora() {
        return precioHora;
    }

    /**
     * @param precioHora the precioHora to set
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

}
