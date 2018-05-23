package com.gft.esempi.thread;

public class EstensioneThread extends Thread {

	@Override
	public void run() {
		try {
			for( int i = 0; i <= 5; ++i ) {
				System.out.println( i );
				Thread.sleep( 1000 );
			}
		} catch ( InterruptedException e ) {
			System.out.println( "Thread interrotto" );
		}
	}
	
}
