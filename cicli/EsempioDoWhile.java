package com.gft.esempi.cicli;

import java.util.Scanner;

public class EsempioDoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("Capitale depositato durante l\'anno: ");
		double capitale = in.nextDouble();
		
		System.out.println("Tasso interesse: ");
		double tassoInteresse = in.nextDouble();
		
		double bilancio = 0;
		int anni = 0;
		String input;
		do {
			bilancio += capitale;
			double interessi = bilancio * tassoInteresse / 100;
			bilancio += interessi;
			anni++;
			System.out.println("Dopo " + anni + "il bilancio totale è: " + bilancio);
			System.out.println("Terminare? (S|N)");
			input = in.next();
					
		} while(input.equalsIgnoreCase("N"));
		in.close();
	}
}
