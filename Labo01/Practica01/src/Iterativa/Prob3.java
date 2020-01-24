package Iterativa;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		int n;
		Scanner in = new Scanner(System.in);
		
		FactProb2 prim = new FactProb2();
		
		
		System.out.println("Ingrese un numero: ");
		n = in.nextInt();
		
		if(prim.primo(n) == 1) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}

	}

}
