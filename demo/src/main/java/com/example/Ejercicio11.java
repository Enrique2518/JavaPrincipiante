package com.example;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int valorSum = 0;
        int valorMedia = 0;

        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("======================");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor mas grande: ");
            if (numeros[i] >= maximo) {
                maximo = numeros[i];
            }
            System.out.println(maximo);
        }

        System.out.println("======================");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor mas pequeño: ");
            if (numeros[i] <= minimo) {
                minimo = numeros[i];
            }
            System.out.println(minimo);
        }

        for (int i = 0; i < numeros.length; i++) {
            valorSum += numeros[i];
        }
        System.out.println("El valor de todas las unidades sumadas es de: " + valorSum);

        valorMedia = valorSum / numeros.length;
        System.out.println("La media de todas las unidades es de: " + valorMedia);

        System.out.println("===============================");

        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();


    }
    
}
