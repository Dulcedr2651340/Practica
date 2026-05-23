package com.example;

public class Plato{
    
    private int idPlato;
    private String nombrePlato;
    private double precio;

    public Plato(int idPlato, String nombrePlato, double precio) {
        this.idPlato = idPlato;
        this.nombrePlato = nombrePlato;
        this.precio = precio;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void listarInfo() {
        System.out.println( "Plato: " + idPlato + 
                            ", nombrePlato: " + nombrePlato + 
                            ", precio=" + precio );
    }   

}
