package com.gft.esempi.reflection;

public class Elemento {

	public String nome;
	public String descrizione;
	
	// constructor vuoto
	public Elemento() {
		nome = "";
		descrizione = "";
	}

	@Override
	public boolean equals(Object object) {
		Elemento e = ( Elemento )object;
		if( e.getNome().equals( nome ) &&
			e.getDescrizione().equals( descrizione ) )
			return true;
		else return false;
	}

	public Elemento(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
