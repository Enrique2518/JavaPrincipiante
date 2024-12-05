package com.example.OtrosEjercicios;

public class Ejercicio8 {

    public static void main(String[] args) {

        //Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.

        //Usamos un bucle externo para iterar del 1 al 10, que representa el número de la tabla de multiplicar.
        for (int i = 1; i <= 10; i++) {
            //Imprimimos una línea de separación para que sea visualmente claro en la salida.
            System.out.println("=====================================");
            //Imprimimos el encabezado indicando el número de la tabla de multiplicar que estamos mostrando.
            System.out.println("Tabla de multiplicar del numero " + i);
            System.out.println("=====================================");
            
            //Usamos un bucle interno para iterar del 0 al 10 y multiplicar el número actual (i) por cada valor de j.
            for (int j = 0; j <= 10; j++) {
                //Imprimimos el resultado de la multiplicación de i por j.
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
    
}
