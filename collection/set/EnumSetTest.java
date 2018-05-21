package com.gft.esempi.collection.set;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {
	private enum Mesi {
		GENNAIO, FEBBRAIO, MARZO, APRILE, MAGGIO, GIUGNO,
		LUGLIO, AGOSTO, SETTEMBRE, OTTOBRE, NOVEMBRE, DICEMBRE
	}
	
	public static void main(String[] args) {
		// tre casi di utilizzo: creo EnumSet da alcuni elementi di un enum, da 
		// un intero enum, o da un enum vuoto
		
		Set<Mesi> primoTrimestre = EnumSet.of( Mesi.GENNAIO, Mesi.FEBBRAIO, Mesi.MARZO );
		elaboraTipo( primoTrimestre );
		
		// il metodo allOf usa la Reflection, cioè l'ispezione della classe
		// (non dell'oggetto) per tirare fuori tutte le costanti
		Set<Mesi> tuttiMesi = EnumSet.allOf( Mesi.class );
		elaboraTipo( tuttiMesi );
		
		Set<Mesi> setVuoto = EnumSet.noneOf( Mesi.class );
		setVuoto.add( Mesi.NOVEMBRE );
		setVuoto.add( Mesi.DICEMBRE );
		
	}

	private static void elaboraTipo(Set<Mesi> set) {
		for( Mesi elemento: set )
			System.out.println( "elemento: " + elemento);
	}
	
}
