package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Pedir dos números y decir si uno es múltiplo del otro.
        
        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        if ((numero1 % numero2) == 0) {
            System.out.println("Son multiplos");
        }else{
            System.out.println("No son multiplos.");
        }

        sc.close();

    }
    
}
