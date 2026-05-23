package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Veterinario {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        
        while(opcion != 8){
            
            System.out.println("========== MENU =========");
            System.out.println("1. Agregar una mascota: ");
            System.out.println("2. Listar las mascotas: ");
            System.out.println("3. Buscar una mascota: ");
            System.out.println("4. Actualizar una mascota: ");
            System.out.println("5. Eliminar una mascota: ");
            System.out.println("6. Obtener el animal mas caro: ");
            System.out.println("7. Obtener el total de los animales: ");
            System.out.println("8. Salir ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID: ");
                    int idAnimal = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del animal: ");
                    String nombreAnimal = sc.nextLine();

                    System.out.println("Ingrese el precio: ");
                    double precioAnimal = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la raza del animal: ");
                    String raza = sc.nextLine();
                    Animal v = new AnimalPerro(idAnimal, nombreAnimal, precioAnimal, raza);

                    agregarAnimal(animales, v);
                    break;

                case 2:
                    System.out.println("Lista de las mascotas: "); 
                    listarAnimales(animales);
                    break;
                    
                case 3:
                    System.out.println("Ingresa el ID de la mascota: ");
                    int idBuscarAnimal = sc.nextInt();
                    sc.nextLine();
                    
                    Animal encontrar = buscarAnimal(animales, idBuscarAnimal);

                    if (encontrar != null) {
                        encontrar.listarInfo();
                    } else{
                        System.out.println("No encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el ID Macota para actualizar: ");    
                    int idActualizarAnimal = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nuevo precio: ");
                    double precioNuevoAnimal = sc.nextDouble();
                    sc.nextLine();

                    actualizarAnimal(animales, idActualizarAnimal, precioNuevoAnimal);
                    break;

                case 5:
                    System.out.println("Ingrese el ID para eliminar: ");
                    int idAnimalEliminar = sc.nextInt();
                    sc.nextLine();
                    
                    eliminarAnimal(animales, idAnimalEliminar);
                    break;
                case 6:
                    Animal masCaro = obtenerAnimalMasCaro(animales);
                    if(masCaro != null){
                        System.out.println("El animal mas caro es: ");
                        masCaro.listarInfo();
                    }
                    break;
                case 7:
                    Double total = totalDeAnimales(animales);
                    System.out.println("El total de los animales es: " + total);
                    break;    
                case 8:
                    System.out.println("Saliendo . . .");
            }
        }

        sc.close();
        
    }


    public static void agregarAnimal(ArrayList<Animal> animales, Animal animal) {
    
                animales.add(animal);
    }

    public static Animal buscarAnimal(ArrayList<Animal> animales, int id) {
        
        for(Animal a: animales){
            if(a.getIdAnimal() == id){
                return a;
            }
        }
        return null; 
    }

    public static void actualizarAnimal(ArrayList<Animal> animales, int id, double nuevoPrecio) {
        Animal animal = buscarAnimal(animales, id);
 
            if(animal != null){
                animal.setPrecio(nuevoPrecio);
                System.out.println("Actualizado");
            } else{
                System.out.println("No actualizado");
            
        }
    }

    public static void eliminarAnimal(ArrayList<Animal> animales, int id) {
        Animal animal = buscarAnimal(animales, id);
        if(animal != null){
            animales.remove(animal);
            System.out.println("Rliminado");
        } 
        else{
            System.out.println("No se encontro");
        }
    }

    public static void listarAnimales(ArrayList<Animal> animales) {

        for(Animal a : animales){
            a.listarInfo();
        }
    }

    public static Animal  obtenerAnimalMasCaro(ArrayList<Animal> animales) {
            Animal animalMasCaro = animales.get(0);

            for(Animal a: animales)
                if (a.getPrecio() > animalMasCaro.getPrecio()) {
                   animalMasCaro = a;                                             
        }

        return animalMasCaro;
    }

    public static Double totalDeAnimales(ArrayList<Animal> animales) {
        double total = 0;

        if(animales.isEmpty()){
            return null;
        }

        for (Animal a : animales) {
                 total += a.getPrecio();
        }

        return total;
    }
}
