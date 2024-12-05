package com.example.OtrosEjercicios;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        //Pedir tres números y mostrarlos ordenados de mayor a menor.

        //Creamos un scanner para recibir la entrada de los usuarios desde la terminal.
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables para almacenar los tres números que el usuario introducirá.
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        //Solicitamos al usuario que ingrese el primer número.
        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();

        //Solicitamos al usuario que ingrese el segundo número.
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        //Solicitamos al usuario que ingrese el tercer número.
        System.out.println("Escribe el tercer numero: ");
        numero3 = sc.nextInt();

        //Comparamos los tres números para mostrarlos ordenados de mayor a menor.
        if (numero1 > numero2 && numero2 > numero3) {
            //Si el primer número es mayor que el segundo, y el segundo es mayor que el tercero.
            System.out.println(numero1 + " " + numero2 + " " + numero3);
        } else if (numero1 > numero3 && numero2 < numero3) {
            //Si el primer número es mayor que el tercero y el segundo es menor que el tercero.
            System.out.println(numero1 + " " + numero3 + " " + numero2);
        } else if (numero1 < numero2 && numero1 > numero3) {
            //Si el primer número es menor que el segundo pero mayor que el tercero.
            System.out.println(numero2 + " " + numero1 + " " + numero3);
        } else if (numero3 < numero2 && numero1 < numero3) {
            //Si el tercer número es menor que el segundo y el primer número es menor que el tercero.
            System.out.println(numero2 + " " + numero3 + " " + numero1);
        } else if (numero3 > numero2 && numero1 > numero2) {
            //Si el tercer número es mayor que el segundo, y el primer número es mayor que el segundo.
            System.out.println(numero3 + " " + numero1 + " " + numero2);
        } else if (numero3 > numero2 && numero1 < numero2) {
            //Si el tercer número es mayor que el segundo, y el primer número es menor que el segundo.
            System.out.println(numero3 + " " + numero2 + " " + numero1);
        }

        //Cerramos el scanner para liberar los recursos.
        sc.close();

    }
    
}
