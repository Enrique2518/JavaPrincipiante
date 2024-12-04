package com.example;

import java.util.Scanner;

public class Ejercicio8 {

    /****************************************/
    /* Nom: Enrique Muñoz-Torrero Rodriguez	*/
    /* DNI/NIE: 43235257H 			        */
    /* Data: 10/10/2024 				    */
    /* Exercici: PROU2EX01				    */
    /****************************************/


    public static void main(String[] args) {
        
        //Instanciamos nuestras variaables.
        Scanner sc  = new Scanner(System.in);
        int numero = 0;

        try {
            
        //Escribimos por consola el nuemero hasta el que quiere que llegue nuestro problema.
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();

        //Si nuestro número es 0 o menor nos volverá a preguntar que no es valido esos números.
        while (numero <= 0) {
            System.out.println("No has introducido un número 1 o mayor que el vuelve a probar.");
            System.out.println("Escribe un número: ");
            numero = sc.nextInt();
        }

        //Bucle para que nos enseñe desde el 1 hasta el número que hemos introducido por consola.
        //Y nos diga cuales números son pares y cuales impares.
        for (int i = 1; i <= numero; i++) {
            
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par.");
            }else{
                System.out.println("El número "+ i + " es impar.");
            }

        }

        //Si introducimos un valor que no sea numérico nos saltará este error exception y se acabará el programa.
        } catch (Exception e) {
            System.out.println("No has introducido un número correcto");
            sc.nextLine();
        }
        

        //Cerramos nuestra consola para introducir datos a la termianl.
        sc.close();

    }
    
}
