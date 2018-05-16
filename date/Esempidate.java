package com.gft.esempi.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Esempidate {

	public static void main(String[] args) {
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	Date data= new Date();
	System.out.println(formato.format(data));

	DateFormat formato2 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, Locale.ITALIAN);
	System.out.println(formato2.format(data));
	//locale mi permette di avere l orario in una determinata lingua, se fai Locale.getDefault() in qutomatico prende l orario del pc da cui scrivi
	
	
	
	SimpleDateFormat formato3 = new SimpleDateFormat ("dd/MM/yyyy");
	String StrDAta = "10/10/2000";
	GregorianCalendar c = new GregorianCalendar();
	try { 
		c.setTime(formato3.parse(StrDAta));
		System.out.println(c.get(Calendar.YEAR));
	}
	catch(ParseException exc) {
		exc.getMessage();
	}
	}
	
	
	}


