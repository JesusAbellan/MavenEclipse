package fibonacciMain;

import fibonacci.Fibonacci;

public class Main {
	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci("fibonacci 1", 10);
		Fibonacci f2 = new Fibonacci();
		f2.setNombre("fibonacci 2");
		f2.setTamaño(10);
		f1.mostrarSerie();
		f2.mostrarSerie();
	}
}
