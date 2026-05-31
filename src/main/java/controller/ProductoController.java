package controller;

import model.Producto;
import service.ProductoService;

public class ProductoController {

    ProductoService productoService = new ProductoService();
    

    public void guardarProducto(Producto producto){
        productoService.guardarProducto(producto);
    }

    public void listarProductos(){
        productoService.listarProductos();
    }

     public void eliminarProducto(int id){
        productoService.eliminarProducto(id);
    }

}
