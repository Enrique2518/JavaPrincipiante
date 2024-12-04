package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Pedir el radio de una circunferencia y calcular su longitud.
        
        Scanner sc = new Scanner(System.in);

        double radio = 0;
        double longitud = 0;

        System.out.println("Introduce un radio: ");
        radio = sc.nextDouble();

        longitud = 2 * (Math.PI * radio);

        System.out.println("La longitud de nuestra circunferencia es de : " + longitud);

        sc.close();

    }
    
}
