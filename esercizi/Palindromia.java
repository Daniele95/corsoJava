package com.gft.esempi.esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Palindromia {


	static List<Character> listaOrdinata(String stringa) {
		List<Character> list = new ArrayList<Character>();
		Set<Character> unique = new HashSet<Character>();
		for(char c : stringa.toCharArray()) {
		    list.add(c);
		    unique.add(c);
		}
		Collections.sort(list);
		return list;
		
	}
	
	static boolean anagramma(List<Character> lista, List<Character> lista2 ) {

		boolean uguali = true;
	    for (Character temp : lista) {
	    		if (! lista2.contains(temp) )
	    			uguali = false;
	    }
	    for (Character temp : lista2) {
    		if (! lista.contains(temp) )
    			uguali = false;
	    }	    
	    return uguali;
		
	}
	
	
	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		System.out.println( "Inserisci due parole: ");
		String stringa = in.next();
		String stringa2 = in.next();
		in.close();
		
		List<Character> lista = listaOrdinata(stringa);
		List<Character> lista2 = listaOrdinata(stringa2);
		
	    
	    System.out.println(anagramma(lista, lista2));
	}
		
	
	
}
