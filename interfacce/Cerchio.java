package com.gft.esempi.interfacce;

import static java.lang.Math.*;

public class Cerchio extends Punto implements Forma {

	private double Raggio;

	public Cerchio(int x, int y, double raggio) {
		super(x, y);
		Raggio = raggio;
	}
	
	// non devo per forza implementare area(), volume(), getTipo()
	// poiché sono già implementati nella classe Punto
	// da cui eredito
	// sovrascrivo solo area() poiché cambia

	@Override
	public double area() {
		return PI * pow(Raggio, 2);
	}

	public double getRaggio() {
		return Raggio;
	}

	public void setRaggio(double raggio) {
		Raggio = raggio;
	}
	

}
