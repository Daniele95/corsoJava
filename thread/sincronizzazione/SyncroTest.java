package com.gft.esempi.thread.sincronizzazione;

public class SyncroTest {
	public static void main(String[] args) {
		Tabella tabella = new Tabella();
		Thread t1 = new Thread1( tabella );
		Thread2 t2 = new Thread2( tabella );
		t1.start();
		t2.start();
	}
}
