package com.gft.esempi.ordinamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Orario> lista = new ArrayList<Orario>();
		Orario[] array = new Orario[4];
		
		lista.add(new Orario(5, 10, 10));
		lista.add(new Orario(3, 15, 12));
		lista.add(new Orario(5, 5, 10));
		lista.add(new Orario(5, 5, 4));
		
		array[0] = new Orario(5, 10, 10);
		array[1] = new Orario(3, 15, 12);
		array[2] = new Orario(5, 5, 10);
		array[3] = new Orario(5, 5, 4);
		
		ArrayList<Orario2> lista2 = new ArrayList<Orario2>();
		
		lista2.add(new Orario2(5, 10, 10));
		lista2.add(new Orario2(3, 15, 12));
		lista2.add(new Orario2(5, 5, 10));
		lista2.add(new Orario2(5, 5, 4));
		
		
		Collections.sort(lista, new OrarioComparator());
		Arrays.sort(array, new OrarioComparator());
		
		System.out.println("lista: ");
		for(Orario o : lista)
			System.out.println(o.toString());

		System.out.println("<----------------->");

		System.out.println("array: ");
		for(Orario o : array)
			System.out.println(o.toString());		

		System.out.println("<----------------->");		

		Collections.sort(lista2);
		System.out.println("lista: ");
		for(Orario2 o : lista2)
			System.out.println(o.toString());


	}
}
