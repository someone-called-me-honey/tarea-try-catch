/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosal
 */
public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    //cuadrado
    public abstract void calculaAV(int lado);

    //triangulo
    public abstract void calculaAV(float base, int altura);

    //circulo
    public abstract void calculaAV(float radio);

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
