package service;

import model.Producto;
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

    
}
