import java.util.Scanner;

public class Prob7 {
	
	public static int[] ampliarArray(int[] arr, int factor) {
		
		int[] newArray = new int[arr.length + factor];
		
		for(int i=0; i<arr.length; i++) {
			
			newArray[i]= arr[i];
		}
		
		return newArray;
		
	}
	
	public static void llenarArray(int[] arr,int indice) {
		
		Scanner in =  new Scanner(System.in);
		
		for(int i = indice; i < arr.length; i++) {
			
			System.out.println("v[" + i + "] = ");
			arr[i] = in.nextInt();
			
		}
		//in.close();
	}
	
	public static void mostrarArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("v[" + i + "] = " + arr[i]);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int dimension = 0;
		int fac = 0;
		int indice = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese tamaño del arreglo: ");
		dimension = in.nextInt();
		
		int[] vector = new int[dimension];
		int[] arreglo = new int[dimension];
		
		llenarArray(vector,indice);
		mostrarArray(vector);
		
		System.out.println("En cuanto desea incrementar el tamaño del arreglo?: ");
		fac = in.nextInt();
		
		
		arreglo = ampliarArray(vector,fac);
		
		llenarArray(arreglo, vector.length);
		
		System.out.println("El nuevo arreglo es: ");
		mostrarArray(arreglo);
		in.close();
	}
	
}
