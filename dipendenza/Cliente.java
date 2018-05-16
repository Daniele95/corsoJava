package com.gft.esempi.dipendenza;

public class Cliente {
	private String nome;
	private double statoCredito;
	public Cliente(String nome, double statoCredito) {
		this.nome = nome;
		this.statoCredito = statoCredito;
	}
	
	public double getCredito() {
		return statoCredito;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", statoCredito=" + statoCredito + "]";
	}
	
	
}
