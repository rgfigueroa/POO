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
        persona Thais = new persona(18,"Thais Cartuche");

        ArrayList<persona> listaPersona = new ArrayList<persona>();
        listaPersona.add(personaUno);
        listaPersona.add(pablo);
        listaPersona.add(yovin);

        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.println(listaPersona.get(i).getNombre() + " -- "+listaPersona.get(i).getEdad());
            System.out.println(listaPersona.get(i).getEdad());
        }

        yovin.setNombre("yovin Steven");
        
        for (persona lp: listaPersona) {
            System.out.println(lp.getNombre()+"--"+lp.getEdad());
        }
        
        //Notacion lambda.
        listaPersona.forEach(p -> System.out.println("Dato:"+p.getEdad()));

        //Ejemplo de uso de auto y persona
        auto hyundai = new auto("LBA0727",5000,yovin);
        auto autoKia= new auto("LBB0237",6000,pablo);
        auto autoFord= new auto("XYZ0123",20000,Thais);

        ArrayList <auto> patioautos = new ArrayList<auto>();
        patioautos.add(hyundai);
        patioautos.add(autoKia);
        patioautos.add(autoFord);


        for(auto a: patioautos){
            System.out.println(a.getPlaca()+"--" + a.getPropietario().getNombre()+" su costo es: "+a.getPrecio());
        }
        
        //Notación Lambda.
        patioautos.forEach(a -> System.out.println(a.getPrecio()));
       
    }
}
