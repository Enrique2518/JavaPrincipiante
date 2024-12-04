package com.example;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int matriz [][] = new int[4][4];
        int numero = 0;
        int opcion = 0;
        int fila = 0;
        int sumaTotal = 0;

        System.out.println("Rellena la matriz.");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila numero " + (i+1) + ".");
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Columna numero " + (j+1) + ".");
                numero = sc.nextInt();
                matriz[i][j] = numero;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila numero " + (i+1) + ".");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Columna numero " + (j+1) + ":" + matriz[i][j] + ". /");
            }
        }

        System.out.println("");

        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Que fila quieres que haga la suma de sus numeros: ");
                fila = sc.nextInt();
                while (fila < 0 && fila > 4 ) {
                    System.out.println("No has introducido una fila correcta vuelve a probar.");
                    fila = sc.nextInt();
                }
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        sumaTotal = sumaTotal + matriz[fila][j];
                    }
                }
                System.out.println("La suma total es de: " + sumaTotal);
                break;
        
            default:
                break;
        }

        sc.close();

    }
    
}
