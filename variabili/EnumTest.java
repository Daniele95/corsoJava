package com.gft.esempi.variabili;

public class EnumTest {
	
	public static void main(String[] args) {
		Trimestre.stampa();
		Trimestre t1 = Trimestre.FEBBRAIO;
		System.out.println( t1.ordinal() );
		System.out.println( t1.name() );
	}
	
	public enum Trimestre { 
		
		GENNAIO, FEBBRAIO, MARZO;
		
		public static void stampa() {
			System.out.println("\nStampo i valori: ");
			for(Trimestre t: Trimestre.values() )
				System.out.println(t);
		}
		
	}
	
}
