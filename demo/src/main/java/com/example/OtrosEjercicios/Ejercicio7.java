package com.example.OtrosEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Pedir un numero por consola e imprimir cuántas cifras tiene.

        //Creamos un scanner para recibir la entrada de los usuarios desde la terminal.
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable para almacenar el número que el usuario va a introducir.
        int numero = 0;

        //Solicitamos al usuario que ingrese un número entre 0 y 9.999.
        System.out.println("Escribe un numero entre 0 y 9.999");
        numero = sc.nextInt();

        //Convertimos el número a una cadena de texto (String) para poder contar sus caracteres.
        String num = Integer.toString(numero);

        //Imprimimos en pantalla la cantidad de cifras que tiene el número.
        System.out.println("Nuestro numero tiene un total de " + num.length() + " cifras");

        //Cerramos el scanner para liberar los recursos.
        sc.close();

    }
    
}
