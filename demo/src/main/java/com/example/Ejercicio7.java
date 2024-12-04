package com.example;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int contvc = 0;
        int contco = 0;
        int opcion = 0;

        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();

        try {

            do {

                System.out.println("Ingresa una opcion: ");
                System.out.println("1.Mostrar numero vocales\n2.Mostrar numero consonantes\n3.Convertir en mayúsculas\n4.Convertir en minuscúlas\n5.Invertir la frase\n6.Salir del programa");
                opcion = sc.nextInt();
    
                for (int i = 0; i < frase.length(); i++) {
                    //Esta funcion char vocales = Character.toLowerCase(frase.charAt(i)); es para coger el valor que tendra i en modo char Ej i = 0 == H --->"Hola"
                    char vocales = Character.toLowerCase(frase.charAt(i));
                    if (vocales == 'a' || vocales == 'e' || vocales == 'i' || vocales == 'o' || vocales == 'u') {
                        contvc++;
                    }else{
                        contco++;
                    }
                }
    
                switch (opcion) {
                    case 1:
                        System.out.println("Tiene " + contvc + " vocales.");
                        continue;
    
                    case 2:
                        System.out.println("Tiene " + contco + " consonantes.");
                        continue;
    
                    case 3:
                        System.out.println(frase.toUpperCase());
                        continue;
    
                    case 4:
                        System.out.println(frase.toLowerCase());
                        continue;
    
                    case 5:
                        String reverse = "";
                        for (int i = frase.length() - 1; i >= 0; i--) {
                            reverse = reverse + frase.charAt(i);
                        }
                        System.out.println(reverse);
                        continue;
    
                    case 6:
                        System.out.println("Has salido del programa.");
                        break;
                
                    default:
                    System.out.println("No has introducido ni nguna de las opciones.");
                        continue;
                }
                
            } while (opcion != 6);
            
        } catch (Exception e) {
            System.out.println("No has introoducido ningun numero.");
        }

        sc.close();

    }
    
}
