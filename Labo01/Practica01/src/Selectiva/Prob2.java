package Selectiva;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		
		int n1,n2,res;
		
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese el primer numero: ");
		n1 = in.nextInt();
			
		System.out.println("Ingrese el segundo numero: ");
		n2 = in.nextInt();
			
		if(n1>0 && n2>0) {
				
			res = n1*n2;
			System.out.println("El producto es: " + res);
				
		}else {
				
			res = n1+n2;
			System.out.println("La suma es: " + res);
		}
			
	}

}
