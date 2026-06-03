package model;

public abstract class Producto {
    
    private int id;
    private String nombre;
    private double precio;

    public producto(){
        
    }

    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   

    public void mostrarInfo() {
        System.out.println("ID: " + id +
                            "NOMBRE: " + nombre +
                            "Precio: " + precio    
        );
    }
   
}
