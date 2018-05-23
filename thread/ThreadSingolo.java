package com.gft.esempi.thread;

public class ThreadSingolo {
	public static void main( String[] args ) {
		Thread thread = Thread.currentThread();
		thread.setName( "Main Thread" );
		thread.setPriority( 10 );
		System.out.println( "Thread in esecuzione: " + thread );
		
		try {
			for( int i = 5; i > 0; i-- ) {
				System.out.println( "" + i );
				Thread.sleep( 2000 );
			}
		} catch( InterruptedException e ) {
			System.out.println( "Thread interrotto in modo errato" );
		}
	}
}
