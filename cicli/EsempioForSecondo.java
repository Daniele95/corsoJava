package com.gft.esempi.cicli;

import java.text.DecimalFormat;

public class EsempioForSecondo {
	public static void main(String[] args) {
		double deposito;
		double capitale = 1000.0;
		double tasso = .05;
		
		DecimalFormat formato = new DecimalFormat("0.00");
		String output = "Anno\t\tDeposito\n";
		for ( int anno = 1; anno <= 10; anno++) {			
			deposito = capitale * Math.pow( 1.0 + tasso, anno);
			output += "anno + \t\t" + formato.format(deposito) + "\n";
		}
		
		System.out.println(output);
	}
}
