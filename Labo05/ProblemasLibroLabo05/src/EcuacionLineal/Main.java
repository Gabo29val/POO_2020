package EcuacionLineal;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a,b,c,d,e,f;
		
		System.out.println("Sistema de ec. lineales de orden 2");
		System.out.println("----------------------------------");
		System.out.println("ax + by = e");
		System.out.println("cx + dy = f");
		System.out.println("\n");
		
		System.out.println("Ingrese el valor de a: ");
		a = in.nextDouble();
		System.out.println("Ingrese el valor de b: ");
		b = in.nextDouble();
		System.out.println("Ingrese el valor de c: ");
		c = in.nextDouble();
		System.out.println("Ingrese el valor de d: ");
		d = in.nextDouble();
		System.out.println("Ingrese el valor de e: ");
		e = in.nextDouble();
		System.out.println("Ingrese el valor de f: ");
		f = in.nextDouble();
		
		LinearEquation ec = new LinearEquation(a,b,c,d,e,f);
		
		if(ec.isSolvable() == true) {
			System.out.println("Las soluciones son: ");
			System.out.println("x = " + ec.getX());
			System.out.println("y = " + ec.getY());
		}else {
			System.out.println("La ecuación no tiene solución!");
		}
	}

}
