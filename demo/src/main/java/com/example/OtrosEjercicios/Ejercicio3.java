package com.example.OtrosEjercicios;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Pedir dos números y decir si son iguales o no.

        //Creamos un scanner para poder recibir la entrada de los usuarios desde la terminal.
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables para almacenar los dos números que el usuario va a introducir.
        int numero1 = 0;
        int numero2 = 0;

        //Solicitamos al usuario que ingrese el primer número.
        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();

        //Solicitamos al usuario que ingrese el segundo número.
        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        //Comprobamos si los dos números son iguales. Si lo son, mostramos un mensaje correspondiente.
        if (numero1 == numero2) {
            System.out.println("Los dos numeros son iguales.");
        } else {
            //Si los números no son iguales, mostramos que son diferentes.
            System.out.println("Los numeros son diferentes.");
        }

        //Cerramos el scanner para liberar los recursos.
        sc.close();

    }
    
}
