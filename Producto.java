package Protecto2;


public class Producto {
    private String nombre;
    private double precio;
    private String descripcion; // Agregar campo de descripción
    private EstadoProducto estado;

    // Constructor original (2 parámetros)
    public Producto(String nombre, double precio) {
        this(nombre, precio, ""); // Llama al nuevo constructor con una descripción vacía
    }

    // Nuevo constructor (3 parámetros)
    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.estado = new EstadoEnProduccion(); // Estado inicial
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public EstadoProducto getEstado() { return estado; }
    public void setEstado(EstadoProducto estado) { this.estado = estado; }

    public void cambiarEstado(EstadoProducto nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", estado=" + estado.getNombre() + '}';
    }
}
