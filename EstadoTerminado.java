package Protecto2;


public class EstadoTerminado implements EstadoProducto {
    @Override
    public void manejar(Producto producto) {
        producto.setEstado(this);
        System.out.println("El producto ha sido terminado.");
        System.out.println("  ");
    }

    @Override
    public String getNombre() {
        return "Terminado";
    }
}
