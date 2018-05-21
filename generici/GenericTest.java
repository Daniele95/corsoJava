package com.gft.esempi.generici;

public class GenericTest {
	public static void main(String[] args) {
		Integer[] iArray = { 1, 2, 3 };
		Double[] dArray = { 1.1, 1.2, 1.3 };
		Character[] cArray = { 'A', 'B', 'C' };
		
		stampa( iArray );
		stampa( dArray );
		stampa( cArray );
		// senza i tipi generici farei un overloading di stampaArray
		// cio� implementerei tre metodi stampa()
		// che prendono come argomento rispettivamente intero, double, char
		
	}
	// E � il parametro di tipo (rappresenta Integer, Double, Character,
	// e qualsiasi altri tipo)
	private static <E> void stampa(E[] dati) {
		for( E elemento : dati ) 
			System.out.println(elemento);		
	}
}
