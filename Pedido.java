package Protecto2;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fechaPedido;
    private String estado; 

    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        this.fechaPedido = new Date();
        this.estado = "Pendiente";
    }

    // Getters y Setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }

    public Date getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(Date fechaPedido) { this.fechaPedido = fechaPedido; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", productos=" + productos + ", fechaPedido=" + fechaPedido + ", estado=" + estado + '}';
    }
}
