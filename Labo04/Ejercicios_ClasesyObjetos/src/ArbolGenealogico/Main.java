package ArbolGenealogico;

import java.util.Scanner;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		Familia familia = new Familia();
        int opcion;
        while (true) {
            System.out.println("Menu");
            System.out.println("*******");
            System.out.println("1. Agregar Persona a la familia");
            System.out.println("2. Generar Parentesco");
            System.out.println("3. Mostrar relaciones");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    agregarPersona(familia);
                    break;
                case 2:
                    entrada.nextLine();
                    generaParentesco(familia);
                    break;
                case 3:
                	entrada.nextLine();
                	familia.mostrarFamilia();
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;
            }
        }
		
	}
	
    public static void agregarPersona(Familia familia) {
        String nombre;
        int edad;
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        familia.agregarPersona(new Persona(nombre, edad));
        System.out.println("AGREGADO!");
    }

    public static void generaParentesco(Familia familia) {
        Persona hijo;
        Persona padre;
        Persona madre;
        //ESCOGER AL HIJO
        String nombre;

        System.out.print("Digite el nombre del hijo: ");
        nombre = entrada.nextLine();
        hijo = familia.getPersonaPorNombre(nombre);
        if (hijo != null) {
            System.out.println("Hijo asignado correctamente!");

            //ESCOGER AL PADRE
            System.out.print("Digite el nombre del Padre: ");
            nombre = entrada.nextLine();
            padre = familia.getPersonaPorNombre(nombre);
            if (padre != null) {
                hijo.setPadre(padre);
                System.out.println("Padre asignado correctamente!");
            } else {
                System.out.println("Error al asignar Padre, la persona no existe");
            }

            //ESCOGER A LA MADRE
            System.out.print("Digite el nombre de la Madre: ");
            nombre = entrada.nextLine();
            madre = familia.getPersonaPorNombre(nombre);
            if (madre != null) {
                hijo.setMadre(madre);
                System.out.println("Madre asignado correctamente!");
            } else {
                System.out.println("Error al asignar madre, la persona no existe");
            }

        } else {
            System.out.println("Error, la persona no existe");
        }

    }

}
