package com.gft.esempi.thread.sincronizzazione;

public class Acquirente {
	int bilancio = 10000;
	
	synchronized void ritiroDenaro( int cifra ) {
		System.out.println( "Inizio ritiro denaro...." );
		
		if( this.bilancio < cifra ) {
			System.out.println( "Bilancio non sufficiente, attesa deposito.." );
			
			try {
				wait();	// è un metodo di Object, è come se scrivessi Object.wait()
			} catch ( Exception e ) {
				e.getMessage();
			}
			
		}
		this.bilancio -= cifra;
		System.out.println( "Ritiro denaro completato. Bilancio attuale: "
				+ bilancio );
	}		
	
	synchronized void deposito( int cifra ) {
		System.out.println( "Inizio ritiro denaro...." );
		this.bilancio += cifra;
		System.out.println( "Deposito completato. Bilancio attuale: " + bilancio);
		notify();	// metodo di Object, serve per svegliare i Thread
	}
	
}
