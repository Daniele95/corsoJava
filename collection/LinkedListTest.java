package com.gft.esempi.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	private final String[] ELEMENTI2 = {"E3", "E4"};
	
	public LinkedListTest() {
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		for(String elemento: ELEMENTI)
			list1.add(elemento);

		for(String elemento: ELEMENTI2)
			list2.add(elemento);
		
		// offerFirst mi fa anche tutto lo slittamento dei dati
		// per poterlo inserire per primo
		// abbastanza pesante
		// queste sono due operazioni proprie della LinkedList		
		list1.offerFirst("first");
		System.out.println("Primo elemento: " + list1.peekFirst());
		list1.offerLast("last");
		System.out.println("Ultimo elemento: "+ list1.peekLast());
		
		list1.addAll(list2);
		list2 = null; // rilascio la memoria
		
		stampaLista(list1);
		modifica(list1);
		stampaLista(list1);
		System.out.println("\nEliminazione elementi da 3 a 6");
		rimuoviElementi(list1, 3, 6);
		stampaLista(list1);
		stampaReverse(list1);		
	}

	private void rimuoviElementi(LinkedList<String> list1, int start, int end) {
		// nella funzione subList lo start è compreso, l'end no
		// se sono 3 e 6 estrae da 3 a 5
		list1.subList(start, end).clear();
	}

	private void modifica(LinkedList<String> list1) {
		// creo un iteratore che può andare sia avanti che indietro
		ListIterator<String> iterator = list1.listIterator();
		while(iterator.hasNext()) {
			String elemento = iterator.next();
			iterator.set(elemento.toLowerCase().trim());
		}
		System.out.println("Lower case: ");
	}

	private void stampaLista(LinkedList<String> list1) {
		for(String elemento : list1)
			System.out.printf("%s ", elemento);
		System.out.println();
	}

	private void stampaReverse(LinkedList<String> list1) {
		// il cursore dell'iteratore parte dall'inizio.
		// devo spostarlo alla fine
		// quindi aggiungo l'argomento list1.size()
		ListIterator<String> iterator = list1.listIterator(list1.size());

		System.out.println("\nStampa Reverse: ");
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
		
		System.out.println("\nStampa Reverse List DescendingIterator: ");
		Iterator<String> dIterator = list1.descendingIterator();
		while(dIterator.hasNext()) {
			System.out.printf("%s ", dIterator.next());
		}		
		
	}

	public static void main(String[] args) {
		new LinkedListTest();
	}
	
}
