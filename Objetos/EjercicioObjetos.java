import java.util.Scanner;
public class EjercicioObjetos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n=0;
        String nom;
        String mail;

        System.out.println("***Probar el funcionamiento de POO");
        System.out.println("Ingresa el numero de estudiante de 2A:");
        n = entrada.nextInt();
       
        //limpiar el buffer de Scanner de entrada luego de leer el Entero
         entrada.nextLine();
       /*
        estudiante Armijos = new estudiante();
        estudiante Stalin = new estudiante(entrada.next(),entrada.next());
        estudiante Jhonny = new estudiante("Jhonny Alexander Armijos R ","juniorjhnony@gmail.com");
        estudiante estudianteEjemplo= new estudiante(entrada.next(),entrada.next());
        System.out.println("Informacion --> \t" + Armijos.email);
        System.out.println("Informacion --> \t" + Stalin.email);
        System.out.println("Informacion --> \t" + Jhonny.nombre + Jhonny.email);
        System.out.println("Informacion --> \t" + estudianteEjemplo.nombre +"\t"+ estudianteEjemplo.email);
       */
       
       estudiante SegundoA[]= new estudiante[n];
        for (int i = 0; i < SegundoA.length; i++) {
            System.out.print("Ingresa Estudiante:["+i+"]: ");
            System.out.print("Ingresa Nombre: ");          
            nom = entrada.nextLine();            
            System.out.print("Ingresa Email: ");
            mail = entrada.nextLine();          
            estudiante nuevoEstudiante= new estudiante(nom,mail);
            SegundoA[i]= nuevoEstudiante;
        }
        for (int i = 0; i < SegundoA.length; i++) {
            //System.out.println("Listado de Estudiante de Segundo A:["+i+"]"+SegundoA[i].nombre);
            SegundoA[i].mostrarInformacionEstudiante();
        }
    }
}

class estudiante {
    // atributos
    String email = "stalin.cueva@unl.edu.ec";
    int edad;
    String nombre = "Stalin";

    // metodos
    // metodo construccion
    estudiante() {

    }
    estudiante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    void mostrarInformacionEstudiante() {
        System.out.println("El estudiante es: " + this.nombre + " y su email: " + this.email);
    }
}
