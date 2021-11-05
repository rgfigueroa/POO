
/*
     Descripción: Trabajando con String
     Autor: Roberth
     Fecha:28/10/2021
*/
import java.util.Scanner;

public class EjemploString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Java !! ....este texto es string");
        char datos[] = {'a', 'b', 'c','\n'};

        System.out.println(datos[3] + "\t"+ datos[1]);

        System.out.println("El tamaño del array datos es: " + datos.length);

        String saludo= "Hola";
        System.out.println(saludo.charAt(0));

        int A[]={1,5,9,3,7,53,777};
        System.out.println("imprimiendo"+ A[2]);

        System.out.println("Leer entrada ingresada Numero:");
        String numero = scanner.next();
        System.out.println("Numero ingresado:"+ numero);

        scanner.close();

        for (int i = 0; i < A.length; i++) {
           System.out.println("Elemento[" +i+" ] = "+ A[i]);
        }      
    }
}
