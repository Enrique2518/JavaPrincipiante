package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Pedir un numero por consola e imprimir cuanntas cifras tiene.
        
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Escribe un numero entre 0 y 9.999");
        numero = sc.nextInt();

        String num = Integer.toString(numero);

        System.out.println("Nuestro numero tiene un total de " + num.length() + " cifras");

        sc.close();

    }
    
}
