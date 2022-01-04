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
public class Secretaria extends Empleado implements InterfaceSueldo {

    public void facturar() {
    }

    @Override
    public void CalcularSueldoVariable() {
        System.out.println("El sueldo para la Secretaria no se paga hora extra");
    }

   

}
