package com.example;

public class PlatoOrdenar extends Plato{

    private int numOrden;
    
    PlatoOrdenar(

        int idPlato, 
        String nombrePlato, 
        double precio, 
        int numOrden)

        {
        super(idPlato, nombrePlato, precio);

        this.numOrden = numOrden;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    @Override
    public void listarInfo() {
        super.listarInfo();
        System.out.println("Numero de orden: " + numOrden);
    }
       
}
