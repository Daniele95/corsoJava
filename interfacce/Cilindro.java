package com.gft.esempi.interfacce;

import static java.lang.Math.*;

public class Cilindro extends Cerchio implements Forma {
	private double altezza;

	public Cilindro(int x, int y, double raggio, double altezza) {
		super(x, y, raggio);
		this.altezza = altezza;
	}

	@Override
	public double area() {
		return 2 * super.area() + 2 * PI * getRaggio() * altezza;
	}

	@Override
	public double volume() {
		return super.area() * altezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


}
