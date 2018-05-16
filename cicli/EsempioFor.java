package com.gft.esempi.cicli;

public class EsempioFor {
	public static void main( String[] args ) {
		int valore;
		String output = "";
		for ( int i = 1; i <= 20; i++) {
			valore = 1 + (int)(Math.random() * 6);
			output += valore + " " ;
			if ( i%5 == 0 )
				output += "\n";
		}
		
		System.out.println( output );
		
	}
}
