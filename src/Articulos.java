import java.io.Serializable;

public class Articulos implements Serializable {
    private static final long serialVersionUID = 1L;  // Hacer que la clase sea serializable

    private int codigo;
    private String nombre;
    private int cantidad;
    private String descripcion;

    // Constructor
    public Articulos(int codigo, String nombre, int cantidad, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Descripción: " + descripcion;
    }
}
