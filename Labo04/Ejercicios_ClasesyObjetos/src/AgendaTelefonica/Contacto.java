package AgendaTelefonica;

public class Contacto {
	
	private String nombre;
	private String[] numTelef;
	private String dirComercial;
	private String dirDomicilio;
	
	public Contacto(String nombre, String[] numTelef, String dirComercial, String dirDomicilio) {
		
		this.nombre = nombre;
		this.numTelef = numTelef;
		this.dirComercial = dirComercial;
		this.dirDomicilio = dirDomicilio;
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumTelef(String[] numTelef) {
		this.numTelef = numTelef;
	}
	
	public void setDirComercial(String dirComercial) {
		this.dirComercial = dirComercial;
	}
	
	public void setDirDomicilio(String dirDomicilio) {
		this.dirDomicilio = dirDomicilio;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String[] getNumTelel() {
		return numTelef;
	}
	
	public String getDirComercial() {
		return dirComercial;
	}
	
	public String getDirDomicilio() {
		return dirDomicilio;
	}
	
	@Override
	
	public String toString() {
		String result = "";
		String numeros = "";
		//return this.nombre + "---" + this.numTelef + "---" + this.dirComercial + "---" + this.dirDomicilio;
		for(int i=0; i<numTelef.length; i++) {
			numeros = numeros + this.numTelef[i] + "  ";
		}
		result = "\n\n\nNombre: " + this.nombre + "\nNumero(s): " + numeros + "\nDir. Comercial: " + this.dirComercial + "\nDir. Domicilio: " + this.dirDomicilio + "\n\n";
		return result;
	}
	
	
}
