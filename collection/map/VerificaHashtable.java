package com.gft.esempi.collection.map;


public class VerificaHashtable {
	public static void main(String[] args) {
		HashtableTest carrello = new HashtableTest();
		carrello.aggiungiArticolo("1", "Apple", "Mac Pro", 3000);
		carrello.aggiungiArticolo("1", "Apple", "Mac Pro", 3000);
		carrello.aggiungiArticolo("2", "Hp", "Envy", 1200);
		carrello.aggiungiArticolo("3", "Samsung", "S8", 800);
		carrello.aggiungiArticolo("3", "Samsung", "S8", 800);
		carrello.aggiungiArticolo("3", "Samsung", "S8", 800);
		carrello.aggiungiArticolo("4", "Apple", "iPhone", 700);
		
		System.out.println("Totale complessivo: " + carrello.totaleComplessivo());
		System.out.println("Totale parziale: " + carrello.totaleParziale("3"));
		carrello.rimuoviArticolo("3");
		System.out.println("rimosso articolo 3");
		System.out.println("Totale complessivo: " + carrello.totaleComplessivo());
		carrello.stampaArticoli();
	}
}
