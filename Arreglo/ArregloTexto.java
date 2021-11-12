import java.util.Scanner;

public class ArregloTexto {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("**TEXTO**");
        String minombre="Roberth";
        int cont=0;

        String [] nombres = new String[5];
        String [] apelidos = {"Juarez","Perez","Cueva","Jaramillo","Eras"};

        for (int i = 0; i < nombres.length; i++) {
           System.out.println("Ingresa el nombre: ");        
           nombres[i] = entrada.next();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Mostrar todos los nombres"+ nombres[i]); 
            cont= cont+1;     
        }
        ordenarArreglo(cont);
        ardenarDescendentemente();
        System.out.println("Existen"+ cont + "nombres en el arreglo"); 
    }    
    public static void ordenarArreglo(double contador){
         System.out.println("Aqui logica de ordenar: --> "+contador);
    }
    public static void ardenarDescendentemente(){
        System.out.println("Aqui logica de descendentemente ");
   }
}
