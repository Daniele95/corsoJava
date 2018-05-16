package com.gft.esempi.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Esempiodate {

	public static void main(String[] args) {
		Studente1 s = new Studente1("massimo","bianchi",2000,10,1);
		System.out.println(s.nome);
		System.out.println(s.cognome);
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(s.nascita);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		
		
		
		//se voglio cambiare l'anno
		c.set(Calendar.YEAR, 2005);
	
		c.set(Calendar.DAY_OF_MONTH, 15);
		
		s.nascita = c.getTime();
		
	
	}

}
