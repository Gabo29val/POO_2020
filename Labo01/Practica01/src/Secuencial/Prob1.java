package Secuencial;

import java.util.Scanner;

public class Prob1 {
	
	public static void main(String[] args) {
		
		float r=0,h=0;
		double area=0;
			
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Ingrese el valor del radio del cilindro recto: ");
		r = teclado.nextFloat();
		System.out.println("Ingrese el valor de la altura: ");
		h = teclado.nextFloat();
			
		area = 2*Math.PI*r*h;
		System.out.println("El area total del cilindro recto es: " + area);
		

	}

}
