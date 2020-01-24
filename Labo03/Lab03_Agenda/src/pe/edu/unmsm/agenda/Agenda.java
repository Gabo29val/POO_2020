package pe.edu.unmsm.agenda;

import java.util.Scanner;

public class Agenda {
	
	static Contacto[] listaContactos = new Contacto[3];
	
	public static void agregarContactos(Contacto[] arr) {
		
		Scanner in = new Scanner(System.in);
		
		for( int i=0; i<arr.length; i++) {
			
			System.out.println("Datos del contacto " + (i+1) + ": ");
			System.out.println("Nombre: ");
			String nom = in.nextLine();
		
			System.out.println("Salario: ");
			double sal = in.nextDouble();
			
			System.out.println("Edad: ");
			int ed = in.nextInt();
			
			arr[i] = new Contacto(nom,sal,ed);
			
			in.nextLine();
			
		}
	}
	
	
	public static void mostrarContactos(Contacto[] arr) {
		
		System.out.println("\nNOMBRE\tSALARIO\tEDAD");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void eliminarContactos() {
		
		String opc = "S";
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la posición a eliminar: ");
		int indice = teclado.nextInt();
		listaContactos[indice-1] = null;
		System.out.println("Contacto eliminado con exito");
			
		System.out.println("Desea eliminar otro contacto? (S/N): ");
		String rpta = teclado.nextLine();
		opc = rpta.toUpperCase();
		teclado.nextLine();
			
		if(opc == "S") {
			eliminarContactos();
		}

		
	}
	public static void main(String[] args) {
		
		agregarContactos(listaContactos);
		mostrarContactos(listaContactos);
		eliminarContactos();
		mostrarContactos(listaContactos);
		
	}

}
