import java.util.Scanner;

public class Aprendiendo{
    public static void main(String [] arg){

        Scanner entrada = new Scanner(System.in);
        int n=3;
        char a='R';
        String nombre="Karen Brigith";
        String apellido="Gonzaga Rivas";
        
        String cadena [] = new String [10];
        int arreglo[] = new int [5];
        int arreglo2[] ={1,5,88,3,2};

        
        for(int i=0; i<10; i++){
            System.out.println("Buenos dias "+ nombre.concat("\t"+apellido));
        }

        if(n==3){
            System.out.println("Impriendo: \t"+n + "\n"+a);
        }
        else{
            System.out.println("La condicion fue false");
        }
        int c=0;
        while(c<10){
            System.out.println("Hasta Luego: "+nombre + apellido);
            c++;
        }
        int opc=0;

        do{
            System.out.println("**MENU**");
            System.out.println("1.Activar servicios");
            System.out.println("2. Ver Saldo");
            System.out.println("3. Ver Cliente");
            System.out.println("4. Salir");
            System.out.println("Ingresa la opcion que deseas:");
            opc = entrada.nextInt();

            switch(opc){
                case 1: 
                        System.out.println("Aqui Logica para Activar servicios");
                        break;
                case 2: 
                        System.out.println("Vas a ver el saldo");
                        break;
                case 3: System.out.println("Presentar datos del cliente: --> "+nombre.substring(0,5));
                         break;
                default:
                         System.out.println("Has ingresado una opcion que no exite"); 
                         break;   
            }

        }while(opc<=4);
        
    }
}