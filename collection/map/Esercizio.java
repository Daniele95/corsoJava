package com.gft.esempi.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Esercizio {
	

	Hashtable<Integer, String[]> modulo = new Hashtable<Integer, String[]>(10);

	public void main(String[] args) {
		
		
		String[] record = { "Luigi", "Pasta", "3" };
		String[] record2 = { "Daniele", "Riso", "2" };
		String[] record3 = { "Marco", "Riso", "2" };
		
		String[] record4 = { "Marco", "Riso", "2" };

		modulo.put(1,record);
		modulo.put(2,record2);
		modulo.put(3,record3);
		modulo.put(4,record4);
		
		System.out.println(sumOverLuigi());
		
		stampa();
		
	}
	
	public int sumOverLuigi() {
			Integer totale = 0;
			Enumeration<String[]> enumerazione = modulo.elements();
			String[] dati;
			while( enumerazione.hasMoreElements() ) {
				dati = enumerazione.nextElement();
				if(dati[0] == "Luigi")
					totale += Integer.parseInt( dati[ 3 ] ) ;
			}
			return totale;
	}	
	
	
	public void stampa() {
		Enumeration<String[]> enumerazione = modulo.elements();
		String[] dati;
		while( enumerazione.hasMoreElements() ) {
			dati = enumerazione.nextElement();
			if(dati[0] == "Luigi")
				System.out.println(Integer.parseInt( dati[ 3 ] ));
			
		}
		
	}
	
	
}
