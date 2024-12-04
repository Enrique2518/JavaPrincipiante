package com.example;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner en = new Scanner(System.in);
        System.out.println("Dame una frase: ");

        String frase = en.nextLine();

        System.out.println(frase.toUpperCase());

        System.out.println(frase.toLowerCase());
        
        System.out.println(frase.length());
        
        System.out.println(frase.startsWith("H"));

        System.out.println(frase.replace('a', 'e'));

        en.close();

    }
    
}
