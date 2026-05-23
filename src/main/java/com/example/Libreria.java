package com.example;

public class Libreria {
    
    private int idlibreria;
    private String nombreLibreria;
    private double precioLibro;

    public Libreria(int idlibreria, String nombreLibreria, double precioLibro) {
        this.idlibreria = idlibreria;
        this.nombreLibreria = nombreLibreria;
        this.precioLibro = precioLibro;
    }

    public int getIdlibreria() {
        return idlibreria;
    }

    public void setIdlibreria(int idlibreria) {
        this.idlibreria = idlibreria;
    }

    public String getNombreLibreria() {
        return nombreLibreria;
    }

    public void setNombreLibreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
    }

    public double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        this.precioLibro = precioLibro;
    }

    
    public void listarInfo() {
        System.out.println( "Libreria: " + idlibreria +
                             ", nombreLibreria=" + nombreLibreria + 
                             ", precioLibro=" + precioLibro
        );
    }

       
}
