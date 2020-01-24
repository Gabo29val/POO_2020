import java.util.Scanner;

public class Prob9 {
	
	public static String cifrarCadena(String cadena) {
		
		String cifrado = "";
		
		//cifrado = cadena.replace('a', '4');
		cadena = cadena.toLowerCase();
		cifrado = cadena.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0').replace('u', '8');
		
		return cifrado;
	}
	
	public static String descifrarCadena(String cadena) {
		
		String descifrado = "";
		
		cadena = cadena.toLowerCase();
		descifrado = cadena.replace('4', 'a').replace('3', 'e').replace('1', 'i').replace('0', 'o').replace('8', 'u');
		
		return descifrado;
	}
	
	public static void main(String[] args) {
		
		String texto = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();
		in.close();
		
		System.out.println("\nEl texto cifrado es: " + cifrarCadena(texto));
		System.out.println("\nEl texto descifrado es: " + descifrarCadena(texto));
		
	}

}
