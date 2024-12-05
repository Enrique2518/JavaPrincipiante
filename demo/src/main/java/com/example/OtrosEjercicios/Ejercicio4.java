package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Pedir dos números y decir si uno es múltiplo del otro.
        
        //Creamos un scanner para recibir la entrada de los usuarios desde la terminal.
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables para almacenar los dos números que el usuario introducirá.
        int numero1 = 0;
        int numero2 = 0;

        //Solicitamos al usuario que ingrese el primer número.
        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();

        //Solicitamos al usuario que ingrese el segundo número.
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        //Comprobamos si el primer número es múltiplo del segundo utilizando el operador módulo (%).
        if ((numero1 % numero2) == 0) {
            //Si el resto de la división es 0, los números son múltiplos.
            System.out.println("Son multiplos");
        } else {
            //Si no es así, mostramos que no son múltiplos.
            System.out.println("No son multiplos.");
        }

        //Cerramos el scanner para liberar los recursos.
        sc.close();

    }
    
}
