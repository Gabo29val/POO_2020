package Selectiva;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		
		int n1,n2,n3,cent;
		
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese el primer numero: ");
		n1 = in.nextInt();
			
		System.out.println("Ingrese el segundo numero: ");
		n2 = in.nextInt();
			
		System.out.println("Ingrese el tercer numero: ");
		n3 = in.nextInt();
			
		if(n1>n2&&n1>n3) {
			if(n2>n3) {
				cent=n2;
			}else {
				cent=n3;
			}
				
		}else {
			if(n2>n1&&n2>n3) {
				if(n1>n3) {
					cent=n1;
				}else {
					cent=n3;
				}
			}else {
				if(n1>n2) {
					cent=n1;
				}else {
					cent=n2;
				}
			}
		}
			
		System.out.println("El numero intermedio es: " + cent);
			

	}

}
