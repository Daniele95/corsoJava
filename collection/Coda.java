package com.gft.esempi.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Coda {
	public static void main(String[] args) {
		// uso una LinkedList per creare una coda
		Queue<String> coda = new LinkedList<String>();	
		
		// invece una doppia coda, una LinkedList effettiva, è
		// LinkedList<String> coda2 = new LinkedList<String>();
		
		coda.offer("B");
		coda.offer("A");
		coda.offer("G");
		
		// peek tira fuori il primo valore:
		System.out.println(coda.peek());
		
		coda.poll();
		coda.poll();
		coda.poll();
		coda.poll();
		coda.poll();
		// anche se finisco i dati in coda,
		// questo metodo non lancia eccezioni
		coda.clear();
		coda.offer("Z");
		// remove() invece dà errore se la coda è vuota
		coda.remove();
		// quindi devo fare
		try {
			coda.remove();
		} catch(NoSuchElementException exc) {
			System.err.println("\nnulla da rimuovere");
		}
		
	}
}
