/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericjava;

import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class GenericJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Integer[] listanumeros = {1, 6, 4, 3, 9};
        Character[] carcater = {'d', 'c', 'f'};
        Double[] decimal = {3.54, 87.2, 1.9};

        //listar(listanumeros);
        String[] estudiante = {"Juan", "Pedro", "Maria", "Manuel", "Paco"};
        //  listar(estudiante);

        Cliente clienteUno = new Cliente("Cliente Pedro", "Loja");
        Cliente clienteDos = new Cliente("Martha", "Quito");

        ArrayList listaCliente = new ArrayList<>();
        listaCliente.add(clienteDos);
        listaCliente.add(clienteUno);
        //  listar(listaCliente);
        //  listarCualquierInforacion(listanumeros);
        listarCualquierInforacion(estudiante);
        listarCualquierInforacion(listanumeros);
        listarCualquierInforacion(carcater);
        listarCualquierInforacion(decimal);
        listarCualquierInforacion(listaCliente);

        ClienteGenerica cg1 = new ClienteGenerica("Cliente Generico 1", 'c');
        ClienteGenerica cg2 = new ClienteGenerica('P', 23456789);
        ClienteGenerica cg3 = new ClienteGenerica("Juan", 343.57);
        ClienteGenerica cg4 = new ClienteGenerica(657, "Loja");

        ArrayList<ClienteGenerica> listaGenericaCliente = new ArrayList<>();

        listaGenericaCliente.add(cg1);
        listaGenericaCliente.add(cg2);
        listaGenericaCliente.add(cg2);

        listarCualquierInforacion(listaGenericaCliente);
    }

    //Metodos individuales por tipo de dato
//    public static void listar(int[] datos) {
//        for (int i = 0; i < datos.length; i++) {
//            System.out.println("Numero: " + datos[i]);
//        }
//    }
//
//    public static void listar(String[] dato) {
//        for (int i = 0; i < dato.length; i++) {
//            System.out.println("String: " + dato[i]);
//        }
//    }
//
//    public static void listar(ArrayList<Cliente> lista) {
//        for (Cliente cliente : lista) {
//            System.out.println("Cliente" + cliente.getNombre());
//        }
//    }
    //metodos generico
    public static <T> void listarCualquierInforacion(T[] dato) {
        for (T valor : dato) {
            System.out.println(valor);
        }
    }
//metodos generico

    public static <T> void listarCualquierInforacion(ArrayList<T> dato) {
        for (T valor : dato) {
            System.out.println(valor.toString());
        }
    }

}
