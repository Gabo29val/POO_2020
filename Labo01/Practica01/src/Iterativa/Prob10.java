package Iterativa;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		
		int n,i=1,sum=0;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese un numero: ");
		n = in.nextInt();
			
		while(i<=n) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
			i++;
		}
			
		System.out.println("\nLa suma de los impares desde 1 hasta " + n + " es: " + sum);

	}

}
