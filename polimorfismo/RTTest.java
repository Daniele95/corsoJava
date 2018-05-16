package com.gft.esempi.polimorfismo;

public class RTTest {
	public static void main(String[] args) {

		R r1 = new R();
		T t1 = new T();

		R[] array = new R[2];

		array[0] = r1;
		array[1] = t1;

		for (R elemento : array)
			System.out.println(elemento.metodo());
	}
}
