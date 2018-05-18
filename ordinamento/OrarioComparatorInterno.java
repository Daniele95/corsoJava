package com.gft.esempi.ordinamento;

// in questa classe implemento un comparatore
// interno alla classe

public class OrarioComparatorInterno implements Comparable<OrarioComparatorInterno> {
	
	private int ore;
	private int minuti;
	private int secondi;

	@Override
	public int compareTo(OrarioComparatorInterno o) {
		
		int compOre = this.getOre() - o.getOre();
		if(compOre != 0)
			return compOre;
		
		int compMin = this.getMinuti() - o.getMinuti();
		if(compMin != 0)
			return compMin;	
		
		int compSec = this.getSecondi() - o.getSecondi();
		return compSec;
	}
	
	public OrarioComparatorInterno(int ore, int minuti, int secondi) {
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public int getMinuti() {
		return minuti;
	}

	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}

	public int getSecondi() {
		return secondi;
	}

	public void setSecondi(int secondi) {
		this.secondi = secondi;
	}

	@Override
	public String toString() {
		return ore + " : " + minuti + " : " + secondi;
	}
	
}
