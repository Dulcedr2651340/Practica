package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        
        ArrayList<Plato> platos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while(opcion != 6){

            System.out.println("/n======= MENU =======");
            System.out.println("1. Agregar un Plato: ");
            System.out.println("2. Listar los platos: ");
            System.out.println("3. Buscar un plato: ");
            System.out.println("4. Actulizar un plato: ");
            System.out.println("5. Eliminar un plato: ");
            System.out.println("6. Obtener el plato mas caro: ");
            System.out.println("7. Obtener el total de los precios: ");
            System.out.println("8. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                
                case 1: 

                    int idplato = 0;
                    String nombrePlato = "";
                    double precioPlato = 0;
                    int numOrden = 0;

                    Boolean valido = false;

                    while(!valido){
                        
                        try{

                            System.out.println("Ingrese el ID: ");
                            idplato = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el nombre: ");
                            nombrePlato = sc.nextLine(); 

                            System.out.println("Ingrese el precio: ");
                            precioPlato = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Ingrese el numero de orden: ");
                            numOrden = sc.nextInt();
                            sc.nextLine();

                            valido = true;

                    } catch(Exception e){
                          System.out.println("ERROR: Ingrese de nuevo");  
                           sc.nextLine();
                    }
                }

                    PlatoOrdenar p = 
                    new PlatoOrdenar(
                        idplato, 
                        nombrePlato, 
                        precioPlato, 
                        numOrden);

                    agregarPlato(platos, p);                    
                    break;

                case 2:
                    System.out.println("Lista de platos");
                    listarPlatos(platos);
                    break;
                    
                case 3:
                    System.out.println("Ingresa el ID: ");
                    int buscarPlato = sc.nextInt();
   
                    Plato encontrado = buscarPlato(platos, buscarPlato);
                    if (encontrado != null) {

                            encontrado.listarInfo();
                    } else{
                        System.out.println("Plato no encontrado ");
                    }
                    break;

                case 4:
                    System.out.println("ID Actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Actualizar Precio: ");
                    Double actualizarPrecioPlato = sc.nextDouble();
                    
                    actualizarPlato(platos, idActualizar, actualizarPrecioPlato);
                    break;

                case 5:
                    System.out.println("Eliminar un plato: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    eliminarPlato(platos, idEliminar);    
                    break;
                case 6:           
                    Plato masCaro = obtenerElPlatoMasCaro(platos);
                    if(masCaro != null){
                        System.out.println("Plato mas caro: ");     
                        masCaro.listarInfo();
                    } 
                    break;
                case 7:
                    Double total = totalDePlatos(platos);
                    System.out.println("El total de platos es: " + total);
                    break;
                    
                case 8:
                    System.out.println("Saliendo . . . .");
            }
        }
            sc.close();
        

    }

    public static void listarPlatos(ArrayList<Plato> platos) {

          for(Plato p:platos){
            p.listarInfo();
        }   
    }

    public static Plato obtenerElPlatoMasCaro(ArrayList<Plato> platos) {
              Plato platoCaro = platos.get(0);

                if(platos.isEmpty()){
                    return null;
                }

                for(Plato p: platos){           
                if(p.getPrecio() > platoCaro.getPrecio()){
                    platoCaro = p;               
                }

        }
         return platoCaro;

    }

    public static double  totalDePlatos(ArrayList<Plato> platos) {
        double total = 0;

                for(Plato p : platos){
            
                    total += p.getPrecio();              
                }

             return total; 
    }

    public static void agregarPlato(ArrayList<Plato> platos, Plato plato) {
        platos.add(plato);
         System.out.println("Producto agregado");   
    }

    public static Plato buscarPlato(ArrayList<Plato> platos, int id) {
              for(Plato p: platos){
                if(p.getIdPlato() == id){
                    return  p;
                }
       }
       return null;
    }

    public static void actualizarPlato(ArrayList<Plato> platos, int id, double nuevoPrecio) {
        Plato plato = buscarPlato(platos, id);

        if (plato != null) {
            plato.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado");

        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public static void eliminarPlato(ArrayList<Plato> platos, int id) {
        Plato plato = buscarPlato(platos, id);

        if(plato != null){
            platos.remove(plato);
            System.out.println("Plato eliminado");
        } else{
            System.out.println("Plato no encontrado");
        }
    }

}
