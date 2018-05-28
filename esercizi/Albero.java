package com.gft.esempi.esercizi;

import java.util.Scanner;
import java.lang.Math.*;

public class Albero {

	public static void stampaRombo( int jMax ) {
		
		for( int j = jMax-1; j >= -jMax+1; j-- ) {
			
			int iMax = jMax - Math.abs( j );
			if (Math.abs( j ) > 10) System.out.print("           ");
			
			// stampo gli spazi opportuni
			for ( int k = 0; k < Math.abs( j ); k++) {
				if (Math.abs( j ) > 10) System.out.print("  ");
				else System.out.print("   ");
			}
			//
			
			if ( iMax == 1 ) System.out.print( iMax );
			else {
				for( int i = iMax; i >= - iMax; i-- ) {					
					if( i == 0 ) i-= 2;
					System.out.print( Math.abs(i) + " ");					
				}
			}			
			System.out.println();		
		}	
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		
		System.out.print("Inserisci numero massimo: ");
		String s = in.nextLine();
		
		try {
			int jMax = Integer.parseInt(s);
			stampaRombo( jMax );		
			
		} catch( Exception e ) {
			System.out.println( "Input errato. Inserisci un numero!" );
		}
		in.close();

	}

}
