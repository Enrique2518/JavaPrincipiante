package com.example;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7:");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            
            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;
        
            default:
            System.out.println("No has introducido uno de los valores vuelve a intentarlo.");
                break;
        }

        if (numero >=1 && numero < 6) {
            System.out.println("Es un dia laborable.");
        }else{
            System.out.println("Es fin de semana.");
        }

        sc.close();

    }
    
}
