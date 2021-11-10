/**
 * Descripción: Elaboración de menú de opciones y contador de caracteres.
 * Autor:Roberth
 * Fecha: 10/11/2021
 */
import java.util.Scanner;

public class Menu {
    public static void main(String[] arg ){
       int opcion=0, contador=0;
       char caracter;
       String texto="";
       System.out.println("***Programa que cuenta letras***");
       Scanner entrada = new Scanner(System.in);      
       do{
          System.out.println("**MENU**");
          System.out.println("1. Ingresar Texto");
          System.out.println("2. Contar el número total de caracteres ");
          System.out.println("3. Mostrar los digitos");
          System.out.println("4. Salir");
          System.out.println("Ingresa la opcion deseada: ");
          opcion = entrada.nextInt();
          switch(opcion){
              case 1: 
                    System.out.println("Ingresar Texto");
                    texto= entrada.next();
                    System.out.println("Ingresaste:"+texto);
                    break;
              case 2: 
                    System.out.println("Contar el número total de caractere");
                    contador=0;
                    for(int i=0; i<texto.length();i++)
                    {
                       contador = contador+1;
                       // System.out.println("Ingresaste:"+texto.charAt(i));
                    }
                    //System.out.println("El tamonio ingresado fue de:" + texto.length());
                    System.out.println("Tamanio: "+ contador);
                    break;
              case 3: 
                    System.out.println("Mostrar los digitos");
                    for(int i=0; i<texto.length();i++)
                    {
                       caracter = texto.charAt(i);
                       
                       if(caracter == '0' || caracter == '1' || caracter== '2'){
                           System.out.println("Es digito: "+caracter);
                       }
                       
                       switch(caracter){
                           case '0':
                                System.out.println("Es digito: "+caracter);
                                break;
                           case 1:
                                System.out.println("Es digito: "+caracter);
                                break;
                           case 2:
                                System.out.println("Es digito: "+caracter);
                                break;       
                       }
                    }
                    break;
              case 4: 
                     System.out.println("Saliendo");
                    break;
             default:
                    System.out.println("La opcion ingresado no existe");
                    break;
          }

       }while(opcion<4);    
    }  
}
