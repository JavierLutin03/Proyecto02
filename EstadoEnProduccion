ackage Protecto2;


public class EstadoEnProduccion implements EstadoProducto {
    @Override
    public void manejar(Producto producto) {
        producto.setEstado(this);
        System.out.println("El producto está en producción.");
        System.out.println("  ");
    }

    @Override
    public String getNombre() {
        return "En Producción";
    }
}
