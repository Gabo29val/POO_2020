import java.util.Scanner;

public class InvertirTexto {
	
	int tam;
	String frase = " ";
	String fraseInv = " ";
	
	
	public void invertir() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		frase = in.nextLine();
		
		tam = frase.length();
		
		for(int i = tam-1;i>=0;i--) {
			
			fraseInv = fraseInv + frase.charAt(i);
			
		}
		
		System.out.println("La frase invertida es: " + fraseInv);
		
	}
	

}
