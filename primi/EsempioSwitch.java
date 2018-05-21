package com.gft.esempi.primi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EsempioSwitch {

	public static void main(String[] args) {
		// Date data = new Date(System.currentTimeMillis());
		// Date() prende in automatico la data del giorno
		Date data = new Date();

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(data); //trasforma il tempo in data
		int mese = c.get(Calendar.MONTH);
		String stagione;
		switch (mese) {
		case 11:
		case 0:
		case 1:
			stagione = "inverno";
			break;
		case 2:
		case 3:
		case 4:
			stagione = "primavera";
			break;
		case 5:
		case 6:
		case 7:
			stagione = "estate";
			break;
		case 8:
		case 9:
		case 10:
			stagione = "autunno";
			break;
		default:
			stagione = "non identificato";
		}
		System.out.println("Stagione attuale:" + stagione);

	}

}
