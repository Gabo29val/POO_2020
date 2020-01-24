import java.util.Scanner;

public class Prob2 {
	
	public static String invertirTexto(String texto) {
		
		String inv = " ";
		int tam = 0;
		int i = 0;
		
		tam = texto.length();
		for(i = tam ; i > 0 ; i--) {
			
			inv = inv + texto.charAt(i-1);
		}
		
		return inv;
		
		
	}
	
	
	public static void main(String[] args) {
		
		String tex = " ";
		String texInv = " ";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un texto: ");
		tex = in.nextLine();
		in.close();
		
		texInv = invertirTexto(tex);
		
		System.out.println("El texto invertido es: " + texInv);
		
	}

}
