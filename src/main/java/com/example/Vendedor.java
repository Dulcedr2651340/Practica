package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        ArrayList<Libreria> librerias = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 8){

            System.out.println("/n========= MENU ==========");
            System.out.println("1. Agregar un nuevo libro: ");
            System.out.println("2. Listar libros: ");
            System.out.println("3. Buscar libro: ");
            System.out.println("4. Actualizar precio de libro: ");
            System.out.println("5. Eliminar un libro: ");
            System.out.println("6. Obtener el libro mas caro: ");
            System.out.println("7. Obtener el total de los libros: ");
            System.out.println("8. Obtener el total de libros: ");
            System.out.println("9. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1. Ingrese el ID: ");
                    int idLibro = sc.nextInt();
                    sc.nextLine();

                    System.out.println("2. Ingrese el nombre: ");
                    String nombreLibro = sc.nextLine();

                    System.out.println("3. Ingrese el precio: ");
                    double precioLibro = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("4. Ingrese el nombre del Cliente: ");
                    String nombreCliente = sc.nextLine();

                    Libreria vc = new VendedorCliente(idLibro, nombreLibro, precioLibro, nombreCliente);
                    agregarLibros(librerias, vc);
                    break;

                case 2:
                    listarLibros(librerias);
                    break;
                    
                case 3:
                    System.out.println("Ingresar el ID: ");
                    int idBuscarLibreria = sc.nextInt();
                    sc.nextLine();

                    Libreria encontrado = buscLibreria(librerias, idBuscarLibreria);
                    if (encontrado != null) {
                        encontrado.listarInfo();
                    } else{
                        System.out.println("No encontrado");
                    }
                    break;
                
                case 4: 
                    System.out.println("Ingrese el ID: ");
                    int idLibreriaActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();

                    actualizarLibro(librerias, idLibreriaActualizar, nuevoPrecio);
                    break;

                case 5:
                    System.out.println("Ingrese el ID del libro: ");
                    int idLibroEliminar = sc.nextInt();
                    sc.nextLine();
                    
                    eliminarLibro(librerias, idLibroEliminar);
                    break;

                case 6:
                    Libreria masCaro = obtenerLibroMasCaro(librerias);

                    if (masCaro != null) {
                        System.out.println("El mas caro es: ");
                        masCaro.listarInfo();
                    }
                    break;

                case 7:
                    Double total = totalDeLibros(librerias);
                    System.out.println("El total de libros es: " + total);
                    break;
                case 8:
                    System.out.println("Saliendio de la app . . .");   
            }

        }


       sc.close();

    }

    public static void agregarLibros(ArrayList<Libreria> librerias, Libreria libreria) {
                librerias.add(libreria);
    }

    public static void listarLibros(ArrayList<Libreria> librerias) {
                for(Libreria l: librerias){
                        l.listarInfo();
                }               
    }

    public static Libreria buscLibreria(ArrayList<Libreria> librerias, int id) {

        for(Libreria l: librerias){
            if(l.getIdlibreria() == id){
              return l;

        }
    }
          return null;     
    }


    public static Libreria obtenerLibroMasCaro(ArrayList<Libreria> librerias) {
        Libreria libroMasCaro = librerias.get(0);

        if (librerias.isEmpty()) {
            return null; 
        }

        for(Libreria l: librerias){
        if (l.getPrecioLibro() > libroMasCaro.getPrecioLibro()) {
                libroMasCaro = l;
            }
         }
         return libroMasCaro; 
    }


    public static Double totalDeLibros (ArrayList<Libreria> librerias) {

        double total = 0;
        for(Libreria l: librerias){
             total += l.getPrecioLibro();
        }

        return total;

    }

    public static void actualizarLibro(ArrayList<Libreria> librerias, int id, double nuevoPrecio) {
        Libreria libreria = buscLibreria(librerias, id);

            if(libreria != null ){
                libreria.setPrecioLibro(nuevoPrecio);
                System.out.println("Precio actualizado");
       } else{
            System.out.println("No encontrado");
       }
    }

    public static void eliminarLibro(ArrayList<Libreria> librerias, int id) {
        Libreria libreria = buscLibreria(librerias, id);

     if (libreria != null) {
         librerias.remove(libreria);
         System.out.println("LIBRO ELIMINADO");
     } else{
        System.out.println("PRODUCTO NO ENCONTRADO");
     }
    }
}
