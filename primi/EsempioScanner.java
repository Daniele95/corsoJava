package com.gft.esempi.primi;

import java.util.Scanner;;

public class EsempioScanner {
	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in );
		System.out.println( "Inserire il nominativo: " );
		String nome = in.nextLine();
		System.out.println( "Inserire l\'età: ");
		int eta = in.nextInt();
		System.out.println( "Nominativo: " + nome + ", età: " + eta );
		in.close();
	}
}
