package com.gft.esempi.fileserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.gft.esempi.file.ImpConstants;

public class CreaFile implements ImpConstants {
	// questo oggetto serve per usare il processo di serializzazione
	// e scrivere tutto l'oggetto su file
	private static ObjectOutputStream file;
	private static Scanner in;
	
	public static void main(String[] args) throws IOException {
		apriFile();
		aggiungiRecord();
		chiudiFile();
	}

	private static void aggiungiRecord() {
		ImpiegatoSer record = new ImpiegatoSer();
		int id = 0;
		String nome;
		String cognome;
		double stipendio;
		in = new Scanner( System.in );
		System.out.println( "Inserire i dati dell\'impiegato: " );
		while( in.hasNext() ) {
			try {
				id = in.nextInt();
				nome = in.next();	// non nextLine() poiché leggo i dati sulla stessa riga
				cognome = in.next();
				stipendio = in.nextDouble();
				if( id > 0 ) {
					record = new ImpiegatoSer( id, nome, cognome, stipendio );
					// IMPORTANTE!! SERIALIZZO L'OGGETTO
					file.writeObject( record );
				} else {
					System.out.println( "Id non valido" );
				}
			} catch ( IOException exc ) {
				System.out.println( "Errore nella scrittura del file" );
				return;
			}
			catch ( NoSuchElementException exc ) {
				System.out.println( "Dati non validi ");
			}
		}	
	}

	private static void apriFile() {
		try {
			// ISTANZIO IL FILE AD ACCESSO DIRETTO:
			file = new ObjectOutputStream( new FileOutputStream( SER_PATH ) );			
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
