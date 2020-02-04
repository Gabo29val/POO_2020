package UnirConjuntos;


import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese tamaño del primer conjunto: ");
		int tam1 = in.nextInt();
		System.out.println("Ingrese tamaño del segundo conjunto: ");
		int tam2 = in.nextInt();
		
		int[] lista1 = new int[tam1];
		int[] lista2 = new int[tam2];
		int[] lista3 = new int[tam1+tam2];
		int[] resultado = new int[tam1+tam2];

		//llenado de datos
		System.out.println("CONJUNTO 1");
		llenarLista(lista1);
		System.out.println("CONJUNTO 2");
		llenarLista(lista2);
		
		//uniendo los dos conjuntos
		unirConjuntos(lista1,lista2,lista3);
		
		//ordenando la union de vectores
		ordenarVector(lista3);
		
		//quitando elementos repetidos
		resultado = borrarElemRepet(lista3);
		
		//mostrando la union sin elementos repetidos
		System.out.println("RESULTADO");
		mostrarLista(resultado);
		
	}
	
	public static void llenarLista(int[] lista) {
		for(int i=0; i<lista.length;i++) {
			System.out.print("[" + (i+1) + "] = ");
			lista[i] = in.nextInt();
		}
	}
	
	public static void mostrarLista(int[] lista) {
		for(int i=0; i<lista.length;i++) {
			if(lista[i] != 0)
				System.out.print(lista[i] + " ");
		}
	}
	
	public static int[] borrarElemRepet(int[] lista) {
		int[] aux = new int[lista.length];
		int[] res = new int[lista.length];
		int j=0,n,c,z=0;
		for(int i=0; i<lista.length; i++) {
			c = 0;
			n = lista[i];
			aux[j] = n;
			j++;
			for(int k=0; k<lista.length; k++) {
				if(aux[k] == n) {
					c++;
				}
			}
			if(c == 1) {
				res[z] = n;
				z++;
			}
		}
		return res;
	}
	
	public static void unirConjuntos(int[] lista1, int[] lista2, int[] lista3) {
		int m = lista1.length;
		int n = lista2.length;
		int i,j,k;
		for(i=0; i<m; i++) {
			lista3[i] = lista1[i];
			for(k=m, j=0; j<n; k++,j++) {
				lista3[k] = lista2[j];
			}
		}
	}
	
	public static void ordenarVector(int[] vector) {
		int aux;
		for(int i=0; i<vector.length; i++) {
			for(int j=i+1; j<vector.length; j++) {
				if(vector[i] > vector[j]) {
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
	
	


}
