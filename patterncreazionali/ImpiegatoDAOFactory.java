package com.gft.esempi.patterncreazionali;

import com.gft.esempi.ereditarieta.Dipendente;

public class ImpiegatoDAOFactory {
	
	// implementazione design pattern FACTORY
	private ImpiegatoDAOFactory() {}
	
	public static ImpiegatoDAOFactory getFactory() {
		return new ImpiegatoDAOFactory();
	}
	//
	
	public void create(Dipendente d) {
		Dipendente dip[] = new Dipendente[1];
		dip[0] = d;
		
	}
}
