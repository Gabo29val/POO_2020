package PrestamoDeLibros;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void adquirirLibro() {
		
	}
	
	public void devolverLibro() {
		
	}

	@Override
	public String toString() {
		return "[Nombre---->" + nombre + ", edad---->" + edad + ", dni---->" + dni + "]";
	}
	
	

}
