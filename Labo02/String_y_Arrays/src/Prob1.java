import java.util.Scanner;

public class Prob1 {
	
	public static String concatenar(String tex1 , String tex2 , String tex3) {
		
		String res = " ";
		
		res = tex1.concat(" " + tex2.concat(" " + tex3));
		
		return res;
	}
	
	public static void main(String[] args) {
		
		String t1 = "";
		String t2 = "";
		String t3 = "";
		String nuevo = "";
		
		Scanner in = new Scanner(System.in);
		
		//Textos concatenado = new Textos();
		
		System.out.println("Ingrese texto 1: ");
		t1 = in.nextLine();
		
		System.out.println("Ingrese texto 2: ");
		t2 = in.nextLine();
		
		System.out.println("Ingrese texto 3: ");
		t3 = in.nextLine();
		in.close();
		
		//concatenado.concatenar(t1, t2, t3);
		nuevo = concatenar(t1,t2,t3);
		
		System.out.println("La cadena resultante es: " + nuevo);
		
	}


}
