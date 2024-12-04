package com.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int altura, lado1, lado2;

        System.out.println("Introduce el valor de la altura: ");
        altura = entrada.nextInt();

        System.out.println("Introduce el valor del lado 1: ");
        lado1 = entrada.nextInt();

        System.out.println("Introduce el valor del lado 2: ");
        lado2 = entrada.nextInt();
        

        double volumen =((double)(altura / 3)) * (lado1 + lado2 + (Math.sqrt((double)lado1*lado2)) );

        System.err.println("El volumen de una piramide es de: " + volumen);

        entrada.close();
    }
}