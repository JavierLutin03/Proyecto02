package Protecto2;

import java.util.Date;
import java.util.List;

/**
 * La clase Pedido representa un pedido realizado por un cliente,
 * incluyendo la lista de productos, la fecha del pedido y el estado del mismo.
 */
public class Pedido {
    // Atributos del pedido
    private Cliente cliente; // Cliente que realiza el pedido
    private List<Producto> productos; // Lista de productos en el pedido
    private Date fechaPedido; // Fecha en que se realizó el pedido
    private String estado; // Estado del pedido (ej. Pendiente, Procesado)

    /**
     * Constructor de la clase Pedido.
     *
     * @param cliente El cliente que realiza el pedido.
     * @param productos La lista de productos que forman parte del pedido.
     */
    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.fechaPedido = new Date(); // Establece la fecha actual al crear el pedido
        this.estado = "Pendiente"; // Estado inicial del pedido
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Calcula el total del pedido sumando los precios de todos los productos.
     *
     * @return El total del pedido como un valor double.
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio(); // Asumiendo que el producto tiene un método getPrecio()
        }
        return total;
    }

    /**
     * Devuelve una representación en forma de cadena del pedido.
     *
     * @return La representación en cadena del pedido.
     */
    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", productos=" + productos +
                ", fechaPedido=" + fechaPedido +
                ", estado='" + estado + '\'' +
                '}';
    }
}
