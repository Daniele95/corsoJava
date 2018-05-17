package com.gft.esempi.interfacce;

import java.text.DecimalFormat;

public class FormaTest {
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("0.00");
		
		Forma[] forme = new Forma[3];
		forme[0] = new Cilindro(5, 2, 5.5, 9.0);
		forme[1] = new Punto(5,2);
		forme[2] = new Cerchio(5, 2, 5.5);
		
		for(Forma f : forme)
			// binding dinamico: chiamo metodi, riconosce lui a quali classi
			// dell'array polimorfico fanno riferimento
			System.out.println(
					f.getTipo() + "\n" + 
					"Area: " + 	formato.format(f.area()) + "\n" +
					"Volume: " + formato.format(f.volume()) + "\n" 
			);
		
		
	}
}
