/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericjava;

/**
 *
 * @author roberth
 */
public class ClienteGenerica<T> {

    private T nombre;
    private T direccion;

    public ClienteGenerica(T nombre, T direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public T getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public T getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(T direccion) {
        this.direccion = direccion;
    }

}
