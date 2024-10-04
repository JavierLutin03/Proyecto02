package Protecto2;

import java.util.Date;

public class Factura {
    private Pedido pedido;
    private double total;
    private Date fechaFactura;

    public Factura(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
        this.fechaFactura = new Date();
    }

    // Getters y Setters
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public double getTotal() { return total; }

    public Date getFechaFactura() { return fechaFactura; }

    @Override
    public String toString() {
        return "Factura{" + "pedido=" + pedido + ", total=" + total + ", fechaFactura=" + fechaFactura + '}';
    }
}

