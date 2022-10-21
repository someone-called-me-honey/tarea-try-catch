/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import clases.Figura2D;
import clases.Figura3D;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String option, cadena, input;
            do {
                input = JOptionPane.showInputDialog(input());
                switch (input) {
                    case "1" -> {
                        option = JOptionPane.showInputDialog(menu1());
                        switch (option) {
                            case "1" -> {
                                cadena = JOptionPane.showInputDialog("Escribe el lado: ");
                                int lado = Integer.parseInt(cadena);
                                Figura2D square = new Figura2D("Cuadrado");
                                square.calculaAV(lado);
                                JOptionPane.showMessageDialog(null, "El area del " + square.getNombre() + " es: " + square.getArea());
                            }
                            case "2" -> {
                                cadena = JOptionPane.showInputDialog("Escribe el radio: ");
                                float radio = Float.parseFloat(cadena);
                                Figura2D circle = new Figura2D("Circulo");
                                circle.calculaAV(radio);
                                JOptionPane.showMessageDialog(null, "El area del " + circle.getNombre() + " es: " + circle.getArea());
                            }
                            case "3" -> {
                                cadena = JOptionPane.showInputDialog("Escribe la base: ");
                                float base = Float.parseFloat(cadena);
                                cadena = JOptionPane.showInputDialog("Ingresa la altura: ");
                                int altura = Integer.parseInt(cadena);
                                Figura2D triangle = new Figura2D("Triangulo");
                                triangle.calculaAV(base, altura);
                                JOptionPane.showMessageDialog(null, "El area del " + triangle.getNombre() + " es: " + triangle.getArea());
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Esa no me la sé");
                        }
                    }
                    case "2" -> {
                        option = JOptionPane.showInputDialog(menu2());
                        switch (option) {
                            case "2" -> {
                                cadena = JOptionPane.showInputDialog("Escribe el radio: ");
                                float radio2 = Float.parseFloat(cadena);
                                Figura3D sphere = new Figura3D("Esfera");
                                sphere.calculaAV(radio2);
                                JOptionPane.showMessageDialog(null, "El volumen de la " + sphere.getNombre() + " es: " + sphere.getVolumen());
                            }
                            case "1" -> {
                                cadena = JOptionPane.showInputDialog("Escribe la arista");
                                int arista = Integer.parseInt(cadena);
                                Figura3D cube = new Figura3D("Cubo");
                                cube.calculaAV(arista);
                                JOptionPane.showMessageDialog(null, "El volumen del " + cube.getNombre() + " es: " + cube.getVolumen());
                            }
                            case "3" -> {
                                cadena = JOptionPane.showInputDialog("Escribe la arista: ");
                                float arista2 = Float.parseFloat(cadena);
                                int altureishon = 0;
                                Figura3D tethaedron = new Figura3D("Tetaedro");
                                tethaedron.calculaAV(arista2, altureishon);
                                JOptionPane.showMessageDialog(null, "El volumen del " + tethaedron.getNombre() + " es: " + tethaedron.getVolumen());
                            }
                            default ->
                                JOptionPane.showMessageDialog(null, "Esa no me la sé");
                        }
                    }
                    case "x" ->
                        JOptionPane.showMessageDialog(null, "camara pues ");
                    default ->
                        JOptionPane.showMessageDialog(null, "Esa no me la sé");
                }
            } while (!"x".equals(input));
        } catch (NumberFormatException a) {
            System.out.println("\tCaptura de excepcion-> " + a);
            JOptionPane.showMessageDialog(null, "Se esperaba un valor numerico");
        }
    }

    public static String input() {
        return """
               Bienvenido
                Que tipo de figura quieres calcular
                1 - Figura 2D
                2 - Figura 3D
                x - Salir""";
    }

    public static String menu1() {
        return """
               Selecciona la figura para calcular su area
                1 - Cuadrado 
                2 - Circulo 
                3 - Triangulo """;
    }

    public static String menu2() {
        return """
               Selecciona la figura para calcular su volumen
                1 - Cubo 
                2 - Esfera 
                3 - Tetaedro """;
    }
}
