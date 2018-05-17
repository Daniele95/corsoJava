package com.gft.esempi.patterncreazionali;

import com.gft.esempi.ereditarieta.Dipendente;

public class FactoryTest {
	public static void main(String[] args) {
		Dipendente d = new Dipendente("Mario", 2000,2000, 10, 1);

		/*
		ImpiegatoDAOFactory = new ImpiegatoDAO();
		iDAO.create(d);
		*/
		// posso fare lo stesso senza istanziare:
		ImpiegatoDAOFactory.getFactory().create(d);
		// adesso avr� il dipendente,
		// ma non un'inutile istanza di ImpiegatoDAOFactory
		// istanza anonima che viene � gi� stata eliminata
		// e non usa memoria
		
		
	}
}
