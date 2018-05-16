package com.gft.esempi.composizione;

public class Computer {
	private CPU processore;
	private Mouse mouse;
	public Computer(CPU processore, Mouse mouse) {
		this.processore = processore;
		this.mouse = mouse;
	}
	@Override
	public String toString() {
		return "Computer [processore=" + processore + ", mouse=" + mouse + "]";
	}
	
}
