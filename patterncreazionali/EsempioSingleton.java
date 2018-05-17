package com.gft.esempi.patterncreazionali;

public class EsempioSingleton {

	int a = 1; // campo di prova
	
	// implemento il design pattern "singleton"
	private static EsempioSingleton istanza;
	
	private EsempioSingleton() {
		
	}
	
	public static EsempioSingleton getInstance() {
		if(istanza == null) {
			istanza = new EsempioSingleton();
		} else
			System.out.println("errore: impossibile creare più di un'istanza");
		return istanza;
	}
	
	public int metodo() {
		return a++;
	}
	
}
