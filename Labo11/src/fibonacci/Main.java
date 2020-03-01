package fibonacci;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Fibonacci serie = new Fibonacci();

		System.out.println("Ingrese la cantidad de términos a mostrar: ");
		int n = in.nextInt();
		serie.mostrarNumFibo(n);

	}

}
