package com.gft.esempi.astrazione;

public class Scolaro extends Persona {

	private String titolo;
	
	public Scolaro(String nome, String cognome, String titolo) {
		super(nome, cognome);
		this.titolo = titolo;
	}
	
	@Override
	public String getDescrizione() {
		return this.getClass().getSimpleName() + " ha come titolo " + titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
}
