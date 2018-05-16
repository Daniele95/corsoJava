package com.gft.esempi.date;

import java.util.Date;
import java.util.GregorianCalendar;

public class Studente1 {
	String nome;
	String cognome;
	Date nascita;
	
	public Studente1 (String nome, String cognome, int anno, int mese, int giorno) {
		this.nome = nome;        //usa this per evitare ambiguità tra il nome di un comando e una variabile
		this.cognome = cognome;
		GregorianCalendar c = new GregorianCalendar(anno,mese,giorno);
		nascita = c.getTime(); //c è il calendario, il comando getTime permette di trasformarla in una data utile
		
		
	}


}
