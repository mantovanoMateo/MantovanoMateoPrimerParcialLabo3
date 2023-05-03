package Models;

import Interfaz.VentaConDescuento;

public class Silla extends Mueble implements VentaConDescuento {
    private Boolean ruedas;

    public Silla() {
    }

    public Silla(Integer stock, String nombre, Double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }

    @Override
    public String ventaConDescuento(Integer porcentaje) {
        Double precioDescontado=0.0;
        precioDescontado=(((Double)(porcentaje*getPrecio()))/100.0);

        return "Valor de la venta del la silla "+ getNombre()+" es $"+(getPrecio()-precioDescontado);
    }
}
