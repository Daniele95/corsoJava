package com.gft.esempi.interfacce;

public class Punto implements Forma {

	private int x;
	private int y;
	
	public Punto(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double area() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public String getTipo() {
		return DESCRIZIONE + getDescrizione();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
