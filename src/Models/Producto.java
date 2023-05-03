package Models;

public abstract class Producto {
    private Integer Stock;
    private String Nombre;
    private Double Precio;

    public Producto() {
    }

    public Producto(Integer stock, String nombre, Double precio) {
        Stock = stock;
        Nombre = nombre;
        Precio = precio;
    }

    public Integer getStock() {
        return Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Stock=" + Stock +
                ", Nombre='" + Nombre + '\'' +
                ", Precio= $" + Precio +
                '}';
    }
}
