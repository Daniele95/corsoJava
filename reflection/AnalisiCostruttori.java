package com.gft.esempi.reflection;

import java.lang.reflect.Constructor;

public class AnalisiCostruttori {
	public static void main(String[] args) {
		try {	// metto il try per controllare il ClassNotFoundExc.
			// con reflection si ragiona con gli oggetti Class
			// non si sa la tipologia restituita, quindi si mette ?
			// non posso cioè fare il cast poiché non so che cosa mi arriverà
			
			// insomma la riga che segue apre la classe, e alloca spazio in memoria
			// per ispezionarne il contenuto
			Class<?> classe = Class.forName( "com.gft.esempi.reflection.Elemento" );
			
			// controllo, se è effettivamente una classe <Elemento> la casto a elemento
			
			Constructor<?> elencoCostruttori[] = classe.getConstructors();
			
			
			for( int i = 0; i < elencoCostruttori.length; i++ ) {
				System.out.println( elencoCostruttori[i].toString() ); 
				
				Class<?> tipologiaParametri[] = elencoCostruttori[i]
						.getParameterTypes();
				if( tipologiaParametri.length == 0) {
					System.out.println( "Nessun parametro" );
					continue;
				}
				for( int j = 0; j < tipologiaParametri.length; j++ )
					System.out.println( tipologiaParametri[j].getName() );
				
			}
			
			
		} catch( ClassNotFoundException exc ) {
			System.out.println( "Elemento non trovato" );
		}
	}
}
