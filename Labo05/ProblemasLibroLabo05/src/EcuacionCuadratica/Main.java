package EcuacionCuadratica;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a,b,c;
		double disc;
		
		System.out.println("Ingrese el valor de a: ");
		a = in.nextDouble();
		
		System.out.println("Ingrese el valor de b: ");
		b = in.nextDouble();
		
		System.out.println("Ingrese el valor de c: ");
		c = in.nextDouble();
		
		QuadraticEquation cuad = new QuadraticEquation(a,b,c);
		
		disc = cuad.getDiscriminant();
		
		if(disc>=0) {
			System.out.println("La raiz 1 es: " + cuad.getRoot1());
			System.out.println("La raiz 2 es: " + cuad.getRoot2());
		}else {
			System.out.println("No tiene raices reales");
		}
	}

}
