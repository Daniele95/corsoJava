package com.gft.esempi.file;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeggiRecord extends CreaRecord implements ImpConstants {
	// file dev'essere usato dal metodo main che è static, quindi lo metto static
	private static RandomAccessFile file;
	public static void main(String[] args) throws IOException {
		apriFile();
		leggiRecord();
		chiudiFile();
	}


	private static void leggiRecord() {
		Impiegato record = new Impiegato();
		try {
			while( true ) {
				do {
					record.leggi(file);
				} while( record.getId() == 0 );
				System.out.printf(  "%-20d%-20s%-20s%-10.2f\n",
						record.getId(),
						record.getNome(),
						record.getCognome(),
						record.getStipendio()  );
			}
		} catch( EOFException exc ) {
			return;
		} catch( IOException exc ) {
			System.out.println( "Errore nella lettura del file" );
		}
	}


	private static void apriFile() {
		try {
			// ISTANZIO IL FILE AD ACCESSO DIRETTO:
			file = new RandomAccessFile( FILE_PATH, "r" );			
		} catch( IOException exc ) {
			System.out.println( "Il file non esiste" );
		}
	}

	private static void chiudiFile() {
		try {
			if( file != null )
				file.close();
		} catch( IOException exc ) {
			System.out.println( "Errore nella chiusura del file" );
		}
	}
	
}
