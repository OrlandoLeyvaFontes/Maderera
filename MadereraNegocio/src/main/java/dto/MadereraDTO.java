
package dto;

public class MadereraDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor vacío
    public MadereraDTO() {
    }

    // Constructor completo
    public MadereraDTO(int id, String nombre, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }

   

}
