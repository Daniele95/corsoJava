package com.gft.esempi.astrazione;

public class Lavoratore extends Persona {

	private double stipendio;

	public Lavoratore(String nome, String cognome, double stipendio) {
		super(nome, cognome);
		this.stipendio = stipendio;
	}

	@Override
	public String getDescrizione() {
		return this.getClass().getSimpleName() + " ha stipendio " + stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
	
}
