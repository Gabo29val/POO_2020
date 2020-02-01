package Supermercado;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void solicitarPedido(ArrayList<Pedido> pedidos, Pedido pedido, MedioDePago medio){
        pedido.setCliente(this);
        pedido.setMedio(medio);
        //Guardando el pedido en el array pedidos
        pedidos.add(pedido);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
