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
public class Ejemplo3<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] arg) {
        Ejemplo3<Integer> integerBox = new Ejemplo3<Integer>();
        Ejemplo3<String> stringBox = new Ejemplo3<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hola mundo"));

        System.out.printf("Entero valor :%d\n\n", integerBox.get());
        System.out.printf("String valor :%s\n", stringBox.get());
    }
}
