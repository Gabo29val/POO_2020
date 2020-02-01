package Supermercado;

import java.util.ArrayList;

public class ArregloProductos {
    private ArrayList<Producto> productos;

    public ArregloProductos() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public void mostrarProductos() {
        System.out.println("CODIGO\t\tNOMBRE\t\tPRECIO");
        System.out.println("-----------------------------------------------");
        for (Producto p : this.productos) {
            System.out.println(p.getCodigo() + "\t\t" + p.getNombre() + "\t\t" + p.getPrecio());
        }
        System.out.println("-----------------------------------------------");
    }

    public Producto getProducto(int codigo) {
        Producto pro = null;
        for (Producto p : this.productos) {
            if(p.getCodigo() == codigo){
                pro = p;
                break;
            }
        }
        return pro;
    }

}
