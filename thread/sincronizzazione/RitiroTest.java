package com.gft.esempi.thread.sincronizzazione;

public class RitiroTest {
	public static void main(String[] args) {
		Acquirente a = new Acquirente();
		// faccio un'istanza anonima di una classe che estende il Thread
		// e faccio Override del metodo run
		new Thread() {
			public void run() {
				a.ritiroDenaro( 15000 );
			}
		}.start();
		  
		new Thread() {
			public void run() {
				a.deposito( 10000 );
			}
		}.start();
	}
}
