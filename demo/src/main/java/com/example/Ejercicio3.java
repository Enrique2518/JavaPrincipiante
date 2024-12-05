package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    // Definimos una constante con el año actual (2024).
    private static final int ANYOACTUAL = 2024;

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables para almacenar el año de nacimiento y la edad.
        int anyoIntroducido;
        int edad = 0;

        try {
            // Solicitamos al usuario que ingrese su año de nacimiento.
            System.out.println("Introduce tu año de nacimiento: ");
            anyoIntroducido = sc.nextInt();

            // Verificamos si el año introducido es mayor al año actual (2024).
            if (anyoIntroducido > ANYOACTUAL) {
                // Si el año es mayor al actual, mostramos un mensaje de error.
                System.out.println("No puedes haber nacido, aún ni existes.");
            } else {
                // Si el año es válido, calculamos la edad.
                edad = ANYOACTUAL - anyoIntroducido;

                // Mostramos la edad calculada.
                System.out.println("Tienes " + edad + " años.");

                // Comprobamos diferentes rangos de edad y mostramos un mensaje adecuado.
                if (edad < 18) {
                    System.out.println("Eres menor de edad.");
                } else if (edad == 18) {
                    System.out.println("Eres mayor de edad.");
                } else if (edad > 18 && edad <= 30) {
                    System.out.println("Eres mayor de edad, tienes: " + edad + ", ya no eres tan joven.");
                } else if (edad > 30 && edad <= 50) {
                    System.out.println("Eres mayor de edad, tienes: " + edad + ", ya estás a punto de jubilarte.");
                } else if (edad > 50 && edad <= 70) {
                    System.out.println("Eres mayor de edad, tienes: " + edad + " ,ya estás jubilado.");
                } else {
                    System.out.println("Eres mayor de edad, tienes: " + edad + " ,ya estás disfrutando de la vida.");
                }
            }

        } catch (InputMismatchException e) {
            // Capturamos la excepción si el usuario introduce un valor no numérico.
            System.out.println("No has introducido una edad válida.");
        }

        // Cerramos el Scanner al final para liberar los recursos.
        sc.close();

    }

}
