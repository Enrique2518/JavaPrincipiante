package com.example.OtrosEjercicios;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        //Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
        //al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.

        //Usamos 5 bucles anidados, cada uno para iterar sobre los valores del 0 al 9 en cada posición del contador.
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int j2 = 0; j2 <= 9; j2++) {
                    for (int k = 0; k <= 9; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            
                            //Comprobamos si alguna de las cifras es 3, en ese caso mostramos "E" en lugar del número.
                            //Si el primer número es 3, imprimimos "E" en su lugar.
                            if (i == 3) {
                                System.out.print("E");
                            } else {
                                System.out.print(i); //Si no es 3, imprimimos el número.
                            }

                            System.out.print("-"); //Separador entre los dígitos.

                            //Si el segundo número es 3, mostramos "E".
                            if (j == 3) {
                                System.out.print("E");
                            } else {
                                System.out.print(j);
                            }

                            System.out.print("-"); //Separador entre los dígitos.

                            //Si el tercer número es 3, mostramos "E".
                            if (j2 == 3) {
                                System.out.print("E");
                            } else {
                                System.out.print(j2);
                            }

                            System.out.print("-"); //Separador entre los dígitos.

                            //Si el cuarto número es 3, mostramos "E".
                            if (k == 3) {
                                System.out.print("E");
                            } else {
                                System.out.print(k);
                            }

                            System.out.print("-"); //Separador entre los dígitos.

                            //Si el quinto número es 3, mostramos "E".
                            if (k2 == 3) {
                                System.out.println("E"); //Si es 3, imprimimos "E" y luego un salto de línea.
                            } else {
                                System.out.println(k2); //Si no es 3, mostramos el número y un salto de línea.
                            }
                        }
                    }
                }
            }
        }

    }
    
}
