package pe.edu.unmsm.fisi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	//Con ArrayList
	static ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
		int opc;
		do {
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Agregar hombre");
			System.out.println("2. Agregar perro");
			System.out.println("3. Agregar gato");
			System.out.println("4. Mostrar lista");
			System.out.println("5. Salir");
			System.out.print("Escoja una opción: ");
			opc = in.nextInt();
			switch(opc) {
			case 1:
				agregarHombre();
				break;
			case 2:
				agregarPerro();
				break;
			case 3:
				agregarGato();
				break;
			case 4:
				mostrarLista();
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
			}
		}while(opc != 5);
	}
	
	public static void agregarHombre() {
		Hombre hombre = new Hombre();
		animales.add(hombre);
	}
	
	public static void agregarPerro() {
		Perro perro = new Perro();
		animales.add(perro);
	}
	public static void agregarGato() {
		Gato gato = new Gato();
		animales.add(gato);
	}
	public static void mostrarLista() {
		int i=0;
		for(Animal lista: animales) {
			System.out.print((i+1) + ") ");
			lista.hablar();
			System.out.println("");
			i++;
		}
	}
	
	/*
	//Con vector
	public static void main(String[] args) {
		Animal[] animales = new Animal[10];
		
		animales[0] = new Hombre();
		animales[1] = new Hombre();
		animales[2] = new Hombre();
		animales[3] = new Hombre();
		animales[4] = new Perro();
		animales[5] = new Perro();
		animales[6] = new Perro();
		animales[7] = new Gato();
		animales[8] = new Gato();
		animales[9] = new Gato();
		
		for(int i = 0; i < animales.length; i++) {
			animales[i].hablar();
		}
	}
	*/

}
