package com.gft.esempi.cicli;

import java.lang.Math;

public class calcoloCapitale {
	public static void main(String[] args) {

		System.out.println("Capitale depositato durante l\'anno: ");
		double capitale = 1000;
		
		System.out.println("Tasso interesse: ");
		double tassoInteresse = .05;
		
		double capitaleTotale = 0;
		for( int i = 0; i < 10; i++ )
		{
			capitaleTotale = capitale * Math.pow(  ( 1 + tassoInteresse ), i );
			System.out.println("Dopo " + i + " anni il bilancio totale è: " + capitaleTotale);
		}

	}
}