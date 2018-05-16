package com.gft.esempi.costruttori;

public class ImpiegatoTest {
	public static void main(String[] args) {
		//tipo	  reference  	
		Impiegato i = 			new Impiegato("gaio", "gatto", 2.00);
		Impiegato i2 = 			new Impiegato("mario", "matto", 3.00);
		Impiegato i3 = 			new Impiegato("gesu", "cristo", 4.00);
				
		Impiegato[] imp = new Impiegato[3];
		imp[0]= i;
		imp[1] = i2;
		imp[2] = i3;

		// in questo caso setto solo uno degli attributi
		Impiegato i4 = new Impiegato();
		i4.setNome("donna");
		
		
		for (Impiegato dip : imp)
			System.out.println(dip.toString());
	}
}
