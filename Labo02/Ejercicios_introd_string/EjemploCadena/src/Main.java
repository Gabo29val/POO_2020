
import java.util.Scanner; 

public class Main { 
	public static void main(String[] args) {    
		Scanner teclado = new Scanner(System.in);    
		String iniciales = "";    
		String apellido = "";    
		System.out.print("Entre com um nome completo: ");    
		String nombre = teclado.nextLine().trim();    
		int inicio = 0;    
		int fin = nombre.indexOf(" ", inicio);    
		while (fin != -1) {        
			//iniciais += nome.substring(inicio, inicio + 1) + ". ";
			iniciales = iniciales + nombre.substring(inicio, inicio + 1) + ". ";
			inicio = fin + 1;        
			fin = nombre.indexOf(" ", inicio);    
		} 
		apellido = nombre.substring(inicio).toUpperCase();    
		System.out.print(apellido + ", ");    
		System.out.println(iniciales.toUpperCase().trim()); 
		}
}