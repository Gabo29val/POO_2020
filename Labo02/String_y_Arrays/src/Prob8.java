import java.util.Scanner;

public class Prob8 {
	
	public static void llenarArray(int[] arr) {
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("vector[ " + (i+1) + "]= " );
			arr[i] = in.nextInt();
		}
		
		in.close();
	}
	
	public static void mostrarArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int tam;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del arreglo: ");
		tam = teclado.nextInt();
		teclado.close();
		
		int[] vector = new int[tam];
		
		llenarArray(vector);
		
		System.out.println("El arreglo es: ");
		mostrarArray(vector);
	}

}
