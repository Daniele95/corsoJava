package com.gft.esempi.thread.sincronizzazione;

public class Thread1 extends Thread {
	
	Tabella t;
	
	Thread1( Tabella t ) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.stampa( 100 );
	}

}
