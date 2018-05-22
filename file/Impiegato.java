package com.gft.esempi.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Impiegato {
	private int id;
	private String nome;
	private String cognome;
	private double stipendio;
	
	// devo creare per forza il costruttore vuoto poiché Java
	// non lo mette se ce n'è un altro (non vuoto)
	
	// NOTA BENE: lo baso sul costruttore con parametri
	// per creare un Impiegato con valori vuoti (ATTENZIONE: non un impiegato nullo,
	// cosa che avrei fatto con un costruttore vuoto public Impiegato() {}
	public Impiegato() {
		this( 0, "", "", 0 );
	}
	
	public Impiegato(int id, String nome, String cognome, double stipendio) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}
	
	// il metodo di lettura deve avere in argomento per forza RandomAccessFile
	// del pacchetto java.io, accesso DIRETTO o random
	public void leggi( RandomAccessFile file ) throws IOException {
		setId( file.readInt() );
		setNome( leggiNominativo( file ) );
		setCognome( leggiNominativo( file ) );
		setStipendio( file.readDouble() );
	}

	public void scrivi( RandomAccessFile file ) throws IOException {
		file.writeInt( getId() );
		scriviNominativo( file, getNome() );
		scriviNominativo( file, getCognome() );		
		file.writeDouble( getStipendio() );
	}

	public String leggiNominativo(RandomAccessFile file) throws IOException {
		// divide la stringa in sequenza di caratteri per poter fare la lettura
		// carattere per carattere
		// uso il char, quindi devo già impostare la lunghezza massima per nome e cognome
		char nominativo[] = new char[20];
		char temp;
		for( int i = 0; i < nominativo.length; i++ ) {
			temp = file.readChar();
			nominativo[i] = temp;
		}
		// la String ha costruttore che prende un array di caratteri
		// in questa new String, nell'ultimo indice aggiunge in automatico '\0'
		// per terminare la stringa, come in C
		// quindi lo rimpiazzo
		return new String( nominativo ).replace( '\0',  ' ' );
	}
	
	public void scriviNominativo(RandomAccessFile file, String nome2) {
		
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
