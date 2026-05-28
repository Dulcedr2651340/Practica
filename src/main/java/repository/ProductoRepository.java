package repository;

import java.util.HashMap;

import model.Producto;

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

    public HashMap<Integer, Producto> listarProducto(){
        return productos;
    }
    
}
