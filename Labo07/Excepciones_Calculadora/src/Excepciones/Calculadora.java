package Excepciones;

import java.util.Scanner;

public class Calculadora {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
			calculadora();	
	}
	
	public static void calculadora() throws NumberFormatException, ArithmeticException{
		System.out.println("Calculadora");
		System.out.println("-----------");
		String operacion = teclado.nextLine();
		int a = 0;
		int b = 0;
		
		int pos1 = operacion.indexOf(" ", 0);
		try {
			a = Integer.parseInt(operacion.substring(0, pos1));
		}catch(NumberFormatException e) {
			System.out.println("Operacion no valida!");
		}
		
		int pos2 = operacion.indexOf(" ", pos1+1);
		try {
			b = Integer.parseInt(operacion.substring(pos2+1));
		}catch(NumberFormatException e) {
			System.out.println("Operacion no valida!");
		}
		
		char s = ' ';
		for(int i = 0; i < operacion.length(); i++) {
			s = operacion.charAt(i);
			if(s == '+')
				System.out.println("La suma es: " + (a + b));
			if(s == '-')
				System.out.println("La resta es: " + (a - b));
			if(s == '*')
				System.out.println("La multiplicación es: " + (a * b));
			if(s == '/')
				try {
					System.out.println("La divión es: " + (a / b));
				}catch(ArithmeticException arit) {
					System.out.println("No se puede dividir por cero");
				}
		}
	}
}
