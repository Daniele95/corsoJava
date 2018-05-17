package com.gft.esempi.patterncreazionali;

public class SingletonTest {
	public static void main(String[] args) {
		EsempioSingleton i = EsempioSingleton.getInstance();
		EsempioSingleton i2 = EsempioSingleton.getInstance(); // errore
		System.out.println(i.metodo());
		System.out.println(i2.metodo());
	}
}
