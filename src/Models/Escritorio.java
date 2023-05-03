package Models;

public class Escritorio extends Mueble{
    private Integer alto;//en cm
    private Integer ancho;//en cm

    public Escritorio() {

    }

    public Escritorio(Integer stock, String nombre, Double precio, Integer alto, Integer ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }
}
