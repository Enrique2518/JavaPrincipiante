package com.example;

import java.util.Scanner;

public class Ejercicio10 {

    /****************************************/
    /* Nom: Enrique Muñoz-Torrero Rodriguez	*/
    /* DNI/NIE: 43235257H 			        */
    /* Data: 10/10/2024 				    */
    /* Exercici: PROU2EX03				    */
    /****************************************/

    public static void main(String[] args) {

        //Iniciamos nuestras variables
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double valor = -1;
        double valorTotal = 0;

        //Damos la bienvenida al usuario.
        System.out.println("Bienvenido al conversor de monedas.");
        System.out.println("Que opción necesitas para tu viaje.");

        //Entramos en el bucle que abajo esta la condicion que mas tarde explicaremos, para salir del bucle.
        do {

            //Usamos el try para las excepciones que vayamos a introducir a la consola.
            try {

                //Pedimos al usuario que opcion desea en nuestro programa.
                System.out.println("1.Dólares a Euros \n2.Dólares a Pesos Mexicanos \n3.Euros a Dólares \n4.Euros a Pesos Mexicanos \n5.Pesos Mexicanos a Dólares \n6.Pesos Mexicanos a Euros \n7.Real Brasileño a Euros \n8.Euros a Real Brasileño \n9.Salir de la aplicación.");
                //Introducimos que opcion necesitamos.
                opcion = sc.nextInt();
                
                //con el switch depende del valor de opcion iremos a la casilla de su valor.
                switch (opcion) {
                    case 1:
                        System.out.println("========================================");
                        System.out.println("Dólares a Euros");
                        System.out.println("========================================");
                        break;
        
                    case 2:
                        System.out.println("========================================");
                        System.out.println("Dólares a Pesos Mexicanos");
                        System.out.println("========================================");
                        break;
        
                    case 3:
                    System.out.println("========================================");
                        System.out.println("Euros a Dólares");
                        System.out.println("========================================");
                        break;
        
                    case 4:
                    System.out.println("========================================");
                        System.out.println("Euros a Pesos Mexicanos");
                        System.out.println("========================================");
                        break;
        
                    case 5:
                    System.out.println("========================================");
                        System.out.println("Pesos Mexicanos a Dólares");
                        System.out.println("========================================");
                        break;
        
                    case 6:
                    System.out.println("========================================");
                        System.out.println("Pesos Mexicanos a Euros");
                        System.out.println("========================================");
                        break;

                    case 7:
                    System.out.println("========================================");
                        System.out.println("Real Brasileño a Euros");
                        System.out.println("========================================");
                        break;

                    case 8:
                    System.out.println("========================================");
                        System.out.println("Euros a Real Brasileño");
                        System.out.println("========================================");
                        break;
        
                    case 9:
                        System.out.println("========================================");
                        System.out.println("Has salido del sistema.");
                        break;
                
                    //Si no introduces un valor entre 1 - 9 ej:10 te imprimira en pantalla este mensaje.
                    default:
                        System.out.println("No has introducido una opcion correcta.");
                        break;
                }
                
            //Esta es la excepcion, si nosotros no introducimos un valor numerico ej:a nos imprimira este mensaje, y volvera a repetir la pregunta gracias al continue.
            //Hasta que no introduzcamos un numero se repetira infinitamente.
            } catch (Exception e) {
                System.out.println("No has introducido un valor correcto. Vuelve a intentarlo.");
                sc.nextLine();
                continue;
            }

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                if (opcion == 1) {
                    ////Entramos en el bucle que abajo esta la condicion que mas tarde explicaremos, para salir del bucle.
                    do {
                        //Usamos el try para las excepciones que vayamos a introducir a la consola.
                        try {
                            System.out.println("Introduce un valor positivo en Dólares, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        //Esta es la excepcion, si nosotros no introducimos un valor numerico ej:a nos imprimira este mensaje, y volvera a repetir la pregunta gracias al continue. Hasta que no introduzcamos un numero se repetira infinitamente.
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    //Si valor es menor que te repetira infinitamente el bucle de introducir un valor mayor que 0
                    } while (valor < 0);
                    //Cogemos la variable valorTotal iniciada al principio del programa. Y dependiendo el valor del cambio de moneda lo multilicamos por el valor    introducido en nuestra variable valor.
                    valorTotal = valor * 0.85;
                    System.out.println("========================================");
                    System.out.println(valor + " dólares son " + valorTotal + " euros.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 2) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Dólares, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 20;
                    System.out.println("========================================");
                    System.out.println(valor + " dólares son " + valorTotal + " pesos mexicanos.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 3) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Euros, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 1.18;
                    System.out.println("========================================");
                    System.out.println(valor + " euros son " + valorTotal + " dólares.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 4) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Euros, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 23.50;
                    System.out.println("========================================");
                    System.out.println(valor + " euros son " + valorTotal + " pesos mexicanos.");
                    System.out.println("========================================");
                    
                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 5) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Pesos Mexicanos, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 0.05;
                    System.out.println("========================================");
                    System.out.println(valor + " pesos mexicanos son " + valorTotal + " dólares.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 6) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Pesos Mexicanos, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 0.042;
                    System.out.println("========================================");
                    System.out.println(valor + " pesos mexicanos son " + valorTotal + " euros.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 7) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Reales Brasileños, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 0.16;
                    System.out.println("========================================");
                    System.out.println(valor + " real brasileño son " + valorTotal + " euros.");
                    System.out.println("========================================");

                //Aqui empezamos con los cambios de monedas, depende de la opcion, los valoresTotales seran diferentes.
                }else if (opcion == 8) {
                    do {
                        try {
                            System.out.println("Introduce un valor positivo en Euros, no puedo hacer el cambio de moneda si el valor es negativo.");
                            valor = sc.nextDouble();
                        } catch (Exception e) {
                            System.out.println("No es un numero . Vuelve a intentarlo.");
                            sc.nextLine();
                            continue;
                        }
                        System.out.println("Es un numero negativo vuelve a intentarlo.");
                    } while (valor < 0);
                    valorTotal = valor * 6.14;
                    System.out.println("========================================");
                    System.out.println(valor + " euros son " + valorTotal + " real brasileño.");
                    System.out.println("========================================");

                //Si introducimos el valor 9 en el switch nos imprimira este mensaje por pantalla
                }else if (opcion == 9) {
                    System.out.println("Hasta la proxima.");
                    System.out.println("========================================");

                //Si no introducimos un valor correcto nos dira que lo volvamos a intantar.
                }else{
                    System.out.println("Vuelve a intentarlo");
                } 

        //Mientras que la opcion en nuestro switch sea diferente a 9 nunca saldremos de nuestra aplicacion.
        } while (opcion != 9);

        //Cerramos nuestro scanner para no introducir mas datos.
        sc.close();

    }
    
}
