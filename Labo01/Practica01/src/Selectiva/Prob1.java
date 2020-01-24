package Selectiva;

import java.util.Scanner;

public class Prob1 {
	
	public static void main(String[] args) {
		
		int num=0;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
			
		if(num%2==0) {
				
			System.out.println("El numero es par");
		}else {
				
			System.out.println("El numero es impar");
		}

	}

}
