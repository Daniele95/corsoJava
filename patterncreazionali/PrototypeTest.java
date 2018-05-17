package com.gft.esempi.patterncreazionali;

public class PrototypeTest {
	public static void main(String[] args) {
		EsempioPrototype o1 = new EsempioPrototype();
		o1.j = 10;
		EsempioPrototype o2 = o1; // sbagliato!!
		EsempioPrototype o3 = (EsempioPrototype)o1.clone(); // sbagliato!!
		
		o3.j = 20;
		System.out.println(o1.j);
		System.out.println(o2.j);
		System.out.println(o3.j);
		
		
	}
}
