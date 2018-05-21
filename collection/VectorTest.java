package com.gft.esempi.collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorTest {
	
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	
	public VectorTest () {
		// Arrays.asList() è l'opposto di List.toArray()
		List<String> lista = Arrays.asList( ELEMENTI );
		Vector<String> vettore = new Vector<String>( lista );
		
		System.out.println( vettore );
		
		try {
			System.out.println( "Primo elemento: " + vettore.firstElement() );
			System.out.println( "Ultimo elemento: " + vettore.lastElement() );
		} catch ( NoSuchElementException exc ) {
			exc.printStackTrace();
		}
		
		if( vettore.contains("E2") )
			System.out.println("\n\"E2 trovato in posizione: " + 
					vettore.indexOf("E2") + "\"");
		else
			System.out.println( "\nElemento E2 non trovato" );
		vettore.ensureCapacity(100);
		System.out.println( "Capacità modificata: " + vettore.capacity() );
		
		this.stampaVector(vettore);
		
	}
	
	private void stampaVector( Vector<String> vettore ) {
		Enumeration<String> lista = vettore.elements();
		while( lista.hasMoreElements() ) {
			System.out.println( lista.nextElement() );
		}
	}
	
	public static void main(String[] args) {
		 new VectorTest();
	}
	
}
