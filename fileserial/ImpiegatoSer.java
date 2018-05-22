package com.gft.esempi.fileserial;

import java.io.Serializable;

// creo un oggetto serializzabile, cioè che posso scrivere su file
// interamente in modo seriale

public class ImpiegatoSer implements Serializable {
	// valore generato da Eclipse per la serializzazione
	private static final long serialVersionUID = 1157874064158431182L;
	private int id;
	private String nome;
	private String cognome;
	private transient double stipendio;

	// devo creare per forza il costruttore vuoto poiché Java
	// non lo mette se ce n'è un altro (non vuoto)
	
	// COSTRUTTORE VUOTO OBBLIGATORIO PER L'ACCESSO RANDOM!!
	// NOTA BENE: lo baso sul costruttore con parametri
	// per creare un Impiegato con valori vuoti (ATTENZIONE: non un impiegato nullo,
	// cosa che avrei fatto con un costruttore vuoto public Impiegato() {}
	public ImpiegatoSer() {
		this( 0, "", "", 0 );
	}
	
	public ImpiegatoSer(int id, String nome, String cognome, double stipendio) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}
