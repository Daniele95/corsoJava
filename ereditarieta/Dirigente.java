package com.gft.esempi.ereditarieta;

public class Dirigente extends Dipendente {

	private double bonus;
	
	// il costruttore vuoto non è definito per la classe super
	// quindi devo implementare un costruttore non vuoto
	public Dirigente (String nome, double stipendio, int anno, int mese, int giorno, double bonus) {
		super(nome, stipendio, anno, mese, giorno);
		this.bonus = bonus;
	}

	
	@Override
	public double getStipendio() {
		return super.getStipendio() + bonus;
	}


	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	
}
