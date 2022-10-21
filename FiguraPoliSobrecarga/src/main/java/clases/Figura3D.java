/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosal
 */
public class Figura3D extends Figura {

    private float volumen;

    public Figura3D(String nombre) {
        super(nombre);
        this.volumen = 0;
    }

    /**
     * @return the volumen
     */
    public float getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    //cubo
    @Override
    public void calculaAV(int lado) {
        setVolumen((float) Math.pow(lado, 3));
    }

    //tetaedro
    @Override
    public void calculaAV(float base, int altura) {
        setVolumen((float) ((Math.pow(base, 3) * Math.sqrt(2)) / 12));

    }

    //esfera
    @Override
    public void calculaAV(float radio) {
        setVolumen((float) ((4 / 3) * Math.PI * Math.pow(radio, 3)));
    }

}
