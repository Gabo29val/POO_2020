package Iterativa;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		
		int num,c,dig,sum;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
		
		c=0;	sum=0;
		while(num>0){
			dig=num%10;
			sum=sum+dig;
			c=c+1;
			num=num/10;	
		}
			
		System.out.println("La suma de sus digitos es: " + sum);

	}

}
