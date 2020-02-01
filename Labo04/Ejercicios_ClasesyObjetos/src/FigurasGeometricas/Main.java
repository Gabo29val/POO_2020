package FigurasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<FiguraGeometrica> figuraGeometrica = new ArrayList<FiguraGeometrica>();
	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//guardando las figuras geometricas
		guardarFiguraGeometrica();
		//mostrando las areas de las figuras ingresadas
		mostrarFiguras();
	}
	
	public static void guardarFiguraGeometrica() {
		int opc;
		char rpta;
		do {
			do {
				System.out.println("Ingrese que figura geométrica desea: ");
				System.out.println("1.Cuadrado");
				System.out.println("2.Triángulo");
				System.out.println("3.Círculo");
				System.out.println("4.Rectángulo");
				System.out.println("Escoja una opcion: ");
				opc = in.nextInt();
			}while(opc<1 || opc>4);
			
			switch(opc) {
			case 1:	guardarCuadrado();
					break;
			case 2:	guardarTriangulo();
					break;
			case 3:	guardarCirculo();
					break;
			case 4:	guardarRectangulo();
					break;
			}
			
			System.out.println("Desea agregar otra figura geométrica?(S/N): ");
			rpta = in.next().charAt(0);
			System.out.println("");
			
		}while(rpta == 'S' || rpta == 's');
	}
	
	public static void guardarTriangulo() {
		double lado1,lado2,lado3;
		
		System.out.print("Lado 1: ");
		lado1 = in.nextDouble();
		System.out.print("Lado 2: ");
		lado2 = in.nextDouble();
		System.out.print("Lado 3: ");
		lado3 = in.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
		
		figuraGeometrica.add(triangulo);
	}
	
	public static void guardarRectangulo() {
		double ancho,largo;
		
		System.out.print("Ancho: ");
		ancho = in.nextDouble();
		System.out.print("Largo: ");
		largo = in.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(largo,ancho);
		
		figuraGeometrica.add(rectangulo);
	}
	
	public static void guardarCuadrado() {
		double lado;
		
		System.out.print("Lado: ");
		lado = in.nextDouble();
		
		Cuadrado cuadrado = new Cuadrado(lado);
		
		figuraGeometrica.add(cuadrado);
	}
	
	public static void guardarCirculo() {
		double radio;
		
		System.out.print("Radio: ");
		radio = in.nextDouble();
		
		Circulo circulo = new Circulo(radio);
		
		figuraGeometrica.add(circulo);
	}
	
	public static void mostrarFiguras() {
		
		for(FiguraGeometrica fig: figuraGeometrica) {
			System.out.println(fig.toString());
			System.out.println("Area: " + fig.calcularArea());
			System.out.println("");
		}
	}
}
