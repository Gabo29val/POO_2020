package AgendaTelefonica;

import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese la cantidad de contactos a registrar: ");
		int dimension = in.nextInt();
		
		Agenda agenda = new Agenda(dimension);
		System.out.println("Agenda creada!");
		
		while(true) {
			System.out.println("\tAGENDA\t");
			System.out.println("1.Agregar contactos");
			System.out.println("2.Mostrar todos los contactos");
			System.out.println("3.Buscar contacto por nombre");
			System.out.println("4.Salir");
			System.out.print("Escoja una opcion: ");
			int opc = in.nextInt();
			switch(opc) {
			case 1: 
				agregarContacto(agenda);
				break;
			case 2:	
				agenda.mostrarContactos();
				break;
			case 3:	
				in.nextLine();
				System.out.println("Ingrese nombre a buscar: ");
				String nombre = in.nextLine();
				agenda.buscarContactoPorNombre(nombre);
				break;
			case 4:	
				System.exit(0);
				break;
			default:
				System.out.println("Escoja una opcion valida");
				break;
			
			}
		}
		
	}
	
	public static void agregarContacto(Agenda agenda) {
		String nomb;
		String num[];
		String dirCom;
		String dirDom;
		int cantNumTel;
		
		in.nextLine();
		
		System.out.println("Datos del contacto: ");
		
		System.out.println("Nombre: ");
		nomb = in.nextLine();
		
		System.out.println("Cuantos números telefónicos tiene?: ");
		cantNumTel = in.nextInt();
		
		num = new String[cantNumTel];
		
		in.nextLine();
		
		for(int j=0; j < num.length; j++) {
			System.out.println("Numero " + (j+1) + ": ");
			num[j] = in.nextLine();
		}
		
		System.out.println("Dirección comercial: ");
		dirCom = in.nextLine();
		
		System.out.println("Dirección domicilio: ");
		dirDom = in.nextLine();
		
		Contacto contacto = new Contacto(nomb,num,dirCom,dirDom);
		agenda.agregarContacto(contacto);
	}

}
