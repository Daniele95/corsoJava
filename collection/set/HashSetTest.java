package com.gft.esempi.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest {
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	
	// non posso creare direttamente il Set da un Array: devo 
	// convertire l'Array in List e la List in Set (passaggio intermedio)
	public HashSetTest() {
		List<String> list = Arrays.asList( ELEMENTI );
		System.out.println( "\nLista" + list );
		
		// già questo mi crea un set corrispondente alla lista
		// ma senza elementi duplicati
		HashSet<String> set = new HashSet<String>( list );
		
		// tutti gli elementi duplicati verranno automaticamente scartati
		// dal Set, non verrà lanciato alcun tipo di eccezione
		set.add( "E4" );
		set.add( "E7" );
		
		// uso un ciclo for
		// for( String elemento : set )
		// o visto che Set deriva da Iterator, uso un iteratore sul set
		
		Iterator<String> iteratore = set.iterator();
		while( iteratore.hasNext() )
			System.out.printf( "%s ", iteratore.next() );
		
	}
	
	public static void main(String[] args) {
		new HashSetTest();
	}
	
}
