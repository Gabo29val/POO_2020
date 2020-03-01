package fibonacci;

public class Fibonacci {

	public int getFibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return getFibo(n - 1) + getFibo(n - 2);
		}
	}

	public void mostrarNumFibo(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibo(i) + " ");
		}
	}

}
