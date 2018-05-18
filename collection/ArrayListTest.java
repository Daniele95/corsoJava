package com.gft.esempi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	private final String[] ELEMENTI = {"E1", "E2","E5","E5","E4","E4","E2"};
	private final String[] ELEMENTI2 = {"E3", "E4"};
	
	public ArrayListTest() {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		// popolo le liste coi dati degli array
		
		for(String elemento: ELEMENTI)
			lista.add(elemento);

		for(String elemento: ELEMENTI2)
			lista2.add(elemento);
		
		stampa(lista);
		// TOLGO ALLA LISTA TUTTI GLI ELEMENTI PRESENTI ANCHE IN LISTA2		
		modifica(lista, lista2);
		// ORDINO LA LISTA
		Collections.sort(lista); // equivalente di Arrays.sort per gli array
		// non è l'interfaccia Collection, è una classe contenente algoritmi di ordinamento
		stampa(lista);
		
		
	}

	private void modifica(ArrayList<String> lista, ArrayList<String> lista2) {
		Iterator<String> iteratore = lista.iterator();
		// infatti List implementa Collection che a sua volta implementa Iterator
		// per questo ha un metodo che fornisce un Iterator
		while(iteratore.hasNext()) {
			// .hasnext() controlla se c'è un elem dopo
			// .next() scorre col puntatore all'elemento successivo
			if(lista2.contains(iteratore.next()))
				iteratore.remove();				
		}
	}

	private void stampa(ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++)
			System.out.printf("%s\t", lista.get(i));
		System.out.println();
	}
	
	public static void main(String[] args) {
		new ArrayListTest();
	}
	
}
