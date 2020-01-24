import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		float x1,x2,x3,y1,y2,y3;
		
		float l1,l2,l3;
		
		Scanner in = new Scanner(System.in);
		
		//ingreso de datos
		System.out.println("Ingrese la abscisa del primer punto: ");
		x1 = in.nextFloat();
		
		System.out.println("Ingrese la ordenada del primer punto: ");
		y1 = in.nextFloat();
		
		System.out.println("Ingrese la abscisa del segundo punto: ");
		x2 = in.nextFloat();
		
		System.out.println("Ingrese la ordenada del segundo punto: ");
		y2 = in.nextFloat();
		
		System.out.println("Ingrese la abscisa del tercer punto: ");
		x3 = in.nextFloat();
		
		System.out.println("Ingrese la abscisa del tercer punto: ");
		y3 = in.nextFloat();
		
		//operacion
		l1 = (float)Math.sqrt(Math.pow((double)(x1-x2),2.0)+Math.pow((double)(y1-y2),2.0));
		
		l2 = (float)Math.sqrt(Math.pow((double)(x2-x3),2.0)+Math.pow((double)(y2-y3),2.0));
		
		l3 = (float)Math.sqrt(Math.pow((double)(x1-x3),2.0)+Math.pow((double)(y1-y3),2.0));
		
		if(l1 == l2 && l1 == l3) {
			
			System.out.println("Es un triangulo equilatero");
		}else {
			if(l1 != l2 && l1 != l3) {
				
				System.out.println("Es un triangulo escaleno");
			}else {
				
				System.out.println("Es un triangulo isosceles");
			}
			
		}
	}

}
