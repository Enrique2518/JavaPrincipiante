package com.example.OtrosEjercicios;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Pedir dos números y decir si son iguales o no.

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los dos numeros son iguales.");
        }else{
            System.out.println("Los numeros son diferentes.");
        }


        sc.close();

    }
    
}
