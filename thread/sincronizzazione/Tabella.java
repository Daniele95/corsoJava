package com.gft.esempi.thread.sincronizzazione;

public class Tabella {
	synchronized void stampa(int n) {
		for( int i = 1; i <= 5; i++ ) {
			System.out.println( n * i );
		
			try {
				Thread.sleep( 2000 );
			} catch ( InterruptedException e ) {
				System.out.println( e.getMessage() );
			}
		}
	}
}
