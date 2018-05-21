package com.gft.esempi.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();
		mostraPush(pila, 42);
		mostraPush(pila, 66);
		mostraPush(pila, 99);
		System.out.println("pop necessari per portare in cima il valore 66: " +
				pila.search(66));
		mostraPop(pila);
		
		try {
			mostraPop(pila);
		} catch( EmptyStackException exc ) {
			System.out.println("Pila vuota");
		}
		
	}

	private static void mostraPop( Stack<Integer> pila ) {
		System.out.println( "pop -> " );
		Integer a = pila.pop();
		System.out.println(a);
		System.out.println( "Pila: " + pila );
	}

	// implemento metodo di interimento nella struttura
	private static void mostraPush( Stack<Integer> pila, int i ) {
		pila.push( i );
		System.out.println( "Push: " + i );
		// quando accodo qualcosa in stampa è sottinteso
		// la chiamata la toString() , in questo caso sarebbe pila.toString()
		System.out.println( "Pila: " + pila );
	}
}
