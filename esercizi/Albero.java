package com.gft.esempi.esercizi;

import java.util.Scanner;
import static java.lang.Math.*;

public class Albero {

	public void stampaRombo( int jMax ) {
		
		for( int j = jMax-1; j >= -jMax+1; j-- ) {
			
			int iMax = jMax - abs( j );
			
			// stampo gli spazi opportuni a inizio riga
			for ( int k = 0; k < abs( j ); k++)
				if ( abs( j ) < 10) System.out.print("  ");
			//
			
			// stampo la j-esima riga e vado a capo
			if ( iMax == 1 ) System.out.print( iMax );
			else {
				for( int i = iMax; i >= - iMax; i-- ) {					
					if( i == 0 ) i-= 2;
					System.out.print( abs(i) + " ");					
				}
			}			
			System.out.println();
			//
		}
		
	}
		
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		
		System.out.print("Inserisci numero massimo: ");
		String s = in.nextLine();
		Albero rombo = new Albero();
		
		try {
			int jMax = Integer.parseInt(s);
			rombo.stampaRombo( jMax );		
			
		} catch( Exception e ) {
			System.out.println( "Input errato. Inserisci un numero!" );
		}
		in.close();

	}

}
