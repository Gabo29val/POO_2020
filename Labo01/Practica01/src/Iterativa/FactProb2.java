package Iterativa;

import java.util.Scanner;

public class FactProb2 {
	
	int num,i=1;
	public int primo(int n) {
		int sw=1,i;
		if(n==1){
			sw=0;
		}else{
			for(i=2;i<n;i++){
				if(n % i == 0)
					sw=0;
			}
		}
		return sw;
	}
	public void factorizarNum() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num = in.nextInt();
		
		for(i=2;i<num;i++) {
			if(num % i == 0 && primo(i)==1) {
									
				System.out.print(i + " ");
													
			}
		}
	}

}
