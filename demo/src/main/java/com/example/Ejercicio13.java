package com.example;
import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables que se utilizarán más adelante en el programa
        int numProductos = 0;            // Número de productos en el inventario
        String nombreProducto;           // Nombre del producto
        double precioProducto = 0;       // Precio del producto
        int stockProducto = 0;           // Stock (cantidad disponible) del producto
        int opcion = 0;                  // Opción seleccionada por el usuario
        int nuevoStock = 0;              // Nuevo stock a asignar a un producto
        String buscarProducto;          // Producto que el usuario desea buscar o actualizar

        // Solicitar al usuario el número de productos que se desean agregar al inventario
        System.out.println("Cuantos numeros de productos quieres en tu Stock?: ");
        numProductos = sc.nextInt();

        // Inicializar los arrays para almacenar la información de los productos
        String [] nombre = new String[numProductos];   // Array de nombres de productos
        double [] precios = new double[numProductos];  // Array de precios de los productos
        int [] stock = new int[numProductos];          // Array de stock de productos

        // Bucle para capturar los datos de los productos
        for (int i = 0; i < numProductos; i++) {
            System.out.println("=======================================================");
            // Solicitar al usuario los datos de cada producto
            System.out.println("Introduce el nombre del producto numero " + (i+1) + ":");
            nombreProducto = sc.next();
            nombre[i] = nombreProducto;   // Almacenar el nombre en el array correspondiente

            System.out.println("Introduce el precio del producto numero " + (i+1) + ":");
            precioProducto = sc.nextDouble();
            precios[i] = precioProducto;  // Almacenar el precio en el array correspondiente

            System.out.println("Introduce el stock del producto numero " + (i+1) + ":");
            stockProducto = sc.nextInt();
            stock[i] = stockProducto;     // Almacenar el stock en el array correspondiente
            System.out.println("=======================================================");
        }

        // Bucle principal del sistema, que se repite hasta que el usuario elija salir
        do {
            // Mostrar el menú de opciones disponibles para el usuario
            System.out.println("Introduce que quieres hacer en el sistema: \n1.Mostrar Inventario.\n2.Buscar producto.\n3.Actualizar Stock. \n4.Salir");

            opcion = sc.nextInt();   // Leer la opción seleccionada por el usuario

            switch (opcion) {
                case 1:   // Opción para mostrar el inventario
                    // Bucle para mostrar todos los productos en el inventario
                    for (int i = 0; i < precios.length; i++) {
                        System.out.println("=================================================================================================");
                        System.out.println("Producto: " + nombre[i] + " ,con el precio de " + precios[i] + " con un Stock de " + stock[i] + ".");
                        System.out.println("=================================================================================================");
                    }
                    break;

                case 2:   // Opción para buscar un producto por su nombre
                    System.out.println("Que producto quieres buscar: ");
                    buscarProducto = sc.next();  // Leer el nombre del producto a buscar
                    // Buscar el producto en el inventario
                    for (int i = 0; i < nombre.length; i++) {
                        if (buscarProducto.equalsIgnoreCase(nombre[i])) {  // Compara sin distinguir mayúsculas de minúsculas
                            // Si se encuentra el producto, mostrar su información
                            System.out.println("Producto: " + nombre[i] + " ,con el precio de " + precios[i] + " con un Stock de " + stock[i] + ".");
                        } else {
                            // Si el producto no se encuentra, informar al usuario
                            System.out.println("No existe este producto.");
                        }
                    }
                    break;

                case 3:   // Opción para actualizar el stock de un producto
                    System.out.println("Que producto quieres buscar: ");
                    buscarProducto = sc.next();  // Leer el nombre del producto a buscar
                    // Buscar el producto en el inventario
                    for (int i = 0; i < nombre.length; i++) {
                        if (buscarProducto.equalsIgnoreCase(nombre[i])) {  // Compara sin distinguir mayúsculas de minúsculas
                            // Si se encuentra el producto, pedir al usuario el nuevo stock
                            System.out.println("Cual quieres que sea su stock actualmente?: ");
                            nuevoStock = sc.nextInt();  // Leer el nuevo stock
                            stock[i] = nuevoStock;  // Actualizar el stock en el array correspondiente
                        } else {
                            // Si el producto no se encuentra, informar al usuario
                            System.out.println("No existe este producto.");
                        }
                    }
                    break;

                case 4:   // Opción para salir del sistema
                    System.out.println("Has salido.");
                    break;
        
                default:
                    break;   // Opción no válida, no hace nada
            }
        } while (opcion != 4);   // Continuar ejecutando hasta que el usuario elija salir (opción 4)

        sc.close();   // Cerrar el scanner al final para liberar recursos

    }
}
