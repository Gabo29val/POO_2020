package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Set_Prob2 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(5);
		A.add(7);
		A.add(10);

		A.add(14);
		A.add(15);
		A.add(18);
		A.add(19);

		B.add(2);
		B.add(3);
		B.add(7);
		B.add(9);
		B.add(10);
		B.add(11);
		B.add(15);
		B.add(8);
		B.add(20);
		B.add(21);
		B.add(25);

		System.out.println("A = " + A + " ");
		System.out.println("B = " + B + " ");

		unirConjuntos(A, B);

		/*
		 * 
		 * INTERESANTE CON HashSet A.add(2); A.add(3); A.add(4);
		 * System.out.println(A.toArray()[2]);
		 * 
		 */
	}

	// Con ArrayList
	public static void unirConjuntos(ArrayList<Integer> A, ArrayList<Integer> B) {
		int tamA = A.size();
		int tamB = B.size();

		int menor;

		ArrayList<Integer> C = new ArrayList<Integer>();

		int num;

		int i = 0;
		int j = 0;

		while (i < tamA && j < tamB) {
			if (A.get(i) > B.get(j)) {
				num = B.get(j);
				C.add(num);
				j++;
			} else {
				num = A.get(i);
				C.add(num);
				i++;
			}
		}

		if (tamA > tamB) {
			menor = tamB;
			for (int k = menor; k < tamA; k++) {
				C.add(A.get(k));
			}
		} else {
			menor = tamA;
			for (int k = menor; k < tamB; k++) {
				C.add(B.get(k));
			}
		}

//		System.out.println("Juntando los elementos de A y B");
//		System.out.println("C = " + C + " ");

		// Convirtiendo un ArrayList a un HashSet
		HashSet<Integer> D = new HashSet<Integer>(C);

		System.out.println("\nCONJUNTO UNION");
		System.out.println("D = " + D + " ");
	}

}
