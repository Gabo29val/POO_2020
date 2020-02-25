package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Prob1 {
	static Set<String> arreglo = new HashSet<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String texto;
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();

		llenarArrayList(texto);

		System.out.println("El texto ingresado tiene " + arreglo.size() + " palabras");

	}

	public static void llenarArrayList(String cadena) {
		int pos1 = 0;
		int pos2 = 0;
		pos1 = cadena.indexOf(" ");
		arreglo.add(cadena.substring(0, pos1));
		while (cadena.indexOf(" ", pos1 + 1) > 0) {
			pos2 = cadena.indexOf(" ", pos1 + 1);
			arreglo.add(cadena.substring(pos1, pos2));
			pos1 = pos2;
		}
		arreglo.add(cadena.substring(pos2));
	}
}
