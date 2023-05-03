package Models;

public class Notebook extends ProductoInformatico{
    private Integer cantidadDeMemoria;//en gb

    public Notebook() {
    }

    public Notebook(Integer stock, String nombre, Double precio, String nombreDelFabricante, Integer cantidadDeMemoria) {
        super(stock, nombre, precio, nombreDelFabricante);
        this.cantidadDeMemoria = cantidadDeMemoria;
    }

    public Integer getCantidadDeMemoria() {
        return cantidadDeMemoria;
    }

    public void setCantidadDeMemoria(Integer cantidadDeMemoria) {
        this.cantidadDeMemoria = cantidadDeMemoria;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "cantidadDeMemoria en Gb=" + cantidadDeMemoria +
                "} " + super.toString();
    }
}
