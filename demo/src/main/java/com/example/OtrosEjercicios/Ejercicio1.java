package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Pedir el radio de un círculo y calcular su área. A=PI*r^2.

        //Creamos un scanner para introducir datos desde nuestra terminal.
        Scanner sc = new Scanner(System.in);

        //Creamos nuestras dos variables
        double radio = 0;
        double area = 0;

        //Introducimos en terminal cual es el radio de nuestro circulo
        System.out.println("Introduce el radio de tu circulo: ");
        radio = sc.nextDouble();

        //Creamos la formula que nos dara el resultado del area de nuestro circulo
        area = Math.pow((Math.PI * radio), 2);

        //Imprimimos por pantalla un mensaje mas el valor de nuestra area
        System.out.println("El area del circulo es de " + area);
        
        //Cerramos el scanner.
        sc.close();
    }
}