package com.example;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int matriz [][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sumaTotal = 0;
        int contador = 0;

        int valorMaximo = Integer.MIN_VALUE;
        int valorMinimo = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matriz.length; j++) {
                sumaTotal += matriz[i][j];
                System.out.println(matriz[i][j]);
                contador++;
                if (matriz[i][j] >= valorMaximo) {
                    valorMaximo = matriz[i][j];
                }

                if (matriz[i][j] <= valorMinimo) {
                    valorMinimo = matriz[i][j];
                }
            }
        }

        System.out.println("La suma total de todos los numeros es de: " + sumaTotal);
        System.out.println("La media total de todos los numeros es de: " + (sumaTotal / contador));
        System.out.println("El valor minimo de la matriz es de: " + valorMinimo);
        System.out.println("El valor maximo de la matriz es de: " + valorMaximo);

        sc.close();

    }
}
