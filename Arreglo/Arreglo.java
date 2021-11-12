import java.util.Scanner;

public class Arreglo {
    public static void main(String[] arg) {
        System.out.println("Bienvenidos a arreglos");
        Scanner e = new Scanner(System.in);
        int suma=0;

        int edad [] = new int[5];
        int edad2[]={18,18,17,18,20};

        for (int i = 0; i < edad.length; i++) {
            System.out.print("Cargar edad:");
            edad[i] = e.nextInt();
        }

        for (int i = 0; i < edad2.length; i++) {
            System.out.println("Arreglo["+i+"]:"+edad2[i]);
        }
        System.out.println("Sumar las edades del arreglo de Edades");

        for (int i = 0; i < edad2.length; i++) {
            suma = suma+edad2[i];
        }
        System.out.println("Respuesta:"+suma);
        //System.out.println("El promedio:"+ suma / Double.valueOf(edad.length));
        
        double promedio = (double) edad2.length;
        System.out.println("El promedio:"+ suma / promedio);



    }
    
}
