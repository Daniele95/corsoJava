package com.gft.esempi.ordinamento;

import java.util.Comparator;
import com.gft.esempi.costruttori.Impiegato;

import static java.lang.Math.*;

public class ImpiegatoComparator implements Comparator<Impiegato> {

	@Override
	public int compare(Impiegato o1, Impiegato o2) {
		return (int) signum(o1.getStipendio() - o2.getStipendio());
//		oppure confronto per nome
//		return o1.getNome().compareTo(o2.getNome());
	}

}
