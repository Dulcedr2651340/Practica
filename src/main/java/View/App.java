package com.example.View;

import java.util.HashMap;
import java.util.Scanner;

import com.Validation.ValidarEntero;
import com.Validation.ValidarPrecio;

import model.Producto;
import model.ProductoElectronico;

/**
 * Dentro del Main clase, complete los siguientes pasos:
Crea un String variable nombrada city y configúrelo en "London"
Crea un int variable nombrada population y configúrelo en 9000000
Interior main(), crea un objeto de Main nombre myObj
Imprimir city y population usando myObj
 *
 */
public class App 
{
    public static void main(String[] args) {
 
        HashMap<Integer, Producto> productos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, ProductoElectronico> productoElectronicos = new HashMap<>();

        ValidarPrecio validarPrecio = new ValidarPrecio();
        ValidarTexto validarTexto = new ValidarTexto();
        ValidarEntero validarEntero = new ValidarEntero();
        ValidarRepetidos validarRepetidos = new ValidarRepetidos();

        int opcion = 0;

        while(opcion != 8){
            System.out.println("\n======= MENÚ PRODUCTOS =========");
            System.out.println("1. Agregar productos: ");
            System.out.println("2. Listar productos: ");
            System.out.println("3. Buscar producto: ");
            System.out.println("4. Actualizar precio: ");
            System.out.println("5. Eliminar producto: ");
            System.out.println("6. Obtener el producto mas caro: ");
            System.out.println("7. Obtener el total de productos: ");
            System.out.println("8. Salir");
            System.out.println("Elige una opcion");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:

                    int id = 0;
                    String nombre = "";
                    double precio = 0;
                    String marca = "";
                    int garantia = 0;

                    boolean valido = false;

                    while(!valido){
                        try{
                            System.out.println("ID: ");
                            id = sc.nextInt();
                            sc.nextLine();

                            if (!validarEntero.validar(id)) {
                                System.out.println("El ID es invalido");
                                continue;
                            }

                                if(productos.containsKey(id)){
                                System.out.println("Nombre invalido");
                                continue;
                            }

                            System.out.println("Nombre");
                            nombre = sc.nextLine();

                            if (validarRepetidos.nombreExiste(productos, nombre)) {
                                System.out.println("Nombre Repetidos");
                                continue;
                            }

                            System.out.println("Precio: ");
                            precio = sc.nextDouble();
                            sc.nextLine(); 

                            if(!validarPrecio.validar(precio)){
                                System.out.println("Precio Invalido");
                                continue;    
                            }
                                
                            System.out.println("Marca: ");
                            marca = sc.nextLine();

                            if(!validarTexto.validar(marca)){
                                System.out.println("Marca invalido");
                                continue;
                            }
                    
                            System.out.println("Garantia: ");
                            garantia = sc.nextInt();
                            sc.nextLine();

                            if (!validarEntero.validar(garantia)) {
                                System.out.println("Garantia invalida");
                                continue;
                            }
                            
                            valido = true;
                           
                        } catch(Exception e){
                            System.out.println("ERROR EN LOS DATOS");
                            sc.nextLine();
                        }  
                    }

                    ProductoElectronico p = 
                        new ProductoElectronico(
                        id,
                        nombre, 
                        precio,
                         marca, 
                         garantia
                        
                        );

                    agregarProducto(productos, p);
                    break;

                case 2:
                    listarProductos(productos);
                    break;

                case 3:
                    System.out.println("ID a buscar del producto: ");
                    int idBuscar = sc.nextInt();

                    Producto encontrado = buscarProductoPorId(productos, idBuscar);

                    if(encontrado != null){
                        encontrado.mostrarInfo();
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("ID actualizar: "); 
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();

                    actualizarPrecio(productos, idActualizar, nuevoPrecio);
                    break;

                case 5:
                    System.out.println("ID eliminar: ");
                    int idEliminar = sc.nextInt();

                    eliminarProducto(productos, idEliminar);
                    break;

                case 6:
                    System.out.println("El producto mas caro es: ");
                    Producto caro = obtenerProductoMasCaro(productos);

                    if(caro != null){
                        System.out.println("El producto mas caro: ");
                        caro.mostrarInfo();
                    }
                    break;
                case 7:
                    Double total = ObtenerTotalDeProductos(productos);

                    if (total != null) {
                        System.out.println("El total de productos: " + total);
                     
                    }
                    break;

                case 8:    
                    System.out.println("Saliendo . . . .");
                    System.out.println("Opcion valida");    
            }
        }

        sc.close();
    }

       //METODO PARA LISTAR PRODUCTOS  
       public static void listarProductos(HashMap<Integer, Producto> productos){
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos");
                        return;
                    }

                    for(Producto p: productos.values()){
                        p.mostrarInfo();
                    }
                }
    

        public static void agregarProducto(HashMap<Integer, Producto> productos, Producto producto) {
                
                productos.put(producto.getId(), producto);
                System.out.println("Producto Agregado");
    }

        public static Producto obtenerProductoMasCaro(HashMap<Integer, Producto> productos){

            if(productos.isEmpty()){
                return null;
            }
           Producto productoCaro = productos.get(0);

            for(Producto p: productos.values()){
            if(p.getPrecio() > productoCaro.getPrecio()){
                    productoCaro = p;
            }
        }
            return productoCaro;
    }

        public static double  ObtenerTotalDeProductos(HashMap<Integer, Producto> productos) {
                    double total = 0;

                    for(Producto p: productos.values()){
                    total += p.getPrecio();
                         
                }
                return total; 
        }

        public static Producto buscarProductoPorId(HashMap<Integer, Producto> productos, int id) {
            return productos.get(id);
        }


        public static void actualizarPrecio(HashMap<Integer, Producto> productos, int id, double nuevoPrecio){
                    Producto producto = productos.get(id);

                    if(producto != null){
                            producto.setPrecio(nuevoPrecio);
                            System.out.println("Precio actualizado");
                    } else {
                        System.out.println("Producto no encontrado");
                    }
        }


        public static void eliminarProducto(HashMap<Integer, Producto> productos, int id) {
            Producto producto = buscarProductoPorId(productos, id);

            if (productos.containsKey(id)) {
                productos.remove(id);
                System.out.println("Producto eliminado");
            } else{
                System.out.println("Producto no encontrado");
            }
        }
    
        
}
