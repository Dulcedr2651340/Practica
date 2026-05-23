package com.example;

import java.util.ArrayList;
import java.util.Scanner;

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
 
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

                            System.out.println("Nombre");
                            nombre = sc.nextLine();

                            System.out.println("Precio: ");
                            precio = sc.nextDouble();
                            sc.nextLine(); 
                                
                            System.out.println("Marca: ");
                            marca = sc.nextLine();
                    
                            System.out.println("Garantia: ");
                            garantia = sc.nextInt();
                            sc.nextLine();
                            
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
                    
                    System.out.println("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();

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
       public static void listarProductos(ArrayList<Producto> productos){
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos");
                        return;
                    }

                    for(Producto p: productos){
                        p.mostrarInfo();
                    }
                }
    

        public static void agregarProducto(ArrayList<Producto> productos, Producto producto) {
                productos.add(producto);
                System.out.println("Producto Agregado");
    }

        public static Producto obtenerProductoMasCaro(ArrayList<Producto> productos){

            if(productos.isEmpty()){
                return null;
            }
           Producto productoCaro = productos.get(0);

            for(Producto p: productos){
            if(p.getPrecio() > productoCaro.getPrecio()){
                    productoCaro = p;
            }
        }
            return productoCaro;
    }

        public static double  ObtenerTotalDeProductos(ArrayList<Producto> productos) {
                    double total = 0;

                    for(Producto p: productos){
                    total += p.getPrecio();
                         
                }
                return total; 
        }

        public static Producto buscarProductoPorId(ArrayList<Producto> productos, int id) {
            for(Producto p: productos){
                if (p.getId() == id) {
                    return p;
                }
            }

            return null;
        }


        public static void actualizarPrecio(ArrayList<Producto> productos, int id, double nuevoPrecio){
                    Producto producto = buscarProductoPorId(productos, id);

                    if(producto != null){
                            producto.setPrecio(nuevoPrecio);
                            System.out.println("Precio actualizado");
                    } else {
                        System.out.println("Producto no encontrado");
                    }
        }


        public static void eliminarProducto(ArrayList<Producto> productos, int id) {
            Producto producto = buscarProductoPorId(productos, id);

            if (producto != null) {
                productos.remove(producto);
                System.out.println("Producto eliminado");
            } else{
                System.out.println("Producto no encontrado");
            }
        }
    
        
}
