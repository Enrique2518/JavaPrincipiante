package com.example.OtrosEjercicios;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        //Pedir tres números y mostrarlos ordenados de mayor a menor.

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Escribe el tercer numero: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println(numero1 + " " + numero2 + " " + numero3);
        }else if(numero1 > numero3 && numero2 < numero3){
            System.out.println(numero1 + " " + numero3 + " " + numero2);
        }else if (numero1 < numero2 && numero1 > numero3) {
            System.out.println(numero2 + " " + numero1 + " " + numero3);
        }else if (numero3 < numero2 && numero1 < numero3) {
            System.out.println(numero2 + " " + numero3 + " " + numero1);
        }else if (numero3 > numero2 && numero1 > numero2) {
            System.out.println(numero3 + " " + numero1 + " " + numero2);
        }else if (numero3 > numero2 && numero1 < numero2) {
            System.out.println(numero3 + " " + numero2 + " " + numero1);
        }

        sc.close();

    }
    
}
