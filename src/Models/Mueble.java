package Models;

public abstract class Mueble extends Producto{

    public Mueble() {
    }

    public Mueble(Integer stock, String nombre, Double precio) {
        super(stock, nombre, precio);
    }

    @Override
    public String toString() {
        return "Mueble{} " + super.toString();
    }
}
