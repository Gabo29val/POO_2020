package Supermercado;

public class Articulo {
    private Producto producto;
    private int cantidad;

    public Articulo(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        
        //restar el stock
        producto.setStock(producto.getStock()-1);
    }

    public double getSubTotal(){
        return this.producto.getPrecio() * this.cantidad;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
