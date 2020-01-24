package Secuencial;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		
		int n=0,i=0,sum=0;
				
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese la cantidad de terminos a sumar: ");
		n = in.nextInt();
			
		for(i=1;i<=n;i++) {
			sum = sum + i*i*i;			}
		
		System.out.println("La suma de cubos de los " + n + " primeros numeros naturales es: " + sum);
			

	}

}
