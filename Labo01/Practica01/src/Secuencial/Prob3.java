package Secuencial;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		
		int n1=0,n2=0,temp=0;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese el valor del primer numero: ");
		n1 = in.nextInt();
		System.out.println("Ingrese el valor del segundo numero: ");
		n2 = in.nextInt();
			
		temp = n1;
		n1=n2;
		n2=temp;
			
		System.out.println("El valor del primer numero es: " + n1);
		System.out.println("El valor del segundo numero es: " + n2);
		

	}

}
