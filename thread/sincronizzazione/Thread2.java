package com.gft.esempi.thread.sincronizzazione;

public class Thread2 extends Thread {
	
	Tabella t;
	
	Thread2( Tabella t ) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.stampa( 10 );
	}

}
