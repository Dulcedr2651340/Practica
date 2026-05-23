package com.example;

public class AnimalPerro extends Animal{

    private String raza;

    public AnimalPerro(

       int idAnimal,
       String nombreAnimal,
       double precio,
       String raza
    ) {
        super(idAnimal, nombreAnimal, precio);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void listarInfo() {
        super.listarInfo();
        System.out.println("La raza del perro es: " + raza);
    }

    
    
}
