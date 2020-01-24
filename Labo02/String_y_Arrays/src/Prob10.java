import java.util.Scanner;

public class Prob10 {
	
	public static String cifrarCadena(String cadena) {
		
		String cifrado = "";
		
		//cifrado = cadena.replace('a', '4');
		cadena = cadena.toLowerCase();
		cifrado = cadena.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0').replace('u', '8');
		
		return cifrado;
	}
	
	public static void autentificar(String cad1, String cad2) {
		
		String cif = "";
		
		cif = cifrarCadena(cad1);
		
		if(cif.equals(cad2) == true) {
			System.out.println("Se ha autentificado con exito!");
		}else {
			System.out.println("Autentificacion errónea");
		}
	}
	
	public static void main(String[] args) {
		
		String login = "";
		String pass = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre de usuario: ");
		login = in.nextLine();
		
		System.out.println("Ingrese su contraseña: ");
		pass = in.nextLine();
		
		in.close();
		//pass = cifrarCadena(login);
		
		//System.out.println("La contraseña es: " + pass);
		
		autentificar(login,pass);
		
	}

}
