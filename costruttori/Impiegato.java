package com.gft.esempi.costruttori;

public class Impiegato {
	
	private String nome;
	private String cognome;
	private double stipendio;
	
	// se non creo un costruttore, viene creato il costruttore di default vuoto
	// se uso il ctor vuoto posso comunque settare gli attributi
	// mediante getter (metodi ACCESSORI, che leggono) e setter (metodi MUTATORI, che scrivono)
	public Impiegato() {
	}
	
	public Impiegato(String nome, String cognome, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}

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

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}
	

}
