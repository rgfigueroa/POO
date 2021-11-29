public class profesor{
    String nombre;
    String asignatura;

    public profesor(String n, String asignatura){
        this.nombre= n;
        this.asignatura= asignatura;
    }

    public void dictarClases(String nombreP){
        System.out.println("El profesor "+ nombreP+ " dicta clase");
    }

    public void calificar(){
        System.out.println("El profesor "+ this.nombre+ " calificar");
    }

    public void verListadoEstudiante(){
        System.out.println("El profesor "+ this.nombre+ " tiene los estudiantes: ");

    }
}