/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.InterfaceTurno;
import java.io.FileWriter;


/**
 *
 * @author roberth
 */
public class ControladorSecretaria implements InterfaceTurno{

    @Override
    public void asignarTurno(String nombre, String hora, String fecha) {
         try {
            System.out.println("Se agenda un turno para " + nombre + "a la hora " + hora + "en día " + fecha);
            FileWriter fw = new FileWriter("CitasAgendadas.txt", true);
            fw.write("Turno reservado para " + nombre + "a la hora " + hora + "en día " + fecha+"\n");
            fw.close();

        } catch (Exception e) {
            System.out.println("Error: no se pudo agendar un turno para " + nombre);
        }
        
    }
    
    public void eliminarTurno(String nombre, String hora, String fecha) {
       

    }
    
   
    
}
