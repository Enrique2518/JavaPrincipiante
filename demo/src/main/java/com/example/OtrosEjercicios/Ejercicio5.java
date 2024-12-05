package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Pedir dos números y decir cual es el mayor o si son iguales.

        // Creamos un scanner para recibir la entrada de los usuarios desde la terminal.
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables para almacenar los dos números que el usuario
        // introducirá.
        int numero1 = 0;
        int numero2 = 0;

        // Solicitamos al usuario que ingrese el primer número.
        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();

        // Solicitamos al usuario que ingrese el segundo número.
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        // Comparamos los dos números para determinar cuál es el mayor o si son iguales.
        if (numero1 > numero2) {
            // Si el primer número es mayor que el segundo, mostramos un mensaje indicando
            // eso.
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            // Si el primer número es menor que el segundo, mostramos un mensaje indicando
            // eso.
            System.out.println("El numero " + numero2 + " es mayor que " + numero1);
        } else {
            // Si ambos números son iguales, mostramos que son iguales.
            System.out.println("Son iguales.");
        }

        // Cerramos el scanner para liberar los recursos.
        sc.close();

    }

}
