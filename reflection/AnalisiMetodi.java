package com.gft.esempi.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnalisiMetodi {
	public static void main(String[] args) {
		try {
			String stringa = new String();
			// altro metodo di reflection: invece di class.forName
			// faccio un getClass considerando già un certo tipo, la Stringa
			Class<?> classe = stringa.getClass();
			
			Method elencoMetodi[] = classe.getDeclaredMethods();
			
			for( int i = 0; i < elencoMetodi.length; i++ ) {
				Method metodo = elencoMetodi[i];
				System.out.println( metodo.toString() );
				System.out.println( Modifier.toString( metodo.getModifiers() ) );
				
				Class<?> tipologiaParametri[] = metodo.getParameterTypes();
				
				if( tipologiaParametri.length == 0 )
					System.out.println( "Il metodo non contiene parametri" );
				else
					System.out.println( "Il metodo contiene i seguenti parametri" );
				for( int j = 0; j < tipologiaParametri.length; j++ ) {
					System.out.println( tipologiaParametri[j].getName() );
					Class<?> tipoRitorno = metodo.getReturnType();
					System.out.println( tipoRitorno.getName() );
					
					Class<?> tipoEccezioni[] = metodo.getExceptionTypes();
					if( tipoEccezioni.length == 0 )
						System.out.println( "Il metodo non solleva eccezioni" );
					else
						System.out.println( "Il metodo solleva le seguenti eccezioni" );
					
					for( int x = 0; x < tipoEccezioni.length; x++ )
						System.out.println( tipoEccezioni[x].getName() );
					
				}
			}
			
		} finally {}
	}
}
