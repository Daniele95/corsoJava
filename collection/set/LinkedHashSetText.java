package com.gft.esempi.collection.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;


public class LinkedHashSetText {
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	
	public LinkedHashSetText() {
		List<String> list = Arrays.asList( ELEMENTI );
		System.out.println( "\nLista" + list );
		
		LinkedHashSet<String> set = new LinkedHashSet<String>( list );
		
		set.add( "E4" );
		set.add( "E7" );
		
		
		Iterator<String> iteratore = set.iterator();
		while( iteratore.hasNext() )
			System.out.printf( "%s ", iteratore.next() );
		
	}
	
	public static void main(String[] args) {
		new LinkedHashSetText();
	}
	
}
