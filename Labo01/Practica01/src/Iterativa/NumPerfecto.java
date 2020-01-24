package Iterativa;

import java.util.Scanner;

public class NumPerfecto {
	
	int n,sum=0;
	
	public int sumaDiv(int num) {
		int sw=1,i;
		int sumDiv=0;
		for(i=1;i<num;i++){
			if(num % i == 0)
				sumDiv=sumDiv+i;
		}
		if(num == sumDiv)
			sw=1;
		else
			sw=0;
		
		return sw;
		
	}
	
	public void mensaje() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		n = in.nextInt();
		
		if(sumaDiv(n) == 1) {
			
			System.out.println("Es un numero perfecto");
		}else {
			System.out.println("No es un numero perfecto");
		}
	}

}
