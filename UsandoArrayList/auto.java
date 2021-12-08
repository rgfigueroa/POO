public class auto {
    private int velocidad;
    private String color;
    private String placa;
    private int precio;
    persona propietario;

    //contructor
    public auto(String placa, int precio, persona propietaria){
        this.placa= placa;
        this.precio=precio;
        this.propietario=propietaria;
    }

    // encapsulado para cambiar el valor de la velocidad
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // metodo de encapsulado para consultar el valod de la velocidad.
    public int getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPropietario(persona propietario) {
        this.propietario = propietario;
    }
    public persona getPropietario(){
        return propietario;
    }



}
