package com.example;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int numero = 0;
        int suma = 0;
        int contpares = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int opcion = 0;

        do {

            try {

                System.out.println("Introduce un numero:");
                numero = sc.nextInt();
    
                while (numero <= 0) {
                    System.out.println("Introduce un nuemro mayor que 0 porfavor:");
                    numero = sc2.nextInt();
                }
    
                for (int i = 1; i <= numero; i++) {
    
                    if (i % 2 == 0) {
                        System.out.println(i);
                        suma+=i;
                        contpares++;
                    }
    
                }
    
                System.out.println("La suma total es de: " + suma + ".");
                System.out.println("La cantiddad de pares es de: " + contpares + ".");
                
                } catch (Exception e) {
                System.out.println("No has introducido un numero valido.");
                //break;
            }

            System.out.println("Quieres repetir el programa?\n1.Presiona 1 para volver a jugar. \n2.Presiona cualquir tecla para no volver a jugar. ");
            opcion = sc3.nextInt();

        } while (opcion == 1);

        System.out.println("Se acabo el juego");
        

        sc.close();
        sc2.close();
        sc3.close();

    }
    
}
