package Protecto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorCatalogo gestorCatalogo = new GestorCatalogo();
        List<Producto> productos = gestorCatalogo.cargarCatalogo();

        if (productos == null) {
            productos = new ArrayList<>();
        }

        while (true) {
            System.out.println("=== Menú de Gestión de Productos ===");
            System.out.println("1. Ver catálogo de productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Guardar catálogo");
            System.out.println("4. Crear pedido");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("  ");
            switch (opcion) {
                case 1:
                    // Mostrar productos
                    System.out.println("Catálogo de Productos:");
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos en el catálogo.");
                    } else {
                        for (Producto producto : productos) {
                            System.out.println(producto);
                        }
                    }
                    System.out.println("  ");
                    break;

                case 2:
                    // Agregar producto
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa una descripción del producto: ");
                    String descripcion = scanner.nextLine();

                    productos.add(new Producto(nombre, precio, descripcion));
                    System.out.println("Producto agregado exitosamente.");
                    System.out.println("  ");
                    break;

                case 3:
                    // Guardar catálogo
                    gestorCatalogo.guardarCatalogo(productos);
                    System.out.println("El catálogo se ha guardado en catalogo.json.");
                    System.out.println("  ");
                    break;

                case 4:
                    // Crear pedido
                    System.out.print("Ingresa el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nombreCliente); 

                    List<Producto> productosPedido = new ArrayList<>();
                    Pedido nuevoPedido = new Pedido(cliente, productosPedido);
                    System.out.println("Creando un nuevo pedido.");
                    
                    while (true) {
                        System.out.println("Selecciona un producto para agregar al pedido (0 para terminar):");
                        for (int i = 0; i < productos.size(); i++) {
                            System.out.println((i + 1) + ". " + productos.get(i));
                        }
                        int productoSeleccionado = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        if (productoSeleccionado == 0) {
                            break; // Terminar la selección de productos
                        } else if (productoSeleccionado > 0 && productoSeleccionado <= productos.size()) {
                            productosPedido.add(productos.get(productoSeleccionado - 1));
                            System.out.println("Producto agregado al pedido.");
                        } else {
                            System.out.println("Opción no válida. Por favor, selecciona de nuevo.");
                        }
                    }
                    // Mostrar total del pedido
                    System.out.println("Total del pedido: " + nuevoPedido.calcularTotal());
                    System.out.println(nuevoPedido); // Muestra detalles del pedido
                    System.out.println("  ");
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.out.println("  ");
                    return;

                default:
                    System.out.println("Opción no válida, por favor selecciona de nuevo.");
                    System.out.println("  ");
                    break;
            }
        }
    }
}
