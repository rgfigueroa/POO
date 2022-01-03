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
public class Secretaria extends Empleado {

    public void facturar() {
    }

    @Override
    public void CalcularSueldoVariable(int horasExtra) {
        System.out.println("Ella gana solamente el basico" + horasExtra + "no se paga Extra");

    }

}
