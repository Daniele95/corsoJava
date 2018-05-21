package com.gft.esempi.primi;

//import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Scanner;

public class EsempioArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti valori vuoi generare?");
int k = in.nextInt(); //10

System.out.println("Il valore pi\u00F9 alto da generare?");
	int n = in.nextInt(); //100
	int[] numeri = new int [n];
	
	for(int i = 0; i<numeri.length; i++) 
	numeri[i] = i +1;
	int[] risultato = new int [k];
	in.close();
	for(int i=0; i<risultato.length;i++) {
		int r= (int)(Math.random()*n);
risultato[i] = numeri [r];//serve a non usare i stessi numeri tra quelli random 
numeri [r]= numeri [n-1];
n--;
}
Arrays.sort(risultato);
	System.out.println("Array ordinato: ");
	for (int valore : risultato)
		System.out.println(valore);
	
	
	
	}

}
