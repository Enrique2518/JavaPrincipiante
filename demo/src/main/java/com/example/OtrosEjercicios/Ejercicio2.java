package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Pedir el radio de una circunferencia y calcular su longitud.
        
        //Creamos un scanner para que el usuario pueda introducir datos desde la terminal.
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables necesarias: el radio de la circunferencia y la longitud que vamos a calcular
        double radio = 0;
        double longitud = 0;

        //Solicitamos al usuario que introduzca el radio de la circunferencia
        System.out.println("Introduce un radio: ");
        radio = sc.nextDouble();

        //Calculamos la longitud de la circunferencia usando la fórmula: L = 2 * PI * radio
        longitud = 2 * (Math.PI * radio);

        //Mostramos el resultado de la longitud de la circunferencia en la terminal
        System.out.println("La longitud de nuestra circunferencia es de : " + longitud);

        //Cerramos el scanner para evitar fugas de recursos
        sc.close();

    }
    
}
