package Supermercado;

import java.util.Scanner;

public class Main {
	
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String arg[]) {
        //Llenando datos de productos
        //CODIGO - NOMBRE - PRECIO - STOCK
        
        Supermercado.productos.agregarProducto(new Producto(1, "Mouse", 20, 50));
        Supermercado.productos.agregarProducto(new Producto(2, "Teclado", 30, 20));
        Supermercado.productos.agregarProducto(new Producto(3, "iPhone", 100, 70));
        Supermercado.productos.agregarProducto(new Producto(4, "USB", 10, 30));
        Supermercado.productos.agregarProducto(new Producto(5, "Bateria", 25, 60));

        int opcion;
        while (true) {
            System.out.println("SUPERMERCADO");
            System.out.println("**********************");
            System.out.println("1. Hacer un pedido");
            System.out.println("2. Salir");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    realizarPedido();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error digite una opcion valida");
                    break;
            }
        }
    }

    public static void realizarPedido() {
        //DATOS DEL CLIENTE
        String nombre;
        String dni;
        Cliente cliente;

        System.out.println("\nRegistre sus datos porfavor");
        System.out.println("*****************************");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Dni: ");
        dni = entrada.nextLine();

        cliente = new Cliente(dni, nombre);
        System.out.println("\nDATOS PERSONALES REGISTRADOS!!");

        //DATOS DEL PEDIDO
        Pedido pedido = new Pedido();
        Articulo articulo;
        int codigo;
        int cantidad;

        boolean salir = false;
        String resp;
        int opcion;

        while (!salir) {
            System.out.println("\nPRODUCTOS DISPONIBLES");
            System.out.println("*******************************************");
            Supermercado.productos.mostrarProductos();
            System.out.print("Digite el codigo del producto: ");
            codigo = entrada.nextInt();
            Producto producto = Supermercado.productos.getProducto(codigo);
            if (producto != null) {
                System.out.print("Digite la cantidad: ");
                cantidad = entrada.nextInt();
                articulo = new Articulo(producto, cantidad);
                pedido.addArticulo(articulo);
            } else {
                System.out.println("El producto no existe");
            }
            entrada.nextLine();
            System.out.print("Desea agregar otro producto? [S/N]: ");
            resp = entrada.nextLine();
            if (resp.equals("s") || resp.equals("S")) {
                salir = false;
            } else {
                salir = true;
            }
        }

        //DATOS DE PAGO
        MedioDePago medio = null;

        System.out.println("\nMetodo de pago");
        System.out.println("*************************");
        System.out.println("1. Tarjeta");
        System.out.println("2. Cheque");
        System.out.print("Seleccione opcion: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                String cod;
                String clave;
                entrada.nextLine();
                System.out.print("Codigo: ");
                cod = entrada.nextLine();
                System.out.print("Clave: ");
                clave = entrada.nextLine();
                medio = new Tarjeta(1000, cod, clave);
                break;
            case 2:
                String cod2;
                entrada.nextLine();
                System.out.print("Codigo: ");
                cod2 = entrada.nextLine();
                medio = new Cheque(1000, cod2);
                break;
            default:
                System.out.println("Error digite una opcion valida");
                break;
        }
        
        if(medio!=null){
            System.out.println("\nMETODO DE PAGO REISTRADO!!");
            //El cliente realizará el pedido usando su metodo
            System.out.println("\nRESUMEN DEL PEDIDO");
            System.out.println("***************************************************************");
            pedido.mostrarArticulos();
            System.out.print("AGREGAR PEDIDO?[S/N]: ");
            resp = entrada.nextLine();
            if (resp.equals("s") || resp.equals("S")) {
                cliente.solicitarPedido(Supermercado.pedidos, pedido, medio);
                System.out.println("\n¡¡PEDIDO AGREGADO EXITOSAMENTE!!\n");
            } else {
                System.out.println("\nPEDIDO CANCELADO!\n");
            }
        }else{
            System.out.println("Medio de pago incorrecto");
        }
        

    }

}
