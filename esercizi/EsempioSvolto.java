package com.gft.esempi.esercizi;


import java.util.HashMap;
import java.util.Map;

public class EsempioSvolto {
	
	public static void main(String[] args) {
		Map<String, Integer> vehicles = new HashMap<String, Integer>();
		
		// Add some vehicles.
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		
	}
}