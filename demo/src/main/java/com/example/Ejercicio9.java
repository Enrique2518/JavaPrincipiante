package com.example;

import java.util.Scanner;

public class Ejercicio9 {

    /****************************************/
    /* Nom: Enrique Muñoz-Torrero Rodriguez	*/
    /* DNI/NIE: 43235257H 			        */
    /* Data: 10/10/2024 				    */
    /* Exercici: PROU2EX02				    */
    /****************************************/

    public static void main(String[] args) {

        //Declaramos nuestras variables.
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int opcion = 0;
        int repetir = 0;

        System.out.println("Bienvenido a la minicalculadora.");

        //Nos introducimos en el primer bucle, que la calculadora solo podremos utilizarla hasta 5 veces.
        for (int i = 0; i < 5; i++) {

            try {

                //Introducimos los numeros que queremos calcular.
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextInt();
            
                try {
                    //Introducimos que operacion quiere que haga nuestros dos números.
                    System.out.println("Introduce una opción:\n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Salir");
                    opcion = sc2.nextInt();
            
                    switch (opcion) {
                        case 1:
                            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                            break;
                
                        case 2:
                            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                            break;
                
                        case 3:
                            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                            break;
                
                        case 4:
                            try {
                                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                            } catch (Exception e) {
                                System.out.println("No se puede dividir entre 0, la próxima vez, elige otro número.");
                            }
                            break;
                
                        case 5:
                            System.out.println("Has salido del programa.");
                            break;
                            
                        default:
                            System.out.println("No has introducido un número válido entre 1 - 5.");
                            break;

                    }

                    //Si no introducimos un numero entre 1 y 6 te saltará esta excepción.
                } catch (Exception e) {
                    System.out.println("No has introducido un número. Vuelve a intentarlo.");
                sc2.nextLine(); // Limpia el buffer(es decir que no se hara en bucle que el numero1 sea el digito incorrecto que has indicado antes, sino que se reseteara y volvera como valor null y habra que darle valor de nuevo)
                }
                //Si no introducimos un numero mayores a 0 te saltará esta excepción.
            } catch (Exception e) {
                System.out.println("No has introducido un número. Vuelve a intentarlo.");
                sc.nextLine(); // Limpia el buffer(es decir que no se hara en bucle que el numero1 sea el digito incorrecto que has indicado antes, sino que se reseteara y volvera como valor null y habra que darle valor de nuevo)
            }


            //Si en nuestro switch utilizamos nuestra opcion 5 el valor de i = 6, entonces es mayor que 5 y saldriamos del bucle.
            if (opcion == 5) {
                i = 6;
            //Si es una de las otras opciones que no sea la opción 5 en nuestro switch nos preguntara si queremos repetir el programa.
            }else if (i < 4) {

                System.out.println("Desea repetir el programa? ");
                System.out.println("Introduce el numero 1 para salir.\nIntroduce cualquier otro numero para repetir.");
                repetir = sc2.nextInt();

                //Si introducimos el numero uno en nuestra terminal se acaba el programa.
                if (repetir == 1) {
                    System.out.println("Se acabó el programa.");
                    break;
                //Si introducimos otro númeroo que no sea el uno en nuestra terminal se sigue con el programa.
                }else if(repetir != 1){
                    System.out.println("Bienvenido de nuevo.");
                    continue;
                }
                
            //Si ya hemos repetido 5 veces el programa se nos cerrará porque no podiamos utilizarla mas de 5 veces.
            }else {
                System.out.println("No puedes volver a repetir el proceso");   
            }

        }

        //Nos despedimos del usuario.
        System.out.println("Hasta la próxima.");

        //Cerramos nuestros scanner para introducir datos en nuestra termianl.
        sc.close();
        sc2.close();

    }
    
}
