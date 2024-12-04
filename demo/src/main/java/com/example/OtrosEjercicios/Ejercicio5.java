package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        //Pedir dos números y decir cual es el mayor o si son iguales.
        
        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
        }else if (numero1 < numero2) {
            System.out.println("El numero " + numero2 + " es mayor que " + numero1);
        }else{
            System.out.println("Son iguales.");
        }

        sc.close();

    }
    
}
