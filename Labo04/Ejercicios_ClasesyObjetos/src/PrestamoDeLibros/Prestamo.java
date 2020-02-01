package PrestamoDeLibros;

import java.util.Date;

public class Prestamo {
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private Libro libro;
	private Persona persona;
	
	public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Persona persona) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.libro = libro;
	}
	
	public Prestamo(Libro libro, Persona persona) {
		this.libro = libro;
		this.persona = persona;
	}
	public Prestamo() {
		
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Libro: " + libro + " \nprestado a\n" + persona;
	}
	
	

}
