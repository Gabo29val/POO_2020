package Iterativa;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		int num,dig,c=0;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
			
		while(num>0){
			dig=num%10;
			c=c+1;
			num=num/10;	
		}
			
		System.out.println("El numero tiene " + c + " digitos");

	}

}
