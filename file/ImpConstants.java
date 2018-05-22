package com.gft.esempi.file;

public interface ImpConstants {
	// quanto vale ciascuna riga scritta dentro nel file
	// faccio il conto di quanto spazio occupa un impiegato:
	// int + String + String + stipendio
	// un int + 2 String da 20 caratteri + un double
	// int 4 bit, double 8 bit, char 2 bit, ho 40 char -> 92 bit
	int DIMENSIONE_RECORD = 92;
	int DIMENSIONE_DATI = 1000;
	String FILE_PATH = "C:\\Users\\Administrator\\Desktop\\impiegati.dat";
	// ricordo che nelle interfacce tutte le variabili sono automaticamente
	// 'public static final', quindi diventano costanti
	// i metodi invece sono di default 'public abstract'
	
	// per la serializzazione:
	String SER_PATH = "C:\\Users\\Administrator\\Desktop\\impiegati.ser";
}
