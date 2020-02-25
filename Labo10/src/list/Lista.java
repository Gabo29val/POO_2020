package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	static ArrayList<String> arreglo = new ArrayList<String>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String texto;
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();

		// llenando el arraylist
		int pos1 = 0;
		int pos2 = 0;

		pos1 = texto.indexOf(" ");

		arreglo.add(texto.substring(0, pos1));
		while (texto.indexOf(" ", pos1 + 1) > 0) {
			pos2 = texto.indexOf(" ", pos1 + 1);
			arreglo.add(texto.substring(pos1 + 1, pos2));
			pos1 = pos2;
		}
		arreglo.add(texto.substring(pos2 + 1));

		int tamanio = arreglo.size();

		for (int i = tamanio; i > 0; i--) {
			System.out.print(arreglo.get(i - 1) + " ");
		}

	}

}
