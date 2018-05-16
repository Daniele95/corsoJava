package com.gft.esempi.astrazione;

public class PersonaTest {
	public static void main(String[] args) {
		
		// non posso istanziare la classe astratta Persona
		// ma posso istanziare un array
		Persona pers[] = new Persona[2];
		pers[0] = new Scolaro("daniele", "gamba", "matematica");
		pers[1] = new Lavoratore("marco", "gamba", 1000.);
		
		for(Persona p : pers)
			// sono sicuro che getDescrizione() è implementato in ciascuna
			// delle sottoclassi di Persona!! poiché l'ho definito come metodo astratto
			System.out.println(p.getDescrizione());
		
		
	}
}
