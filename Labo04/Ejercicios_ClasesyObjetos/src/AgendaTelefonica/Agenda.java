package AgendaTelefonica;

public class Agenda {
	
	private Contacto arrayContactos[];
	private int indice;
	private int tamaño;
	
	
	public Agenda(int n) {
		this.tamaño = n;
		this.indice = 0;
		this.arrayContactos = new Contacto[tamaño];
	}
	
	
	public void agregarContacto(Contacto contacto) {
		if(this.tamaño == this.indice) {
			System.out.println("\nCAPACIDAD EXCEDIDA!");
		}else {
			this.arrayContactos[this.indice] = contacto;
			this.indice++;
			System.out.println("\nAgregado exitosamente!");
		}
		
	}
	
	public void mostrarContactos() {
		
		for(int i=0; i<this.indice; i++) {
			System.out.println(arrayContactos[i]);
		}
	}
	
	public void buscarContactoPorNombre(String nombre) {
		
		/*
		for(int i=0; i<arrayContactos.length; i++) {
			if(arrayContactos[i].getNombre().equals(nombre) == true) {
				System.out.println("Contacto encontrado!!\n");
				System.out.println(arrayContactos[i]);
				
			}else {
				System.out.println("Contacto no encontrado");
			}
		}
		*/
		for(Contacto c: this.arrayContactos) {
			if(c.getNombre().equals(nombre)) {
				System.out.println("Contacto encontrado!");
				System.out.println(c);
				System.out.println("");
				break;
			}else {
				System.out.println("Contacto no encontrado");
			}
		}
	}
	
}
