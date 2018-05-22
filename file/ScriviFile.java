package com.gft.esempi.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ScriviFile implements ImpConstants {
	public static void main(String[] args) {
		creaFile();
	}

	private static void creaFile() {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile( FILE_PATH, "rw" );
			// creo una struttura vuota, e poi creo i dati
			// accedendo alla posizione che m'interessa
			Impiegato recordVuoto = new Impiegato();
			
			for( int i = 0; i < DIMENSIONE_DATI; i++ )
				recordVuoto.scrivi( file );
			System.out.println( "Creato file impiegati.dat" );
		} catch( IOException exc ) {
			System.out.println( "Errore nella scrittura del file" );
		}
		finally {
			// nel finally chiudo lo stream di file
			try {
				if( file != null )
					file.close();
			} catch( IOException exc ) {
				System.out.println( "Errore nella chiusura del file" );
			}
		}
	}
}
