package com.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Creamos un objeto Random para generar números aleatorios.
        Random random = new Random();
        
        // Generamos un número aleatorio entre 1 y 100.
        int numRan = random.nextInt(100) + 1;

        // Variable para contar los intentos realizados.
        int numIntentos = 0;

        // Variable para almacenar la opción del usuario (si quiere jugar nuevamente o no).
        int opcion = 0;

        // Variable para almacenar el número ingresado por el usuario.
        int num = 0;

        // Bucle principal que permite jugar varias veces si el usuario lo desea.
        do {

            try {

                // Solicita al usuario que ingrese un número entre 1 y 100.
                System.out.println("Introduce un numero del 1 al 100: ");
                num = sc.nextInt();
        
                // Mientras el número introducido no sea igual al número aleatorio, sigue solicitando el ingreso.
                while (num != numRan) {
                    // Si el número no es correcto, le damos pistas al usuario.
                    System.out.println("No es el correcto.");
                    if (num > numRan) {
                        System.out.println("El numero random es mas pequeño.");
                    } else {
                        System.out.println("El numero random es mas grande.");
                    }
                    // Incrementamos el contador de intentos.
                    numIntentos++;
                    System.out.println("Vuelve a intentarlo");
                    // Pedimos el número nuevamente.
                    num = sc.nextInt();
                }
        
                // Si el usuario adivina el número, mostramos el número de intentos realizados.
                System.out.println("Lo has adivinado en " + numIntentos + " intentos, felicidades.");
        
            } catch (InputMismatchException e) {
                // Si el usuario introduce algo que no sea un número, capturamos el error y mostramos un mensaje.
                System.out.println("No has introducido un número, ¿no sabes diferenciar números de letras?");
                // Salimos del bucle si ocurre un error.
                break;
            }
            
            // Preguntamos al usuario si desea jugar otra vez.
            System.out.println("Quieres volver a jugar? \nPulsar nº1: Si \nPulsar nº2: No");
            opcion = sc.nextInt();
        } while (opcion == 1); // Si el usuario elige '1', vuelve a jugar.

        // Mensaje de despedida cuando el usuario decide no jugar más.
        System.out.println("Hasta la próxima.");

        // Cerramos el objeto Scanner para liberar recursos.
        sc.close();
    }
}
