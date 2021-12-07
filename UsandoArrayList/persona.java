/**
 * Descripcion: Ejercicio de uso de ArrayList
 * Autor: Roberth
 * Fecha: 07/12/2021
 */

public class persona {
    int edad;
    String nombre;
    boolean trabaja;
    char genero;

    persona(){
    }
   
    public persona(int edad, String nombre){
        this.edad = edad;
        this.nombre =nombre;
    }
    public persona(String nombre, boolean trabaja, char genero ){
        this.nombre= nombre;
        this.trabaja=trabaja;
        this.genero= genero;
    }
    public int getEdad(){
        return edad;
    }

    //metodos de encapsulacion del atributo Nombre de la persona
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }
  
}
