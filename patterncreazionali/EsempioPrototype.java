package com.gft.esempi.patterncreazionali;

public class EsempioPrototype implements Cloneable {

	protected int j;
	

	// parte di implementazione del design pattern Prototype
	@Override
	protected Object clone() {
		
		// la superclasse è Object
		// (tutte le classi estendono Object)
		// super.clone() restituisce un Object
		// quindi devo castarlo alla mia classe
		
		try {
			EsempioPrototype e = (EsempioPrototype)super.clone();
			return e;
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
	}
	//

}
