package com.gft.esempi.thread;

public class RunnableTest implements Runnable {
	
	public static void main(String[] args) {
		new RunnableTest();
	}
	
	
	public RunnableTest() {
		Thread tCorrente = Thread.currentThread();
		tCorrente.setName( "Thread principale" );
		Thread tCreato = new Thread( this, "Child Thread" );
		System.out.println( "Thread corrente" + tCorrente);
		System.out.println( "Thread creato" + tCreato);
		tCreato.start();
		try {
			Thread.sleep( 10000 );
		} catch ( InterruptedException e ) {
			System.out.println( "Main Thread interrotto" );
		}
		System.out.println( "Termine del main Thread" );
		
	}

	
	@Override
	public void run() {
		// specifica le operazioni che verranno eseguite dal Thread creato
		try {
			for( int i = 10; i > 0; i-- ) {
				System.out.println( i );
				Thread.sleep( 1000 );
			}
		} catch ( InterruptedException e ) {
			System.out.println( "Main Thread interrotto" );
		}
	}
	
}
