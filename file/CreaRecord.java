package com.gft.esempi.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreaRecord implements ImpConstants {
	
	// file dev'essere usato dal metodo main che è static, quindi lo metto static
	private static RandomAccessFile file;
	private static Scanner in;
	
	public static void main(String[] args) throws IOException {
		apriFile();
		aggiungiRecord();
		chiudiFile();
	}

	private static void aggiungiRecord() throws IOException {
		Impiegato record = new Impiegato();
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
				
				if( id > 0 && id <= DIMENSIONE_DATI ) {
					record.setId( id );
					record.setNome( nome );
					record.setCognome( cognome );
					record.setStipendio( stipendio );
					
					// OCCHIO!! LA COSA PIU' IMPORTANTE:
					// questo metodo riceve come metodo la posizione alla quale
					// voglio scrivere. leggo la posizione dalla chiave d'inserimento!!
					// devo moltiplicare per la dimensione in memoria del dato
					// che inserisco, in C sizeOf(Impiegato)
					file.seek( ( id - 1 ) * DIMENSIONE_RECORD );
					record.scrivi( file );					
				} else {
					System.out.println( "Id non valido" );
				}
			} catch ( IOException exc ) {
				System.out.println( "Errore nella scrittura del file" );
				return;
			}
			catch ( NoSuchElementException exc ) {
				System.out.println( "Dati non validi ");
				in.next(); // avanzo di una riga per inserire i dati nuovi
			}
		}
	}

	private static void apriFile() {
		try {
			// ISTANZIO IL FILE AD ACCESSO DIRETTO:
			file = new RandomAccessFile( FILE_PATH, "rw" );			
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
