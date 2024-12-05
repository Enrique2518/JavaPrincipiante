package com.example;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Inicializar las variables para almacenar el máximo, mínimo, suma y media
        int maximo = Integer.MIN_VALUE; // Valor más pequeño posible
        int minimo = Integer.MAX_VALUE; // Valor más grande posible
        int valorSum = 0;
        int valorMedia = 0;

        // Arreglo de números
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Mostrar los números del arreglo
        System.out.println("Números en el arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Separador visual
        System.out.println("======================");

        // Bucle para calcular el máximo, el mínimo y la suma
        for (int i = 0; i < numeros.length; i++) {
            // Calculamos el valor máximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            // Calculamos el valor mínimo
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }

            // Sumar los valores
            valorSum += numeros[i];
        }

        // Mostrar el máximo y el mínimo
        System.out.println("El valor más grande es: " + maximo);
        System.out.println("El valor más pequeño es: " + minimo);

        // Calcular la media
        valorMedia = valorSum / numeros.length; // Dividimos por la cantidad de elementos
        System.out.println("La suma de todas las unidades es de: " + valorSum);
        System.out.println("La media de todas las unidades es de: " + valorMedia);

        // Separador visual
        System.out.println("===============================");

        // Mostrar los números en orden inverso
        System.out.println("Los números en orden inverso:");
        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Cerrar el Scanner
        sc.close();
    }
}
