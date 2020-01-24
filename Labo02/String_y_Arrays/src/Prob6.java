import java.util.Scanner;

public class Prob6 {
	
	public static int contarPalabras(String texto) {
		
		int c = 1;
		int pos = 0,i = 0; 
		
		pos = texto.indexOf(" ",i);
		
		while(pos != -1) {
			
			i = pos + 1;
			c++;
			pos = texto.indexOf(" ",i);
			
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		String texto = " ";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine().trim();
		in.close();
		
		System.out.println("El texto ingresado contiene " + contarPalabras(texto) + " palabra(s)");
	}

}
