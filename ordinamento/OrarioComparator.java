package com.gft.esempi.ordinamento;

import java.util.Comparator;

// implemento un comparatore esterno.
// se ho tanti parametri differenti degli oggetti, devo usare un 
// comparatore esterno!! nel momento in cui ho bisogno
// di numerosi criteri di comparazione

public class OrarioComparator implements Comparator<Orario> {

	@Override
	public int compare(Orario o1, Orario o2) {
		// restituisco il segno di o1 - o2:
		// negativo, 0, o positivo
		int compOre = o1.getOre() - o2.getOre();
		if(compOre != 0)
			return compOre;
		
		int compMin = o1.getMinuti() - o2.getMinuti();
		if(compMin != 0)
			return compMin;	
		
		int compSec = o1.getSecondi() - o2.getSecondi();
		return compSec;

	}
	
}
