package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {

    public static void main(String[] args) {
        
        ArrayList<Cancion> canciones = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while(opcion != 8){
                System.out.println("/n============ MENU ============");
                System.out.println("1. Agregar Cancion");
                System.out.println("2. Listar Canciones");
                System.out.println("3. Buscar una Cancion");
                System.out.println("4. Actualizar una cancion");
                System.out.println("5. Eliminar Cancion");
                System.out.println("6. Obtener la cancion mas escuchada: ");
                System.out.println("7. Obtener el total de canciones: ");
                System.out.println("8. Saliendo de la App . . .");

                opcion = sc.nextInt();
                sc.nextLine();

                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el ID: ");
                        int idCancion = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese el nombre de la Cancion: ");
                        String nombreCancion = sc.nextLine();

                        System.out.println("Ingrese el precio de la cancion: ");
                        Double precioCancion = sc.nextDouble();

                        agregarCancion(canciones, new Cancion(idCancion, nombreCancion, precioCancion));
                        break;

                    case 2:
                        listarCanciones(canciones);
                        break;  
                    case 3:
                        System.out.println("Ingrese el ID: ");
                        int idBuscar = sc.nextInt();
                        sc.nextLine();

                        Cancion encontrada = buscarCancionId(canciones, idBuscar);

                        if(encontrada != null){
                            encontrada.listarDetalle();
                        } else{
                            System.out.println("Cancion no encontrada");
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el ID: ");
                        int idActualizar = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Ingrese el precio nuevo");
                        double precioNuevo = sc.nextDouble();

                        actualizarDuracionCancion(canciones, idActualizar, precioNuevo);
                        break;
                    
                    case 5:
                        System.out.println("Ingrese el ID: ");
                        int idEliminar = sc.nextInt();
                        sc.nextLine();
                        
                        eliminarCancion(canciones, idEliminar);
                        System.out.println("Cancion eliminada");
                        break;

                    case 6:    
                        System.out.println("La cancion mas escuchada: ");
                        Cancion masEscuchada = ObtenerLaCancionMasEscuchada(canciones);

                        if(masEscuchada != null){
                            masEscuchada.listarDetalle();
                        }

                        break;
                    case 7:
                        Double total = totalDeCanciones(canciones);
                        System.out.println("El total de musica escuchada: " + total);
                        break;
                    case 8:
                        System.out.println("Saliendo de la app . . .");
                        break;

                    default:
                        System.out.println("Opcion invalida");    
                }
        }

        sc.close();

    }

    public static void agregarCancion(ArrayList<Cancion> canciones, Cancion cancion){
        canciones.add(cancion);
    }

    public static void listarCanciones(ArrayList<Cancion> canciones){

          for(Cancion c: canciones){
                c.listarDetalle();
          }
    }


    public static Cancion ObtenerLaCancionMasEscuchada(ArrayList<Cancion> canciones){
        Cancion masEscuchada = canciones.get(0);       

        if (canciones.isEmpty()) {
            return null;
        }

        for(Cancion c: canciones){
            if(c.getHorasEscuchado() > masEscuchada.getHorasEscuchado()){                              
                    masEscuchada = c;
            }
        }   

          return masEscuchada;
    }

    public static double totalDeCanciones(ArrayList<Cancion> canciones) {
        double totalCanciones = 0;

        for(Cancion c: canciones){
            totalCanciones += c.getHorasEscuchado();
        }

        return totalCanciones;
    }

    public static Cancion buscarCancionId(ArrayList<Cancion> canciones, int id) {
        for(Cancion c: canciones){
            if (c.getIdCancion() == id) {
                return c;
            }
        }
        return null;
    }

    public static void actualizarDuracionCancion(ArrayList<Cancion> canciones, int id, double nuevaDuracion){
        Cancion cancion = buscarCancionId(canciones, id);

        if (cancion != null) {
            cancion.setHorasEscuchado(nuevaDuracion);
            System.out.println("Duracion actualizado");
        } else{
            System.out.println("Cancion no encontrada");
        }
    }

    public static void eliminarCancion(ArrayList<Cancion> canciones, int id) {
        Cancion cancion = buscarCancionId(canciones, id);

        if (cancion != null) {
            canciones.remove(cancion);
        } else{
            System.out.println("Canciones no encontradas");
        }
    }
}
