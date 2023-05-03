import Contenedora.ComercioArticulosOficina;
import Models.Escritorio;
import Models.Impresora;
import Models.Notebook;
import Models.Silla;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Parcial!");
        System.out.println("\nTESTEAREMOS EL PUNTO 1 ,2 Y 3");
        ComercioArticulosOficina comercioUno=new ComercioArticulosOficina();
        Silla sillaUno=new Silla(10,"Silla premium",50000.0,true);
        Escritorio escritorioUno= new Escritorio(15,"Escritorio de madera",20000.0,150,200);
        Impresora impresoraUno=new Impresora(5,"Impresora a color",220000.0,"ImpresorasPepeGrillo",20);
        Notebook notebookUno=new Notebook(30,"Notebook tactil",350000.0,"ComputadorasArgentinas S.A",1000);

        comercioUno.agregarProducto(sillaUno);
        comercioUno.agregarProducto(escritorioUno);
        comercioUno.agregarProducto(impresoraUno);
        comercioUno.agregarProducto(notebookUno);

        System.out.println(comercioUno.mostrarPodructos());

        System.out.println("\nTESTEAREMOS EL PUNTO 4\n");
        System.out.println("\nVenta a cliente superVIP con 50% de descuento");
        System.out.println(comercioUno.realizarVentaConDescuento(impresoraUno,50));
        System.out.println("\nAca intentaremos realizar una venta con descuento a un producto no valido");
        System.out.println(comercioUno.realizarVentaConDescuento(notebookUno,10));
        System.out.println("\nVenta a cliente sin descuento");
        System.out.println(comercioUno.realizarVentaConDescuento(sillaUno,0));

        System.out.println("\nTESTEAREMOS EL PUNTO 5\n");
        System.out.println(comercioUno.modificacionDeValoresDeProducto(5.0,10.0,15.0,20.0));


    }
}