package com.gft.esempi.composizione;

public class ComputerTest {
	public static void main(String[] args) {
		CPU processore = new CPU("Intel");
		Mouse mouse = new Mouse("Logic");
		Computer c = new Computer(processore,mouse);
		c.toString();
		System.out.println(c.toString());
	}
}
