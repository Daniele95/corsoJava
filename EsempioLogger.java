package com.gft.esempi;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;;

public class EsempioLogger {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger( "log1", null );	// console-file
		//Logger logger2 = Logger.getLogger( "log1", null );	// console
		
		FileHandler fileHandler;
		
		try {
			// le seguenti righe mi permettono di scrivere su file
			fileHandler = new FileHandler("C:\\log\\logFile.log", true);
			logger.addHandler(fileHandler);
			logger.setLevel(Level.ALL);
			// se tolgo le seguenti due righe righe stamperò in XML
			SimpleFormatter formato = new SimpleFormatter();
			fileHandler.setFormatter(formato);
			//
			
			logger.log(Level.WARNING, "il primo log su file");
			logger.log(Level.SEVERE, "Il primo log solo in console");
						
		} catch (SecurityException exc) {
			System.out.println("non hai i permessi per scrivere nella directory");
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
}
