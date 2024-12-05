package com.example;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Inicializamos los contadores para vocales y consonantes
        int contvc = 0; // Contador de vocales
        int contco = 0; // Contador de consonantes
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario

        // Pedimos al usuario que ingrese una frase
        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine(); // Leemos la frase ingresada

        try {
            // Bucle principal que permite ejecutar el programa hasta que el usuario decida salir
            do {
                // Mostramos el menú de opciones
                System.out.println("Ingresa una opcion: ");
                System.out.println("1.Mostrar numero vocales\n2.Mostrar numero consonantes\n3.Convertir en mayúsculas\n4.Convertir en minúsculas\n5.Invertir la frase\n6.Salir del programa");
                opcion = sc.nextInt(); // Leemos la opción seleccionada por el usuario
    
                // Recorremos la frase para contar vocales y consonantes
                for (int i = 0; i < frase.length(); i++) {
                    // Convertimos cada carácter de la frase a minúscula para evitar problemas con mayúsculas/minúsculas
                    char vocales = Character.toLowerCase(frase.charAt(i));
                    
                    // Si el carácter es una vocal, incrementamos el contador de vocales
                    if (vocales == 'a' || vocales == 'e' || vocales == 'i' || vocales == 'o' || vocales == 'u') {
                        contvc++;
                    // Si no es una vocal, incrementamos el contador de consonantes
                    } else if (Character.isLetter(vocales)) { // Solo consideramos consonantes si es una letra
                        contco++;
                    }
                }
    
                // Procesamos la opción seleccionada por el usuario
                switch (opcion) {
                    case 1:
                        System.out.println("Tiene " + contvc + " vocales.");
                        continue; // Continuamos al siguiente ciclo del menú
    
                    case 2:
                        System.out.println("Tiene " + contco + " consonantes.");
                        continue; // Continuamos al siguiente ciclo del menú
    
                    case 3:
                        System.out.println(frase.toUpperCase()); // Convertimos la frase a mayúsculas
                        continue; // Continuamos al siguiente ciclo del menú
    
                    case 4:
                        System.out.println(frase.toLowerCase()); // Convertimos la frase a minúsculas
                        continue; // Continuamos al siguiente ciclo del menú
    
                    case 5:
                        // Invertimos la frase
                        String reverse = "";
                        for (int i = frase.length() - 1; i >= 0; i--) {
                            reverse = reverse + frase.charAt(i);
                        }
                        System.out.println(reverse); // Mostramos la frase invertida
                        continue; // Continuamos al siguiente ciclo del menú
    
                    case 6:
                        System.out.println("Has salido del programa."); // Mensaje de salida
                        break; // Salimos del bucle
    
                    default:
                        // Si el usuario no ingresa una opción válida, mostramos un mensaje de error
                        System.out.println("No has introducido una opción válida.");
                        continue; // Continuamos al siguiente ciclo del menú
                }
                
            } while (opcion != 6); // Repetimos el ciclo hasta que el usuario elija salir (opción 6)
            
        } catch (Exception e) {
            // Si ocurre una excepción (por ejemplo, si el usuario ingresa un valor no numérico), mostramos un mensaje de error
            System.out.println("No has introducido un número válido.");
        }

        // Cerramos el objeto Scanner para liberar los recursos
        sc.close();
    }
}
