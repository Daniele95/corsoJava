package com.gft.esempi.generici;

public class GenericTest2 {
	public static void main(String[] args) {
		System.out.println(max(2,3,8));
		System.out.println(max(2.2,3.2,8.2));
		System.out.println(max("Elemento1", "Elemento2", "Elemento3"));
	}

	// il tipo generico deve essere confrontabile, quindi deve estendere
	// comparable parametrizzato con esso stesso (ad es. se è un Integer
	// estenderà Comparable<Integer>, cioè l'interfaccia Comparable
	// parametrizzata sugli Integer
	private static <T extends Comparable<T> > T max( T x, T y, T z ) {
		T max = x;
		if( y.compareTo(max) > 0 )
			max = y;
		if( z.compareTo(max) > 0 )
			max = z;
		return max;
	}
}
