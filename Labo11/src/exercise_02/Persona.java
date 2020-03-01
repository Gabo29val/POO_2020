package exercise_02;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String id, String nombre, String apellido, int edad) {
		this.dni = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getId() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

}
