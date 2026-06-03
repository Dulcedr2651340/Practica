package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Producto;
import service.ProductoService;

@RestController
public class ProductoController {

    ProductoService productoService = new ProductoService();
    
     @GetMapping("/hola")
    public String inicio() {
        return "Mi API esta funcionando";
    }   

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
