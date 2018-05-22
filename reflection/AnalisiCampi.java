package com.gft.esempi.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class AnalisiCampi {
	public static void main(String[] args) {
		try {
			Class<?> classe = Class.forName( "com.gft.esempi.reflection.Elemento" );
			
			Field campiIstanza[] = classe.getDeclaredFields();
			
			for( int i = 0; i < campiIstanza.length; i++ ) {
				Field campo = campiIstanza[i];
				System.out.println( campo.getName() );
				System.out.println( campo.getType() );
				System.out.println( Modifier.toString( campo.getModifiers() ));
				
			}
			
		} catch( ClassNotFoundException exc ) {
			System.out.println( "Elemento non trovato" );
		}
	}
}
