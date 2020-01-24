package Selectiva;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		int anio,sw=0;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese el año: ");
		anio = in.nextInt();
			
		if(anio % 4 == 0){
			sw=1;
			if(anio % 100 == 0){
				sw=0;
				if(anio % 400 == 0){
					sw=1;
				}
			}
		}
			
		if(sw!=0){
			System.out.println("El año es bisiesto");
		}else{
			System.out.println("El año no es bisiesto");
		}
			
	}

}
