package com.gft.esempi.esercizi;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeriPrimi {
	
	static boolean isPrimo(int i) {
		boolean b = false;
		for ( int j = 2; j < i; j++ ) {
			if ( i % j == 0 ) break;
			if (j == i-1) b = true;
		}
		return b;		
	}
	
	public static ArrayList<Integer> primi (int n) {
		ArrayList<Integer> primi = new ArrayList<Integer>();
		for ( int i = 1; i < n; i++ ) {
			if ( isPrimo(i) ) primi.add( i );
		}
		return primi;
	}	
	
	public static void main(String[] args) {		
		Scanner in = new Scanner (System.in);
		System.out.print( "Inserisci numero: ");
		String s = in.next();
		int i = Integer.parseInt(s);
		if (isPrimo(i)) System.out.print(i+" è primo!");
		else System.out.print(i+" non è primo!");
		in.close();
	}
}
		

