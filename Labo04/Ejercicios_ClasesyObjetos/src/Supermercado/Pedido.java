package Supermercado;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Articulo> articulos;
    private MedioDePago medio;
    
    public Pedido() {
        this.articulos = new ArrayList<Articulo>();
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    
    public void mostrarArticulos(){
        System.out.println("CANTIDAD\tPRODUCTO\tPRECIO U\tSUBTOTAL");
        System.out.println("---------------------------------------------------------------");
        for(Articulo a : this.articulos){
            System.out.println(a.getCantidad()+"\t\t"+a.getProducto().getNombre()+"\t\t"+a.getProducto().getPrecio()+"\t\t"+a.getSubTotal());
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("MONTO TOTAL: "+getMontoTotal());
        System.out.println("---------------------------------------------------------------");
    }
    
    public double getMontoTotal() {
        double total = 0;
        for (Articulo a : this.articulos) {
            total = total + a.getSubTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MedioDePago getMedio() {
        return medio;
    }

    public void setMedio(MedioDePago medio) {
        this.medio = medio;
    }



}
