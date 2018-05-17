package com.gft.esempi.interfacce;

public interface Forma {
	
	String DESCRIZIONE = "Tipologia Forma: ";
	double area();
	double volume();
	String getTipo();
	default String getDescrizione() {
		return this.getClass().getSimpleName();
	}
	
}
