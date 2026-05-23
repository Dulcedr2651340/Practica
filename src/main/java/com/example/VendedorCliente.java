package com.example;

public class VendedorCliente extends Libreria{

    private String nombreCliente;

    public VendedorCliente(

       int idlibreria,
        String nombreLibreria,
        double precioLibro,
        String nombreCliente

    ){ 
        super(idlibreria, nombreLibreria, precioLibro);
        this.nombreCliente = nombreCliente;

    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public void listarInfo() {
        super.listarInfo();
        System.out.println("Nombre del cliente: " + nombreCliente);
    }

    
}
