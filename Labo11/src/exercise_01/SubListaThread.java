package exercise_01;

import java.util.List;

public class SubListaThread implements Runnable {
	int sumaLocal;
	List<Integer> lista;
	int ini;
	int fin;

	public SubListaThread(List<Integer> lista, int ini, int fin) {
		this.lista = lista;
		this.ini = ini;
		this.fin = fin;
	}

	public void makeLocalSum() {
		int s = 0;
		for (int i = ini; i < fin; i++) {
			s += lista.get(i);
		}
		sumaLocal = s;
	}

	public int getSumLocal() {
		return sumaLocal;
	}

	@Override
	public void run() {
		makeLocalSum();
	}

}
