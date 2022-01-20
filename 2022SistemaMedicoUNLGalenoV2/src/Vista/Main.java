/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCitaMedica;
import Controlador.ControladorSecretaria;
import Modelo.CitaMedica;
import Modelo.Medicamento;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Persona;
import Modelo.Secretaria;
import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        System.out.println("*****Sistema Reserva de Turnos*****");

        do {
            System.out.println("Opcion 1. Agendar Turno");
            System.out.println("Opcion 2. Agregar Cita Medica");
            System.out.println("Opcion 3. Salir");

            System.out.println("Ingresa una opcion");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Opcion 1. Agendar Turno");
                    Secretaria secre = new Secretaria("Secre Juanita");
                    Controlador.ControladorSecretaria ctrlSecretaria = new ControladorSecretaria();
                    ctrlSecretaria.asignarTurno("Keilan S.  ", "12:00", "20 de Enero de 2022");
                    
                    break;

                case 2:
                    System.out.println("Opcion 2. Agregar Cita Medica");
//                    Medico medico = new Medico("Medico Juan");                    
//                    Paciente paciente = new Paciente("Paciente Pedro");
//                    Medicamento medicamento = new Medicamento("Paracetamol", "Pastilla", "Gramos", "Tomar cada 8 horas");
//                   // CitaMedica cita = new CitaMedica("14/02/2022", 30, medico, paciente, medicamento);
                   // System.out.println("Cita Medica: -->" + cita.getMedico().getNombre());
                   // cita.guardarCitaMedica();
                    Controlador.ControladorCitaMedica cita = new ControladorCitaMedica();
                    cita.guardarCitaMedica();
               //     System.out.println(paciente.getNombre());

                    break;

                default:
                    System.out.println("Opcion 3. Salir");
                    break;
            }
        } while (op <= 2);

    }

}
