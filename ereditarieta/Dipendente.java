package com.gft.esempi.ereditarieta;

import java.util.Date;
import java.util.GregorianCalendar;

public class Dipendente {
	private String nome;
	private double stipendio;
	private Date assunzione;
	
	public Dipendente(String nome, double stipendio, int anno, int mese, int giorno) {
		this.nome = nome;
		this.stipendio = stipendio;
		
		GregorianCalendar c = new GregorianCalendar(anno, mese-1, giorno);
		Date assunzione = c.getTime();		
		this.assunzione = assunzione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public Date getAssunzione() {
		return assunzione;
	}
	public void setAssunzione(Date assunzione) {
		this.assunzione = assunzione;
	}
	
	
	
}
