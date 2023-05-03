package Models;

public class ProductoInformatico extends Producto{
    private String nombreDelFabricante;

    public ProductoInformatico() {
    }

    public ProductoInformatico(Integer stock, String nombre, Double precio, String nombreDelFabricante) {
        super(stock, nombre, precio);
        this.nombreDelFabricante = nombreDelFabricante;
    }

    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }

    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreDelFabricante='" + nombreDelFabricante + '\'' +
                "} " + super.toString();
    }
}
