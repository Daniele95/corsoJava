package com.gft.esempi.generici;

public class PilaTest {
	// occhio: qui devo usare i tipi Wrapper, non primitivi!!
	// altrimenti non posso generalizzarli!!
	// (i generici non possono essere primitivi!!)
	private static Integer[] elementiInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
	private static Double[] elementiDouble = { 1.1, 2.2, 3.2, 4.2, 5.2 };
	
	private static Pila<Integer> iPila;
	private static Pila<Double> dPila;
	
	public static void main(String[] args) {
		
		iPila = new Pila<Integer>(10);
		dPila = new Pila<Double>(4);
		
		testPush( iPila, elementiInt );
		testPush( dPila, elementiDouble );
		testPop( iPila, elementiInt );
		testPop( dPila, elementiDouble );
		
	}
	
	// per classi e interfacce si usa la T
	// per metodi si usa la E
	private static <T> void testPush( Pila<T> pila, T[] elementi ) {
		try {
			for( T elemento: elementi ) {
				System.out.printf( "%s ", elemento );
				pila.push( elemento );
			}
		} catch( RuntimeException exc ) {
			exc.printStackTrace();
		}
	}
	
	private static <T> void testPop( Pila<T> pila, T[] elementi ) {
		try {
			 T popValue;
			 while( true ) {
				 popValue = pila.pop();
				 System.out.printf( "%s" , popValue);
			 }
		} catch( RuntimeException exc ) {
			System.out.println();
			exc.printStackTrace();
		}
	}
	
}
