package Iterativa;

import java.util.Scanner;

public class Capicua {
	
	int n,inv;
	
	public int invertirNum(int n) {
		int inv;
		inv=0;
		while(n>0){
			inv=inv*10+n%10;
			n=n/10;
		}
		return inv;
	}
	
	public void mensaje() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		n = in.nextInt();
		
		inv = invertirNum(n);
		
		if(n == inv) {
			System.out.println("El numero es capicua");
		}else {
			System.out.println("El numero no es capicua");
		}
	}

}
