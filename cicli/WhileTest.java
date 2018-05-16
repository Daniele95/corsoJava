package com.gft.esempi.cicli;

import javax.swing.JOptionPane;

public class WhileTest {
	public static void main(String[] args) {
		int promossi = 0;
		int bocciati = 0;
		int studenti = 1;
		int risultato;
		String input;
		String output;
		while ( studenti <= 10 )
		{
			input = JOptionPane.showInputDialog( "Risultato: 1 passato, 2 fallito" );
			risultato = Integer.parseInt( input );
			if ( risultato == 1 )
				promossi += 1;
			else
				bocciati += 1;
			studenti += 1;	
		}
		output = "Promossi: " + promossi + "\nBocciati: " + bocciati;
		if ( promossi > 7 )
			output += "\nOttimo risultato!!";
		JOptionPane.showMessageDialog( null, output, "Analisi", JOptionPane.INFORMATION_MESSAGE );
		System.exit(0);
	}
}
