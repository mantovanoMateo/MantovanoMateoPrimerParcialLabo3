package Contenedora;

import Models.*;

import java.util.ArrayList;

public class ComercioArticulosOficina {
    private ArrayList<Producto> productos;

    public ComercioArticulosOficina() {
        productos = new ArrayList<>();
    }

    public ComercioArticulosOficina(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto nuevoProducto) {
        productos.add(nuevoProducto);
    }

    public String mostrarPodructos() {
        String lista = "Su lista se encuentra vacia, es decir aun no se han cargado productos";
        if (!productos.isEmpty()) {
            lista = "LISTA DE PRODUCTOS\n----------------------------\n";
            for (Producto producto : productos) {
                lista += producto.toString() + "\n";
            }
        }
        return lista;
    }

    public String realizarVentaConDescuento(Producto producto, Integer descuento) {
        String venta = "El producto que selecciono no pertenece a los habilitados para descuento";
        if (producto instanceof Silla) {
            venta = ((Silla) producto).ventaConDescuento(descuento);
        } else if (producto instanceof Impresora) {
            venta = ((Impresora) producto).ventaConDescuento(descuento);
        }
        return venta;
    }

    public String modificacionDeValoresDeProducto(Double porcentajeSillas, Double porcentajeEscritorios, Double porcentajeImpresoras, Double porcentajeNotebooks) {
        String listaComparativaDeProductos = "Aun no hay productos cargados";
        if (!productos.isEmpty()) {
            listaComparativaDeProductos = "";
            for (Producto producto : productos) {
                if (producto instanceof Silla) {
                    listaComparativaDeProductos+="----------------------------------------\nPrecio del producto "+ producto.getNombre() + " antes del aumento :$" + producto.getPrecio()+"\n";
                    producto.setPrecio(((100.0+porcentajeSillas) * producto.getPrecio()) / 100);
                    listaComparativaDeProductos+="Precio del producto "+ producto.getNombre() +" despues del aumento :$" + producto.getPrecio()+"\n";
                } else if (producto instanceof Escritorio) {
                    listaComparativaDeProductos+="----------------------------------------\nPrecio del producto "+ producto.getNombre() + " antes del aumento :$" + producto.getPrecio()+"\n";
                    producto.setPrecio(((100.0+porcentajeEscritorios) * producto.getPrecio()) / 100);
                    listaComparativaDeProductos+="Precio del producto "+ producto.getNombre() +" despues del aumento :$" + producto.getPrecio()+"\n";
                } else if (producto instanceof Impresora) {
                    listaComparativaDeProductos+="----------------------------------------\nPrecio del producto "+ producto.getNombre() + " antes del aumento :$" + producto.getPrecio()+"\n";
                    producto.setPrecio(((100.0+porcentajeImpresoras) * producto.getPrecio()) / 100);
                    listaComparativaDeProductos+="Precio del producto "+ producto.getNombre() +" despues del aumento :$" + producto.getPrecio()+"\n";
                } else if (producto instanceof Notebook) {
                    listaComparativaDeProductos+="----------------------------------------\nPrecio del producto "+ producto.getNombre() + " antes del aumento :$" + producto.getPrecio()+"\n";
                    producto.setPrecio(((100.0+porcentajeNotebooks) * producto.getPrecio()) / 100);
                    listaComparativaDeProductos+="Precio del producto "+ producto.getNombre() +" despues del aumento :$" + producto.getPrecio()+"\n";
                }

            }

        }
        return listaComparativaDeProductos;
    }
}