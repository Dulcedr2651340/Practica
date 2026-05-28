package model;

public class ProductoElectronico extends Producto{
    
    private String marca;
    private int garantia;


    public ProductoElectronico(
        
     
            int id,
            String nombre,
            double precio,
            String marca,
            int garantia

    ) {
        super(id, nombre, precio);
        this.marca = marca;
        this.garantia = garantia;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }



    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(
            " Marca: " + marca +
            " Garantia: " + garantia
        );
    }

    
}
