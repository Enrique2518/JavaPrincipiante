package com.example;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner para leer datos desde la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese un número del 1 al 7, representando los días de la semana.
        System.out.println("Introduce un numero del 1 al 7:");
        int numero = sc.nextInt();

        // Utilizamos un bloque switch para verificar el número introducido y mostrar el nombre del día correspondiente.
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            
            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;
        
            // Si el número no está en el rango de 1 a 7, mostramos un mensaje de error.
            default:
                System.out.println("No has introducido uno de los valores válidos, vuelve a intentarlo.");
                break;
        }

        // Verificamos si el número corresponde a un día laborable (lunes a viernes) o fin de semana (sábado o domingo).
        if (numero >= 1 && numero < 6) {
            System.out.println("Es un día laborable.");
        } else {
            System.out.println("Es fin de semana.");
        }

        // Cerramos el objeto Scanner para liberar los recursos.
        sc.close();
    }
    
}
