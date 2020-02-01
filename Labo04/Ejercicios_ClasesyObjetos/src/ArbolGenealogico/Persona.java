package ArbolGenealogico;

public class Persona {
	
	private String nombre;
	private int edad;
	private Persona padre;
	private Persona madre;
	
	public Persona(String nombre, int edad, Persona padre, Persona madre) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.padre = padre;
		this.madre = madre;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	
	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public Persona getPadre() {
		return padre;
	}
	
	public Persona getMadre() {
		return madre;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nPadre: " + padre + "\nMadre: " + madre;
	}
	

}
