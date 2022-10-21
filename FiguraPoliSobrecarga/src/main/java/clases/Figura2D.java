/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosal
 */
public class Figura2D extends Figura {

    private float area;

    public Figura2D(String nombre) {
        super(nombre);
        this.area = 0;
    }

    //cuadrado
    @Override
    public void calculaAV(int lado) {
        setArea(lado * lado);
    }

    //triangulo
    @Override
    public void calculaAV(float base, int altura) {
        setArea((base * altura) / 2);
    }

    //circulo
    @Override
    public void calculaAV(float radio) {
        setArea((float) (Math.PI * Math.pow(radio, 2)));
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

}
