package com.example;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Definimos las variables necesarias
        int numero = 0;          // Para almacenar el número introducido por el usuario
        int suma = 0;            // Para acumular la suma de los números pares
        int contpares = 0;       // Para contar cuántos números pares hay
        Scanner sc = new Scanner(System.in);    // Scanner para leer el primer número
        Scanner sc2 = new Scanner(System.in);   // Scanner para asegurar que el número es mayor que 0
        Scanner sc3 = new Scanner(System.in);   // Scanner para leer la opción del usuario de repetir el juego

        // Variable para determinar si el usuario quiere repetir el programa
        int opcion = 0;

        // Bucle principal que permite ejecutar el programa varias veces
        do {

            try {
                // Pedimos al usuario que introduzca un número
                System.out.println("Introduce un numero:");
                numero = sc.nextInt();
    
                // Validamos que el número introducido sea mayor que 0
                while (numero <= 0) {
                    System.out.println("Introduce un numero mayor que 0 porfavor:");
                    numero = sc2.nextInt();
                }
    
                // Iteramos desde 1 hasta el número introducido
                for (int i = 1; i <= numero; i++) {
    
                    // Verificamos si el número es par
                    if (i % 2 == 0) {
                        System.out.println(i);   // Imprimimos el número par
                        suma += i;               // Sumamos el número par a la variable 'suma'
                        contpares++;             // Incrementamos el contador de números pares
                    }
    
                }
    
                // Mostramos la suma total de los números pares
                System.out.println("La suma total es de: " + suma + ".");
                // Mostramos la cantidad de números pares encontrados
                System.out.println("La cantidad de pares es de: " + contpares + ".");
                
            } catch (Exception e) {
                // Si ocurre un error (por ejemplo, el usuario no introduce un número válido), mostramos un mensaje
                System.out.println("No has introducido un numero valido.");
            }

            // Preguntamos al usuario si quiere repetir el programa
            System.out.println("Quieres repetir el programa?\n1.Presiona 1 para volver a jugar. \n2.Presiona cualquier tecla para no volver a jugar.");
            opcion = sc3.nextInt();

        } while (opcion == 1);   // Si el usuario presiona 1, el programa se repite

        // Mensaje final cuando el usuario decide no continuar
        System.out.println("Se acabó el juego");

        // Cerramos todos los objetos Scanner para liberar los recursos
        sc.close();
        sc2.close();
        sc3.close();

    }
}
