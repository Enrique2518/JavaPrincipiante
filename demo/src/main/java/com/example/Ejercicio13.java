package com.example;
import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numProductos = 0;
        String nombreProducto;
        double precioProducto = 0;
        int stockProducto = 0;
        int opcion = 0;
        int nuevoStock = 0;

        String buscarProducto;


        System.out.println("Cuantos numeros de productos quieres en tu Stock?: ");
        numProductos = sc.nextInt();

        String [] nombre = new String[numProductos];
        double [] precios = new double[numProductos];
        int [] stock = new int[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.println("=======================================================");
            System.out.println("Introduce el nombre del producto numero " + (i+1) + ":");
            nombreProducto = sc.next();
            nombre[i] = nombreProducto;
            System.out.println("Introduce el precio del producto numero " + (i+1) + ":");
            precioProducto = sc.nextDouble();
            precios[i] = precioProducto;
            System.out.println("Introduce el stock del producto numero " + (i+1) + ":");
            stockProducto = sc.nextInt();
            stock[i] = stockProducto;
            System.out.println("=======================================================");
        }

        do {

            System.out.println("Introduce que quieres hacer en el sistema: \n1.Mostrar Inventario.\n2.Buscar producto.\n3.Actualizar Stock. \n4.Salir");

            opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 0; i < precios.length; i++) {
                    System.out.println("=================================================================================================");
                    System.out.println("Producto: " + nombre[i] + " ,con el precio de " + precios[i] + " con un Stock de " + stock[i] + ".");
                    System.out.println("=================================================================================================");
                }
                break;

            case 2:
                System.out.println("Que producto quieres buscar: ");
                buscarProducto = sc.next();
                for (int i = 0; i < nombre.length; i++) {
                    if (buscarProducto.equalsIgnoreCase(nombre[i])) {
                        System.out.println("Producto: " + nombre[i] + " ,con el precio de " + precios[i] + " con un Stock de " + stock[i] + ".");
                    }else{
                        System.out.println("No existe este producto.");
                    }
                }
                break;

            case 3:
                System.out.println("Que producto quieres buscar: ");
                buscarProducto = sc.next();
                for (int i = 0; i < nombre.length; i++) {
                    if (buscarProducto.equalsIgnoreCase(nombre[i])) {
                        System.out.println("Cual quieres que sea su stock actaulmente?: ");
                        nuevoStock = sc.nextInt();
                        stock[i] = nuevoStock;
                    }else{
                        System.out.println("No existe este producto.");
                    }
                }
                break;

                case 4:
                System.out.println("Has salido.");
                    break;
        
            default:
                break;
        }
            
        } while (opcion != 4);


        sc.close();

    }
    
}
