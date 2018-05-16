package com.gft.esempi.variabili;

public class EsempioVar {

	// esempio sulla visibilità delle variabili
	
	static int x = 1;
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("la variabile locale x nel main vale:"+x); // 5
		metodoA(); // 25 26
		metodoB(); // 1  10
		metodoA(); // 25 26
		metodoB(); // 10 100
		System.out.println("la variabile locale x nel main vale:"+x); // 5
	}
	
	private static void metodoB() {
		System.out.println("\nLa variabile locale x vale: " +x+
				" dopo aver richiamato il metodo B");
		x *= 10;
		System.out.println("\nLa variabile locale x vale: " +x+
				" prima di uscire dal metodo B");
		
	}

	private static void metodoA() {
		int x = 25;
		System.out.println("\nLa variabile locale x vale: " +x+
			" dopo aver richiamato il metodo A");
		++x;
		System.out.println("\nLa variabile locale x vale: " +x+
				" prima di uscire dal metodo A");
		
	}

	
}
