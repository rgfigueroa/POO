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
public class Operario extends Empleado{

    @Override
    public void CalcularSueldoVariable(int horasExtra) {
        System.out.println("El operario puede ganar extra"+horasExtra);
    }
    
   
}
