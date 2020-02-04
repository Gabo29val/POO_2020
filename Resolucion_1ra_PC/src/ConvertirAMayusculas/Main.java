package ConvertirAMayusculas;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		String texto = "";
		System.out.println("Ingrese un texto: ");
		texto = in.nextLine();
		
		convertirAMayusculas(texto);
	}
	
	public static void convertirAMayusculas(String texto) {
		char s;
		
		for(int i=0; i<texto.length(); i++) {
			s = texto.charAt(i);
			//a = 97	z = 122		A = 65		Z = 90
			if(s >= 97 && s <= 122) {
				s -= 32;
				System.out.print(s + "");
			}else {
				System.out.print(s + "");
			}
		}
	}

}
