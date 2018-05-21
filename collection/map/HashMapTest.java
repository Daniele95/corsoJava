package com.gft.esempi.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class HashMapTest {
	private Map<String, Integer> map;
	private Scanner in;
	
	public HashMapTest() {
		map = new HashMap<String, Integer>();
		in = new Scanner( System.in );
		creaMappa();
		visualizzaMappa();
	}

	private void creaMappa() {
		System.out.println("Inserire una frase con parole duplicate: ");
		String input = in.nextLine();
		// spezzetto la stringa con StringTokenizer o split
		// di base userà lo spazio per spezzettarla, o posso specificare cosa usare
		// nel secondo argomento
		StringTokenizer tokenizer = new StringTokenizer(input);
		while( tokenizer.hasMoreTokens() ) {
			String parola = tokenizer.nextToken();
			if( map.containsKey( parola ) ) {
				// prendo la key associata a 'parola'
				int contatore = map.get( parola );
				map.put( parola, contatore + 1 );
			} else {
				map.put( parola, 1 );
			}
		}
		
	}
	
	private void visualizzaMappa() {
		// le chiavi sono uniche, quindi la collection più corretta in cui metterle
		// è il set
		Set< String > chiavi = map.keySet();
		TreeSet< String > chiaviOrdinate = new TreeSet< String >( chiavi );
		for ( String chiave : chiaviOrdinate )
			// stringhe con allineamento di 10 caratteri da sinistra
			System.out.printf( "%-10s\t%-10s\n", chiave, map.get( chiave ) );
	}
	
	public static void main(String[] args) {
		new HashMapTest();
	}

}
