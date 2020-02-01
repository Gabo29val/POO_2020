package PrestamoDeLibros;

import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();
	static ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		int opc;
		while(true) {
			System.out.println("SISTEMA DE PRESTAMOS DE LIBROS");
			System.out.println("------------------------------");
			System.out.println("1.Registrar libros");
			System.out.println("2.Registrar personas");
			System.out.println("3.Mostrar libros disponibles");
			System.out.println("4.Mostrar personas");
			System.out.println("5.Registrar prestamo");
			System.out.println("6.Mostrar prestamos");
			System.out.println("7.Salir");
			System.out.print("Elija una opcion: ");
			opc = in.nextInt();
			switch(opc) {
			case 1:
				in.nextLine();
				registrarLibro();
				break;
			case 2:
				in.nextLine();
				registrarPersona();
				break;
			case 3:
				in.nextLine();
				mostrarLibros();
				break;
			case 4:
				in.nextLine();
				mostrarPersonas();
				break;
			case 5:
				in.nextLine();
				agregarPrestamo();
				break;
			case 6:
				in.nextLine();
				mostrarPrestamos();
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;
			}
		}
		
	}
	
	public static void registrarLibro() {
		String titulo;
		String añoEdicion;
		String autor;
		boolean estado = true;;
		String codigo;
		
		in.nextLine();
		
		System.out.println("Titulo: ");
		titulo = in.nextLine();
		
		System.out.println("Año de edicion: ");
		añoEdicion = in.nextLine();
		
		System.out.println("Autor: ");
		autor = in.nextLine();
		
		System.out.println("Codigo: ");
		codigo = in.nextLine();
		
		listaLibros.add(new Libro(titulo,añoEdicion,autor,estado,codigo));
		System.out.println("Libro registrado con exito!");
	}
	
	public static void mostrarLibros() {
		for(Libro i: listaLibros) {
			if(i.isEstado()) {
				System.out.println(i.toString());
				System.out.println("");
			}else {
				System.out.println("No hay libros disponibles");
			}
		}
	}
	
	public static void registrarPersona() {
		String nombre;
		int edad;
		String dni;
		
		in.nextLine();
		
		System.out.println("Nombre: ");
		nombre = in.nextLine();
		
		System.out.println("Edad: ");
		edad = in.nextInt();
		
		in.nextLine();
		System.out.println("Dni: ");
		dni = in.nextLine();
		
		listaPersonas.add(new Persona(nombre,edad,dni));
		System.out.println("Persona registrada con exito!");
	}
	
	public static void mostrarPersonas() {
		for(Persona p: listaPersonas) {
			System.out.println(p.toString());
			System.out.println("");
		}
	}
	
	public static Persona obtenerPersona(String nombre) {
		Persona persona = null;
		for(Persona p: listaPersonas) {
			if(p.getNombre().equals(nombre)) {
				persona = p;
				break;
			}
		}
		return persona;
	}
	
	public static Libro obtenerLibro(String titulo) {
		Libro libro = null;
		for(Libro l: listaLibros) {
			if(l.getTitulo().equals(titulo)) {
				libro = l;
				break;
			}
		}
		return libro;
	}
	
	public static void agregarPrestamo() {
		Prestamo prestamo = new Prestamo();
		//Date fechaPrest;
		//Date fechaDevol;
		Libro libro;
		Persona persona;
		String nombre;
		String titulo;
		
		
		System.out.println("Ingrese titulo del libro: ");
		titulo = in.nextLine();
		libro = Main.obtenerLibro(titulo);
		
		if(libro != null) {
			
			System.out.println("Libro encontrado");
			if(libro.isEstado() == true) {
				/*
				libro.setEstado(false);
				prestamo.setLibro(libro);
				System.out.println("Libro asignado!");
				*/
				
				System.out.println("Ingrese su nombre: ");
				nombre = in.nextLine();
				persona = Main.obtenerPersona(nombre);
				
				if(persona != null) {
					prestamo.setPersona(persona);
					System.out.println("Prestamo registrado exitosamente!");
					libro.setEstado(false);
					prestamo.setLibro(libro);
					System.out.println("Libro asignado!");
					listaPrestamos.add(new Prestamo(libro,persona));
					
				}else {
					System.out.println("Ud. no está registrado");
				}
			}else {
				System.out.println("Este libro está prestado");
			}
			
		}else {
			System.out.println("El libro " + titulo + " no está registrado");
		}
		
	}
	
	public static void mostrarPrestamos() {
		System.out.println("\n\nRELACION DE PRESTAMOS REALIZADOS");
		for(Prestamo p: listaPrestamos) {
			System.out.println(p.toString());
			System.out.println("");
		}
	}
	

}
