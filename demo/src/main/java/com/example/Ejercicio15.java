package com.example;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Crear una matriz 4x4
        int matriz [][] = new int[4][4];
        int numero = 0; // Variable para almacenar los números introducidos por el usuario
        int opcion = 0; // Variable para almacenar la opción del usuario
        int fila = 0; // Variable para almacenar el número de fila seleccionado para la suma
        int sumaTotal = 0; // Variable para acumular la suma de los elementos de la fila

        // Solicitar al usuario que ingrese los valores de la matriz
        System.out.println("Rellena la matriz.");
        for (int i = 0; i < matriz.length; i++) { // Recorrer las filas de la matriz
            System.out.println("Fila numero " + (i+1) + ".");  // Solicitar al usuario que ingrese una fila
            for (int j = 0; j < matriz.length; j++) { // Recorrer las columnas de cada fila
                System.out.println("Columna numero " + (j+1) + ".");
                numero = sc.nextInt();  // Leer el número que el usuario ingresa
                matriz[i][j] = numero;  // Asignar el número ingresado a la matriz
            }
        }

        // Imprimir la matriz después de que el usuario haya ingresado los valores
        for (int i = 0; i < matriz.length; i++) { // Recorrer las filas de la matriz
            System.out.println("Fila numero " + (i+1) + ".");
            for (int j = 0; j < matriz.length; j++) { // Recorrer las columnas de cada fila
                System.out.print("Columna numero " + (j+1) + ":" + matriz[i][j] + ". /"); // Imprimir los valores de la matriz
            }
        }

        System.out.println("");

        // Solicitar la opción al usuario
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();

        // Dependiendo de la opción elegida por el usuario
        switch (opcion) {
            case 1:
                // Si elige la opción 1, solicitar el número de fila para sumar sus elementos
                System.out.println("Que fila quieres que haga la suma de sus numeros: ");
                fila = sc.nextInt();
                while (fila < 0 && fila > 4 ) {  // Comprobar que la fila ingresada esté en el rango correcto (0-3)
                    System.out.println("No has introducido una fila correcta vuelve a probar.");
                    fila = sc.nextInt();
                }
                // Sumar los elementos de la fila seleccionada
                for (int i = 0; i < fila; i++) { // Recorrer las filas hasta la fila seleccionada
                    for (int j = 0; j < matriz.length; j++) { // Recorrer las columnas de esa fila
                        sumaTotal = sumaTotal + matriz[fila][j]; // Sumar los elementos de la fila seleccionada
                    }
                }
                // Imprimir el resultado de la suma
                System.out.println("La suma total es de: " + sumaTotal);
                break;
        
            default:
                // Si el usuario ingresa una opción incorrecta, no se hace nada
                break;
        }

        // Cerrar el Scanner
        sc.close();

    }
    
}
