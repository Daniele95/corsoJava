package com.gft.esempi.facciata;

public class ClasseFacade {
	
	private static ClasseFacade istanza;
	private ClasseFacade() {}
	
	// lo creo come singleton
	public static ClasseFacade getInstance() {
		if (istanza == null)
			istanza = new ClasseFacade();
		return istanza;
	}
	//
	
	public String getInfoBC1() {		
		return Business1.getInfo();
	}
	public String getInfoBC2() {		
		return Business2.getInfo();
	}
	public String getInfoBC3() {		
		return Business3.getInfo();
	}
}
