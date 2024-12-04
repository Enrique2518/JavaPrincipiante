package com.example.OtrosEjercicios;
public class Ejercicio8 {

    public static void main(String[] args) {

        //Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("=====================================");
            System.out.println("Tabla de multilpliacar del numero " + i);
            System.out.println("=====================================");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }

    }
    
}
