package com.example.OtrosEjercicios;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        //Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
        //al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int j2 = 0; j2 <= 9; j2++) {
                    for (int k = 0; k <= 9; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            if (i == 3) {
                                System.out.println("E");
                            }
                            if (j == 3) {
                                System.out.println("E");
                            }
                            if (j2 == 3) {
                                System.out.println("E");
                            }
                            if (k == 3) {
                                System.out.println("E");
                            }
                            if (k2 == 3) {
                                System.out.println("E");
                            }
                            System.out.println(i + "-" + j + "-" + j2 + "-" + k + "-" + k2);
                        }
                    }
                }
            }
            
        }

    }
    
}
