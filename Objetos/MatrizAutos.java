import java.util.Scanner;

public class MatrizAutos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("***Patio de Automoviles***");
        // crear un objeto o crear una instancia de la clase llamada auto
        auto auto1 = new auto();
        System.out.println("Color: " + auto1.color + "Precio: " + auto1.precio);
        auto1.presentarInformacion();
        auto ford = new auto();
        System.out.println("Color: " + ford.color + "Precio: " + ford.precio);
        ford.calcularPrecioIVA();
        ford.presentarInformacion();

        // crear otro objeto auto
        auto autoKia = new auto("Verde", 4569.54);        
        autoKia.presentarInformacion();

         // crear otro objeto auto
         auto autoHyundai = new auto("Gris", 10000.54, "LBA1234");        
         autoHyundai.presentarInformacion();
         autoHyundai.calcularPrecioIVA();

         //Creo la matriz de autos
         auto matrizAutos[][] = new auto[3][3];

         //cargo la matriz de autos
         for (int i = 0; i < matrizAutos.length; i++) {
             for (int j = 0; j < matrizAutos.length; j++) {
                 System.out.println("Ingrese el auto["+i+"]["+j+"]:");
                 auto miAuto = new auto(entrada.next());
                 matrizAutos[i][j] = miAuto;
             }
         }
         //ver el contenido de la matriz
         for (int i = 0; i < matrizAutos.length; i++) {
            for (int j = 0; j < matrizAutos.length; j++) {
                 System.out.print("["+i+"]["+j+"]:"+ matrizAutos[i][j].color + "Precio:"+matrizAutos[i][j].precio + "Placa:"+matrizAutos[i][j].placa);
            }
            System.out.println();
        }
    }
}

class auto {
    // atributos
    String color = "Blanco";
    double precio = 1000.00;
    String placa;

    // metodo constructor
    public auto(String color, double p) {
        this.color = color;
        this.precio = p;
    }

    // metodo constructor
    public auto(String placa) {
        this.placa = placa;
    }

    // metodo constructor vacio
    public auto() {

    }
    // metodo constructor
    public auto(String colore,double precio, String placa) {
        this.color =colore;
        this.precio= precio;
        this.placa=placa;
    }

    // metodos
    void encender() {

    }

    void calcularPrecioIVA() {
        // aqui va la logica del metodo calcularPrecio().
        double precioFinal = precio * 1.12;
        System.out.println("El auto tiene un costo de: " + precioFinal);
    }

    void presentarInformacion() {
        System.out.println("Datos del auto:\t Placa: " + placa + "Color:" + color + "Precio:" + precio);
    }
}