package com.gft.esempi.collection.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// è come l'HashTest, ma stavolta la lista prodotta è ordinata

public class TreeSetTest {
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	
	public TreeSetTest() {
		List<String> list = Arrays.asList( ELEMENTI );
		System.out.println( "\nLista" + list );
		
		TreeSet<String> set = new TreeSet<String>( list );
		
		set.add( "E4" );
		set.add( "E7" );
		
		Iterator<String> iteratore = set.iterator();
		while( iteratore.hasNext() )
			System.out.printf( "%s ", iteratore.next() );
		
	}
	
	public static void main(String[] args) {
		new TreeSetTest();
	}
	
}
