public class estudiante {
    int edad;
    String nombre;
    char genero;
    int ciclo;
    double nota;

    public estudiante(String nombre, int ciclo, char gen, double nota) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.genero = gen;
        this.nota= nota;
    }

    public void matricular(String nombre, int ciclo) {
        System.out.println("Aqui va la logica del matricularse universidad UNL");
        System.out.println("Solicita matricula el estudiante: "+ nombre + " en el ciclo"+ciclo);

    }

    public void entregarTarea(String nombre) {
        System.out.println("El estudiante" + nombre + " entrega la tarea");
    }

}
