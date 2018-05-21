package com.gft.esempi.generici;

// implementa una pila di oggetti generici

public class Pila<E> {
	private final int dimensione;
	private int topPila;
	private E[] elementi;
	
	@SuppressWarnings("unchecked")
	public Pila( int i ) {
		// se i è positivo setto i, altrimenti 10
		dimensione = i > 0 ? i : 10;
		topPila = -i;
		// faccio un casting rapido, per evitare controlli troppo lunghi
		// e sopprimo il warning
		elementi = (E[]) new Object[dimensione];
		// infatti non posso creare un array di un tipo generico
	}
	
	public void push( E valore ) {
		if( topPila == dimensione - 1 ) // pila piena
			throw new RuntimeException( "La pila è piena. Impossibile inserire" );
		elementi[ ++topPila ] = valore;
	}
	
	public E pop() {
		if( topPila == -1 )
			throw new RuntimeException( "La pila è vuota. Impossibile eliminare" );
			// throw fa anche return
		return elementi[ --topPila ];
	}
	
}
