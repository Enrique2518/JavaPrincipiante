package com.example;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Variables que se usarán para almacenar el número de columnas y el valor introducido por el usuario
        int numeroCol = 0;  // Número de columnas que tendrá la matriz
        int numero = 0;     // Valor introducido por el usuario para cada celda de la matriz

        // Solicitar al usuario que ingrese el número de columnas de la matriz
        System.out.println("Introduce el numero de columnas que quieres que tenga tu matriz: ");
        numeroCol = sc.nextInt();

        // Crear la matriz con 5 filas y un número de columnas que se define en la variable numeroCol
        int numeros [][] = new int[5][numeroCol];

        // Solicitar al usuario que rellene la matriz con números
        System.out.println("Rellena tu matriz con numeros: ");
        for (int i = 0; i < numeros.length; i++) {   // Bucle para recorrer las filas de la matriz
            System.out.println("====================================");
            System.out.println("Fila numero " + (i+1) + " :");  // Imprimir el número de la fila actual
            for (int j = 0; j < numeroCol; j++) {    // Bucle para recorrer las columnas de la fila actual
                System.out.println("Columna numero " + (1+j) + " :");  // Imprimir el número de la columna actual
                numero = sc.nextInt();    // Leer el valor que el usuario quiere ingresar para la celda
                numeros[i][j] = numero;   // Asignar el valor leído a la posición [i][j] de la matriz
            }
        }

        // Imprimir la matriz completa una vez que ha sido rellenada por el usuario
        System.out.println("Matriz completa:");
        for (int i = 0; i < numeros.length; i++) {   // Recorrer las filas de la matriz
            for (int j = 0; j < numeroCol; j++) {   // Recorrer las columnas de la fila actual
                System.out.print(numeros[i][j] + " ");  // Imprimir el valor de la celda [i][j]
            }
            System.out.println();  // Imprimir una nueva línea después de cada fila
        }
        sc.close();   // Cerrar el objeto Scanner al final para liberar recursos

    }
}
