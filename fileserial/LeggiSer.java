package com.gft.esempi.fileserial;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.gft.esempi.file.ImpConstants;

public class LeggiSer implements ImpConstants {
	private static ObjectInputStream file;
	

	public static void main(String[] args) throws IOException {
		apriFile();
		leggiRecord();
		chiudiFile();
	}

	private static void leggiRecord() {
		ImpiegatoSer record;
		try {
			while( true ) {
				// IMPORTANTISSIMO: LEGGO L'OGGETTO SERIALIZZATO DAL FILE
				// QUESTO METODO DESERIALIZZA
				
				record = (ImpiegatoSer) file.readObject();
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
		} catch (ClassNotFoundException e) {
			// questa eccezione può essere data da file.readObject() se non trova il file
			e.printStackTrace();
		}
	}

	private static void apriFile() {
		try {
			// ISTANZIO IL FILE AD ACCESSO DIRETTO:
			file = new ObjectInputStream( new FileInputStream( SER_PATH ) );			
		} catch( IOException exc ) {
			System.out.println( "Errore nell'apertura del file" );
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
