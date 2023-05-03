package Models;

import Interfaz.VentaConDescuento;

public class Impresora extends ProductoInformatico implements VentaConDescuento {
    private Integer impresionesPorMinuto;

    public Impresora() {
    }

    public Impresora(Integer stock, String nombre, Double precio, String nombreDelFabricante, Integer impresionesPorMinuto) {
        super(stock, nombre, precio, nombreDelFabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "impresionesPorMinuto=" + impresionesPorMinuto +
                "} " + super.toString();
    }

    @Override
    public String ventaConDescuento(Integer porcentaje) {
        Double precioDescontado=0.0;
        precioDescontado=(((Double)(porcentaje*getPrecio()))/100.0);

        return "Valor de la venta de la impresora "+ getNombre()+" es $"+(getPrecio()-precioDescontado);
    }
}
