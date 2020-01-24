package pe.edu.unmsm.agenda;

public class Contacto {
	
	String nombre;
	double salario;
	int edad;
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setSalario(double salario) {
		
		this.salario = salario;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	public Contacto() {
		
	}
	
	public Contacto(String nombre, double salario, int edad) {
		
		this.nombre = nombre;
		this.salario = salario;
		this.edad = edad;
		
	}
	
	@Override
	public String toString() {
		return this.nombre + "\t" + this.salario + "\t" + this.edad;
	}

}
