package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Pedir el radio de un círculo y calcular su área. A=PI*r^2.

        //Creamos un scanner para introducir datos desde nuestra terminal.
        Scanner sc = new Scanner(System.in);

        double radio = 0;
        double area = 0;

        System.out.println("Introduce el radio de tu circulo: ");
        radio = sc.nextDouble();

        area = Math.pow((Math.PI * radio), 2);

        System.out.println("El area del circulo es de " + area);
        
        sc.close();
    }
}