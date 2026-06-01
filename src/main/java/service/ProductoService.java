package service;

import java.util.HashSet;

import model.Producto;
import model.ProductoElectronico;
import repository.ProductoRepository;

public class ProductoService {

    private ProductoRepository repository = new ProductoRepository();

    public void guardarProducto(Producto producto){
        repository.guardarProducto(producto);
    }

   public void listarProductos(){

    for(Producto p : repository.listarProductos().values()){
    p.mostrarInfo();

        }
    }

      public void eliminarProducto(int id){
        repository.eliminarProducto(id);
    }

    public void mostrarMarcasUnicas(){

    HashSet<String> marcas = new HashSet<>();

    for(Producto p : repository.listarProductos().values()){

        ProductoElectronico pe = (ProductoElectronico) p;

        marcas.add(pe.getMarca());
    }

    System.out.println(marcas);
}


    
    
}
