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
public class SsistemaImprenta2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Secretaria secretariaElisita = new Secretaria();
        secretariaElisita.facturar();
        secretariaElisita.CalcularSueldoVariable();       

        Operario Operario1 = new Operario();
        Operario1.verDatos();
        Operario1.CalcularSueldoVariable();
       

    }

}
