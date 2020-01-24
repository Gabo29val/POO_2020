package Iterativa;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		
		int n,t,i,j,k,sw,sum=0;
		
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese la cantidad de terminos de la sumatoria: ");
		n = in.nextInt();
			
		//	1, 2, 2, 4, 3, 6, 4, 8, 5, 10 
			
		t=1;	sw=1;	j=1;	k=0;
		for(i=0;i<n;i++){
			
			sum = sum + t;
			System.out.print(t + " ");
			
			if(i<n-1)
				System.out.print("+ ");
			if(sw==1){
				t=t+j;
				sw=0;
				j++;
			}else{
				t=t-k;
				sw=1;
				k++;
			}
				
		}
			
			System.out.println("\n\nLa suma de la serie es: " + sum);

	}

}
