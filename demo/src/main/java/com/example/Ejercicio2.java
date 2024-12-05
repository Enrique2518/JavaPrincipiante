package com.example;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Creamos un objeto Scanner para leer datos desde la entrada del usuario.
        Scanner en = new Scanner(System.in);

        //Solicitamos al usuario que ingrese una frase.
        System.out.println("Dame una frase: ");

        //Leemos la frase que el usuario ingresa y la almacenamos en la variable 'frase'.
        String frase = en.nextLine();

        //Imprimimos la frase en mayúsculas usando el método toUpperCase().
        System.out.println(frase.toUpperCase());

        //Imprimimos la frase en minúsculas usando el método toLowerCase().
        System.out.println(frase.toLowerCase());
        
        //Imprimimos la longitud de la frase usando el método length().
        System.out.println(frase.length());
        
        //Comprobamos si la frase comienza con la letra 'H' usando el método startsWith().
        System.out.println(frase.startsWith("H"));

        //Sustituimos todas las 'a' por 'e' en la frase usando el método replace().
        System.out.println(frase.replace('a', 'e'));

        //Cerramos el objeto Scanner para liberar los recursos que está utilizando.
        en.close();
    }
    
}
