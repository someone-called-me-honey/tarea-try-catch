package main;

import herenciaoperaciones.ClaseHija_Resta;
import herenciaoperaciones.ClaseHija_Suma;
import java.util.InputMismatchException;

/**
 *
 * @author maryse
 */
public class HerenciaOperaciones {

    public static void main(String[] args) {

        try {
            ClaseHija_Suma suma = new ClaseHija_Suma();
            suma.PedirDatos();
            suma.Sumar();
            System.out.print("El resultado de la suma es: ");
            suma.MostrarResultados();

            ClaseHija_Resta resta = new ClaseHija_Resta();
            resta.PedirDatos();
            resta.Resta();
            System.out.print("\nEl resultado de la resta es: ");
            resta.MostrarResultados();
        } catch (InputMismatchException s) {
            System.out.println("\tCaptura de excepcion-> " + s);
            System.out.println("\t se esperaba un numero entero");
        }

    }

}
