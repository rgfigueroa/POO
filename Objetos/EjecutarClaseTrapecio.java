public class EjecutarClaseTrapecio{
    public static void main(String[] args) {
        System.out.println("Probando objetos");
        ClaseTrapecio trapecio1 = new ClaseTrapecio();
        System.out.println(trapecio1.color);   
        
        //Declaración de una matriz de ClaseTrapecio. 
        ClaseTrapecio matrizT[][] = new  ClaseTrapecio[4][4];

    }
}

class ClaseTrapecio {
        //Atributos
       int numeroLados;
       public String color="azul";
       double altura;
       double baseMayor;
       double ladoM = 2.5;
       double ladoMenor = 0.5;

       //metodos
       ClaseTrapecio(){
           //Metodo Constructor
       }
       public  void presentarse(){
            System.out.println("Soy una figura Trapecio");
       }
       void calcularPerimetro(){
           System.out.println("El perimetro del trapecio es: "+2*(ladoM+ladoMenor));
       }
       void calcularArea(){

       }
       public  void presentarColor(String colorTrapecio){
           System.err.println("Soy de color "+ colorTrapecio);
       }
       /*
       // Descmentar este codigo para verificar su funcionamiento

       public static void main(String[] arg){
           System.out.println("Iniciando la Programacion Orientada a Objetos");
           presentarse();
           presentarColor("rojo");
           //Creo el primer objeto 1
           ClaseTrapecio trapecio1= new ClaseTrapecio();
           System.out.println(trapecio1.color);
           System.out.println(trapecio1.ladoMenor);
           trapecio1.presentarColor("Verde");
           //creo el segundo objeto trapecio2
           ClaseTrapecio trapecio2= new ClaseTrapecio();  
           System.out.println(trapecio2.color);
           trapecio2.presentarColor("Amarillo");
           //Creo el objeto 3
           ClaseTrapecio trapecio3= new ClaseTrapecio();  
           System.out.println(trapecio3.color);
       }
       */
}
