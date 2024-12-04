package com.example;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroCol = 0;
        int numero = 0;

        System.out.println("Introduce el numero de columnas que quieres que tenga tu matriz: ");
        numeroCol = sc.nextInt();

        int numeros [][] = new int[5][numeroCol];

        System.out.println("Rellena tu matriz con numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("====================================");
            System.out.println("Fila numero " + (i+1) + " :");
            for (int j = 0; j < numeroCol; j++) {
                System.out.println("Columna numero " + (1+j) + " :");
                numero = sc.nextInt();
                numeros[i][j] = numero;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeroCol; j++) {
                System.out.println(numeros[i][j]);
            }
        }
        sc.close();

    }
    
}
