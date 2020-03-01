package exercise_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n = 100;
		int t = 10;

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			lista.add(i);
		}

		SubListaThread sbt;
		int sfinal = 0;
		for (int i = 0; i < t; i++) {
			sbt = new SubListaThread(lista, i * (n / t), (i + 1) * (n / t));
			Thread t1 = new Thread(sbt);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			sfinal += sbt.getSumLocal();
		}

		System.out.println("El promedio final es: " + (sfinal * 1.0 / n));
	}
}
