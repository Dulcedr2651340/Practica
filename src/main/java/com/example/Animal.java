package com.example;

public class Animal {

   private  int idAnimal;
   private  String nombreAnimal;
   private  double precio;

    public Animal(int idAnimal, String nombreAnimal, double precio) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.precio = precio;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void listarInfo() {
        System.out.println("idAnimal=" + idAnimal +
                             ", nombreAnimal=" + nombreAnimal +
                             ", precio=" + precio );
    }       
}
