package com.gft.esempi.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {
	
	private Hashtable<String, String[]> prodotti =	new Hashtable<String, String[]>();
	private int articoli;
	
	public HashtableTest() {
		articoli = 0;
	}
	
	public void aggiungiArticolo( String id, String marca, String modello, double prezzo ) {
		String[] record = { marca, modello, Double.toString( prezzo ), "1", id };
		articoli++;
		if( prodotti.containsKey( id ) ) {
			String[] dati = prodotti.get( id );
			int quantita = Integer.parseInt( dati[ 3 ] );
			quantita++;
			dati[ 3 ] = Integer.toString( quantita );
			prodotti.put( id, dati );
		} else {
			prodotti.put( id, record );
		}
	}
	
	public void rimuoviArticolo( String id ) {
		if( prodotti.containsKey( id ) ) {
			articoli--;
			String[] dati = prodotti.get( id );
			if( Integer.parseInt( dati[ 3 ] ) == 1 ) {
				prodotti.remove( id );
			} else {
				int quantita = Integer.parseInt( dati[ 3 ] );
				quantita--;
				dati[ 3 ] = Integer.toString( quantita );
				prodotti.put( id, dati );				
			}
		}
	}
	
	public double totaleParziale( String id ) {
		double totale = 0.00;
		String[] dati = prodotti.get( id );
		// ecco a cosa serve la mapp!!
		// con un enum non potevo farlo
		// la mappe è una specie di database
		// ha una chiave univoca che aggancia un insieme di valori
		// un enum non potevo accedere all'articolo per id, non sapevo quale articolo
		totale += Double.parseDouble( dati[ 2 ] ) * Integer.parseInt( dati[ 3 ] );
		return totale;
	}
	
	public int getArticoli() {
		return articoli;		
	}
	
	public double totaleComplessivo() {
		double totale = 0.00;
		Enumeration<String[]> enumerazione = prodotti.elements();
		String[] dati;
		while( enumerazione.hasMoreElements() ) {
			dati = enumerazione.nextElement();
			totale += Double.parseDouble( dati[ 2 ] ) * Integer.parseInt( dati[ 3 ] );
		}
		return totale;
	}
	
	public Enumeration<String[]> getProdotti() {
		return prodotti.elements();
	}
	public void stampaArticoli() {
		Enumeration<String[]> enumerazione = this.getProdotti();
		String dati[];
		while(enumerazione.hasMoreElements()) {
			dati = enumerazione.nextElement();
			System.out.println(dati[0] + "\t\t" + dati[1]);
		}
	}
	
}
