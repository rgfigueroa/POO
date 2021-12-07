import java.util.ArrayList;

/**
 * Descripcion: Ejercicio de uso de ArrayList
 * Autor: Roberth
 * Fecha: 07/12/2021
 */

public class ejecutar {
    public static void main(String[] args) {
        System.out.println("Usando el tipo de Dato ArrayList");
        persona personaUno= new persona(20,"Juan Perez");
        persona pablo= new persona(22,"Pablo Pilco");
        persona yovin= new persona(20,"Yovin Urrego");

        ArrayList<persona> listaPersona = new ArrayList<persona>();
        listaPersona.add(personaUno);
        listaPersona.add(pablo);
        listaPersona.add(yovin);

        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.println(listaPersona.get(i).getNombre() + " -- "+listaPersona.get(i).getEdad());
            System.out.println(listaPersona.get(i).getEdad());
        }

        yovin.setNombre("yovin Steven");
        
        for (persona lp : listaPersona) {
            System.out.println(lp.getNombre()+"--"+lp.getEdad());
        }
        //Notacion lambda.

    }
    
}
