package repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import model.Producto;

@Repository
public class ProductoRepository {

    private HashMap<Integer, Producto> productos = new HashMap<>();

    public void guardarProducto(Producto producto){
        productos.put(producto.getId(), producto);
    }

    public Producto buscarPorIdProducto(int id){
        return productos.get(id);
    }

    public void eliminarProducto(int id){
        productos.remove(id);
    }

    public HashMap<Integer, Producto> listarProductos(){
        return productos;
    }
    
}
