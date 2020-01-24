import java.util.Scanner;

public class Prob3 {
	
	public static String invertirTexto(String texto) {
		
		String inv = "";
		int tam = 0;
		int i = 0;
		
		tam = texto.length();
		for(i = tam ; i > 0 ; i--) {
			
			inv = inv + texto.charAt(i-1);
		}
		
		return inv;
		
		
	}
	
	public static boolean esPalindromo(String texto) {
		boolean flag = false;
		String inv = "";
		
		inv = invertirTexto(texto);
		
		if(inv.compareToIgnoreCase(texto) == 0) {
			
			flag = true;
			
		}
		
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		
		String texto = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();
		in.close();
		
		if(esPalindromo(texto) == true) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
		
	}

}
