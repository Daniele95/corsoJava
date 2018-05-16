package com.gft.esempi.ereditarieta;

public class DipendenteTest {
	public static void main(String[] args) {
		Dipendente d = new Dipendente("Daniele", 1900.00, 1995, 2, 8);
		Dirigente dr = new Dirigente("Marco", 1900.00, 1995, 2, 8, 200.);
		CEO c = new CEO("Barro", 1900.00, 1995, 2, 8, 200., 2000., "Maserati");
		
		// creo un array polimorfico
		Dipendente dipendenti[] = new Dipendente[3];
		dipendenti[0] = d;
		dipendenti[1] = dr;
		dipendenti[2] = c;
		
		for(Dipendente dip : dipendenti) {
			// uso il binding dinamico, cioè la capacità
			// di usare il metodo getStipendio() corretto a seconda
			// dell'oggetto che mi arriva
			System.out.println(dip.getNome() + " guadagna " + dip.getStipendio());	
			if(dip instanceof CEO)
				// casto il dipendente a CEO
				// (infatti tutti i CEO sono dipendenti, non potrei fare il contrario)
				// poiché dip è un Dipendente, anche se è un'istanza di CEO
				System.out.println(dip.getNome() + " ha una " + ((CEO) dip).getAuto());
		
		}
	}
}
