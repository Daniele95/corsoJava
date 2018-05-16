package com.gft.esempi.astrazione;

public abstract class Persona {

	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		// è come se ci fosse qui il costruttore vuoto
		// super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public abstract String getDescrizione();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
}
