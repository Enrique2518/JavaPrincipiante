package com.example;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Definir la matriz de números
        int matriz [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaTotal = 0;
        int contador = 0;

        // Inicializar valores máximos y mínimos
        int valorMaximo = Integer.MIN_VALUE;
        int valorMinimo = Integer.MAX_VALUE;

        // Recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {  // Usar matriz[i].length para las columnas
                sumaTotal += matriz[i][j];  // Sumar el valor de cada celda
                System.out.println(matriz[i][j]);
                contador++;  // Contar el número de elementos

                // Actualizar el valor máximo
                if (matriz[i][j] >= valorMaximo) {
                    valorMaximo = matriz[i][j];
                }

                // Actualizar el valor mínimo
                if (matriz[i][j] <= valorMinimo) {
                    valorMinimo = matriz[i][j];
                }
            }
        }

        // Calcular la media (con precisión decimal)
        double mediaTotal = (double) sumaTotal / contador;

        // Mostrar los resultados
        System.out.println("La suma total de todos los números es de: " + sumaTotal);
        System.out.println("La media total de todos los números es de: " + mediaTotal);
        System.out.println("El valor mínimo de la matriz es de: " + valorMinimo);
        System.out.println("El valor máximo de la matriz es de: " + valorMaximo);

        sc.close();
    }
}
