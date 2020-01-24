package Selectiva;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		
		int a,b,c,sw;
			
		Scanner in = new Scanner(System.in);
			
		System.out.println("Ingrese el primer lado: ");
		a = in.nextInt();
			
		System.out.println("Ingrese el segundo lado: ");
		b = in.nextInt();
			
		System.out.println("Ingrese el tercer lado: ");
		c = in.nextInt();
			
		if(a>0 && b>0 && c>0){
			if(b>a-c && b<a+c){
				sw=1;
				System.out.println("El triangulo existe!");
					
				if(a==b && b==c){
					System.out.println("Es un triangulo equilatero");
						
				}else{
					if(a==b || a==c || b==c){
						System.out.println("Es un triangulo isosceles");
							
					}else{
						System.out.println("Es un triangulo escaleno");
							
					}
				}
			}else{
				System.out.println("El triangulo no existe!!!");
				sw=0;
				
			}
				
		}else{
			System.out.println("Datos no validos");
				
		}
	
	}

}
