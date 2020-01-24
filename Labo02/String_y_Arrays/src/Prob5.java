import java.util.Scanner;

public class Prob5 {
	
	public static int contarVocales(String texto) {
		
		int c = 0;
		int tam = 0;
		char s = ' ';	// vocal
		int cA=0,cE=0,cI=0,cO=0,cU=0;
		
		texto = texto.toLowerCase();
		
		tam = texto.length();
		
		for(int i = 0; i < tam; i++) {
			
			s = texto.charAt(i);
			
			switch(s) {
			
			case 'a':	cA=1;	break;
			case 'e':	cE=1;	break;
			case 'i':	cI=1;	break;
			case 'o':	cO=1;	break;
			case 'u':	cU=1;	break;
			
			}
			
		}
		
		c = cA + cE + cI + cO + cU;
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String texto = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();
		in.close();
		
		System.out.println("El texto tiene " + contarVocales(texto) + " vocales diferentes");
			
		
	}

}
