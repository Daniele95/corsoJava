package com.gft.esempi.esercizi;

public class Fibonacci {

	// metodo ricorsivo
	public static int fibonacci(int n) {		
		if (n == 0 || n == 1) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);		
	}
	
	
	public static void main(String[] args) {
		
		// uso il ricorsivo
		for (int i = 0; i< 20; i++)
			System.out.print(fibonacci(i) + " ");
		
		System.out.println();
		
		// metodo iterativo:
		int a2 = 1;
		int a3 = 0;
		for ( int i = 0; i< 20; i++ ) {
			int sum = a3 + a2;
			a2 = a3;
			a3 = sum;
			System.out.printf(sum + " ");
		}
		
	}
}
