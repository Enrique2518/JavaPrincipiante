package com.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numRan = random.nextInt(100) + 1;

        int numIntentos = 0;

        int opcion = 0;

        int num = 0;

        do {

            try {

                System.out.println("Introduce un numero del 1 al 100: ");
                num = sc.nextInt();
        
                while (num != numRan) {
                    System.out.println("No es el correcto.");
                    if (num > numRan) {
                        System.out.println("El numero random es mas pequeño.");
                    }else{
                        System.out.println("El numero random es mas grande.");
                    }
                    numIntentos++;
                    System.out.println("Vuelve a intentarlo");
                    num = sc.nextInt();
                }
        
                System.out.println("Lo has adivinado en " + numIntentos + " intentos, felicidades.");
        
                
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un numero, no sabes diferneciar numeros a letras?");
                break;
            }
            
            System.out.println("Quieres volver a jugar: \nPersiona nº1: Si \nPersiona nº2: No");
            opcion = sc.nextInt();
        } while (opcion == 1);

        System.out.println("Hasta la proxima.");


        sc.close();

    }
    
}
