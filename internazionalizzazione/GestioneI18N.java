package com.gft.esempi.internazionalizzazione;

// java.text è un pacchetto che contiene tutti i formattatori
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GestioneI18N {
	
	public static void main(String[] args) {
		
		System.out.println( "\n<---Formattazione valuta--->" );
		stampaValuta( Locale.ITALY );
		stampaValuta( Locale.UK );
		stampaValuta( Locale.FRANCE );
		stampaValuta( Locale.US );
		
		System.out.println( "\n<---Formattazione valori numerici--->" );
		stampaValore( Locale.ITALY );
		stampaValore( Locale.UK );
		stampaValore( Locale.FRANCE );
		stampaValore( Locale.US );
		
		System.out.println( "\n<---Formattazione data--->" );
		stampaData( Locale.ITALY );
		stampaData( Locale.UK );
		stampaData( Locale.FRANCE );
		stampaData( Locale.US );
		
		System.out.println( "\n<---Formattazione orario--->" );
		stampaOrario( Locale.ITALY );
		stampaOrario( Locale.UK );
		stampaOrario( Locale.FRANCE );
		stampaOrario( Locale.US );
		
		System.out.println( "\n<---Formattazione data e ora--->" );
		// getDefault() stampa secondo il dispositivo che invoca
		stampaDataOrario( Locale.getDefault() );
		
		
	}
	
	private static void stampaValuta( Locale locale ) {
		double valore = 19000.7050;
		// importante NumberFormat
		NumberFormat formato = NumberFormat.getCurrencyInstance();
		String valoreFormattato = formato.format( valore );
		System.out.println( "\nValuta formattata"  + valoreFormattato +
				locale.getDisplayCountry() );
	}
	
	private static void stampaValore( Locale locale ) {
		double valore = 19000.7050;
		// importante NumberFormat
		NumberFormat formato = NumberFormat.getNumberInstance( locale );
		String valoreFormattato = formato.format( valore );
		System.out.println( "\nValuta formattata"  + valoreFormattato +
				locale.getDisplayCountry() );
	}

	private static void stampaData( Locale locale ) {
		// importante DateFormat
		DateFormat formato = DateFormat.getDateInstance( DateFormat.FULL, locale );
		Date date = new Date();
		String dataFormattata = formato.format( date );
		System.out.println( "\nData formattata" + dataFormattata +
				locale.getDisplayCountry() );
		GregorianCalendar calendario = new GregorianCalendar( 1978, 3, 11 );
		// importante SimpleDateFormat
		SimpleDateFormat formato2 = new SimpleDateFormat( "\ndd-MM-YYYY" );
		String dataFormattata2 = formato2.format( calendario.getTime() );
		System.out.println( "\nData formattata"  + dataFormattata2 +
				locale.getDisplayCountry() );
	}

	private static void stampaOrario( Locale locale ) {
		// importante DateFormat
		DateFormat formato = DateFormat.getTimeInstance( DateFormat.DEFAULT, locale );
		Date date = new Date();
		String dataFormattata = formato.format( date );
		System.out.println( "\nOrario formattato" + dataFormattata +
				locale.getDisplayCountry() ); 
	}

	private static void stampaDataOrario( Locale locale ) {
		GregorianCalendar calendario = new GregorianCalendar( 1978, 3, 11 );
		// importante SimpleDateFormat
		SimpleDateFormat formato = new SimpleDateFormat( "\ndd-MM-YYYY hh:mm:ss" );
		String dataOrarioFormattato = formato.format( calendario.getTime() );
		System.out.println( "\nData e orario formattati"  + dataOrarioFormattato +
				locale.getDisplayCountry() );

	}
}