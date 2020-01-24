import java.util.Scanner;

public class Prob4 {
	
	public static int contarVocales(String texto) {
		
		int c = 0;
		int tam = 0;
		char s = ' ';	// vocal
		
		texto = texto.toLowerCase();
		
		tam = texto.length();
		
		for(int i = 0; i < tam; i++) {
			
			s = texto.charAt(i);
			
			if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
				
				c++;
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String texto = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();
		in.close();
		
		System.out.println("Hay " + contarVocales(texto) + " vocales");
	}

}
