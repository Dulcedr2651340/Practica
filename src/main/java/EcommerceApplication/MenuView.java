package view;
import java.util.Scanner;

import controller.ProductoController;
import model.ProductoElectronico;

public class MenuView {

    Scanner sc = new Scanner(System.in);

    ProductoController productoController =
            new ProductoController();

    public void iniciar(){

        int opcion = 0;

        while(opcion != 5){

            System.out.println("==============MENU================");
            System.out.println("1. Agregar un nuevo producto: ");
            System.out.println("2. Listar productos: ");
            System.out.println("3. Eliminar un producto: ");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Garantia: ");
                    int garantia = sc.nextInt();
                    sc.nextLine();

                    ProductoElectronico producto = new ProductoElectronico(id, nombre, precio, marca, garantia);
                    productoController.guardarProducto(producto);
                    break;

                case 2:
                    productoController.listarProductos();
                    break;

                case 3:

                    System.out.println("ID eliminar:");
                    int idEliminar = sc.nextInt();

                    productoController.eliminarProducto(idEliminar);

                    System.out.println("Producto eliminado");

                break;    

                case 4:
                    System.out.println("Saliendo . . . .");    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }        

}