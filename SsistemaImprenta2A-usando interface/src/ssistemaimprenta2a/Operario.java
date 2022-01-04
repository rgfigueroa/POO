/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssistemaimprenta2a;

/**
 *
 * @author roberth
 */
public class Operario extends Empleado implements InterfaceSueldo{

    @Override
    public void CalcularSueldoVariable() {
        System.out.println("Al operario si se pagara las horas extras");
    }

   
    
   
}
