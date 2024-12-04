package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    private static final int ANYOACTUAL = 2024;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anyoIntroducido;

        int edad = 0;

        try {
            
            System.out.println("Introduce tu año de naciemiento: ");
            anyoIntroducido = sc.nextInt();

            if (anyoIntroducido > 2024) {
                System.out.println("No puede ser no has nacido, aun ni existes.");
            }else{

                edad = ANYOACTUAL - anyoIntroducido;

                System.out.println("Tienes " + edad + " años.");

            if (edad < 18) {
                System.out.println("Eres menor de edad.");
            }else if(edad == 18){
                System.out.println("Eres mayor de edad.");
            }else if(edad > 18 || edad <= 30){
                System.out.println("Eres mayor de edad, tienes: " + edad + ", ya no eres tan joven.");
            }else if(edad > 30 ||edad <= 50){
                System.out.println("Eres mayor de edad, tienes: " + edad + ",ya estas a punto de jubilarte.");
            }else if(edad > 50 ||edad <= 70){
                System.out.println("Eres mayor de edad, tienes: " + edad + " ,ya estas jubilado.");
            }else{
                System.out.println("Eres mayor de edad, tienes: " + edad + " ,ya estas disfrutando de la vida.");
            } 

            }
    
        } catch (InputMismatchException e) {
            System.out.println("No has introducido una edad.");
        }

        sc.close();

    }
    
}
