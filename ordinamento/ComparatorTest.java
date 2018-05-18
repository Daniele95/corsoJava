package com.gft.esempi.ordinamento;

// Nota bene: se ho un comparatore interno, non posso 
// usare un comparatore esterno (me lo segnerebbe come errore)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.gft.esempi.costruttori.Impiegato;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Orario> lista = new ArrayList<Orario>();
		Orario[] array = new Orario[4];
		ArrayList<OrarioComparatorInterno> lista2 = new ArrayList<OrarioComparatorInterno>();
		ArrayList<Impiegato> lista3 = new ArrayList<Impiegato>();
		
		lista.add(new Orario(5, 10, 10));
		lista.add(new Orario(3, 15, 12));
		lista.add(new Orario(5, 5, 10));
		lista.add(new Orario(5, 5, 4));
		
		array[0] = new Orario(5, 10, 10);
		array[1] = new Orario(3, 15, 12);
		array[2] = new Orario(5, 5, 10);
		array[3] = new Orario(5, 5, 4);
		
		lista2.add(new OrarioComparatorInterno(5, 10, 10));
		lista2.add(new OrarioComparatorInterno(3, 15, 12));
		lista2.add(new OrarioComparatorInterno(5, 5, 10));
		lista2.add(new OrarioComparatorInterno(5, 5, 4));
		
		lista3.add(new Impiegato("Daniele", "Gamba", 2000));
		lista3.add(new Impiegato("Marco", "Gamba", 1800));
		
		
		Collections.sort(lista, new OrarioComparator());
		Arrays.sort(array, new OrarioComparator());
		Collections.sort(lista2);
		Collections.sort(lista3, new ImpiegatoComparator());
			
		
		System.out.println("lista: ");
		for(Orario o : lista)
			System.out.println(o.toString());

		System.out.println("<----------------->");

		System.out.println("array: ");
		for(Orario o : array)
			System.out.println(o.toString());		

		System.out.println("<----------------->");		

		System.out.println("lista con comparatore interno: ");
		for(OrarioComparatorInterno o : lista2)
			System.out.println(o.toString());
		
		System.out.println("<----------------->");		

		System.out.println("ordino impiegati per stipendio (comparatore esterno): ");
		for(Impiegato o : lista3)
			System.out.println(o.toString());

	}
}
