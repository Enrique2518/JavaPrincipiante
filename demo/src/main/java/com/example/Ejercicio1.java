package com.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Creamos un objeto Scanner para leer datos de la entrada del usuario.
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables para almacenar la altura y los dos lados de la pirámide.
        int altura, lado1, lado2;

        //Solicitamos al usuario que ingrese el valor de la altura de la pirámide.
        System.out.println("Introduce el valor de la altura: ");
        altura = entrada.nextInt();

        //Solicitamos al usuario que ingrese el valor del primer lado de la base de la pirámide.
        System.out.println("Introduce el valor del lado 1: ");
        lado1 = entrada.nextInt();

        //Solicitamos al usuario que ingrese el valor del segundo lado de la base de la pirámide.
        System.out.println("Introduce el valor del lado 2: ");
        lado2 = entrada.nextInt();

        //Calculamos el volumen de la pirámide usando la fórmula proporcionada.
        //La fórmula es (altura / 3) * (lado1 + lado2 + √(lado1 * lado2)).
        double volumen = ((double)(altura / 3)) * (lado1 + lado2 + (Math.sqrt((double)lado1 * lado2)) );

        //Imprimimos el resultado del volumen calculado en la consola.
        System.err.println("El volumen de una piramide es de: " + volumen);

        //Cerramos el objeto Scanner para liberar los recursos que está utilizando.
        entrada.close();
    }
}
