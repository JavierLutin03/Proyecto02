package Protecto2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * La clase Almacenamiento implementa el patrón Singleton y se encarga de gestionar
 * el almacenamiento de pedidos en un archivo.
 */
public class Almacenamiento {
    // Instancia única de la clase Almacenamiento
    private static Almacenamiento instancia;

    /**
     * Constructor privado para evitar la creación de instancias externas.
     */
    private Almacenamiento() {
        
    }

    /**
     * Devuelve la instancia única de la clase Almacenamiento.
     * Si la instancia no ha sido creada, se crea una nueva.
     *
     * @return La instancia única de Almacenamiento.
     */
    public static Almacenamiento getInstancia() {
        if (instancia == null) {
            instancia = new Almacenamiento();
        }
        return instancia;
    }

    /**
     * Guarda una lista de pedidos en un archivo especificado.
     * Cada pedido se escribe en una nueva línea en el archivo.
     *
     * @param pedidos La lista de pedidos a guardar.
     * @param archivo La ruta del archivo donde se guardarán los pedidos.
     */
    public void guardarPedidos(List<Pedido> pedidos, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Pedido pedido : pedidos) {
                writer.write(pedido.toString() + "\n"); // Escribe cada pedido en una nueva línea
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los pedidos: " + e.getMessage());
        }
        System.out.println("Pedidos guardados exitosamente.");
    }
}
