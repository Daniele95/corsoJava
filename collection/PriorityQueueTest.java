package com.gft.esempi.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;



// il criterio di ordinamento di una PriorityCue sarà dato
// o da un comparatore, o dall'ordinamento naturale

public class PriorityQueueTest {
	public static void main(String[] args) {
		// utilità dei wrapper!! non posso inserire dati primitivi
		// dentro le collection
		Queue<Integer> coda = new PriorityQueue<Integer>();
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++)
			coda.offer(rand.nextInt(100));		
			// i dati vengono messi automaticamente
			// in un wrapper dal compilatore se necessario: AUTOBOXING
			// quindi in realtà ciò che sta succedendo è
			// coda.offer(new Integer(rand.nextInt(100)));
			
		// nel momento in cui passo un valore intero alla PriorityQueue
		// vengono inseriti, ordinati in modo naturale
		// verifico:
		for(int i = 0; i < 10; i++) {
			Integer dato = coda.poll();
			System.out.println("eliminato: " + dato);
		}
		System.out.println(coda);
		
		// creo una coda con ordinamento custom dato da me
		// cioè creo una coda di account
		// in cui sovrascrivo il metodo di ordinamento
		// della classe PriorityQueue
		// con il mio idComparator;
		Queue<Account> codaComparator = new PriorityQueue<Account>(idComparator);
		// lo riempio
		aggiungi(codaComparator);
		// lo pulisco
		elimina(codaComparator);
		
	}
	
	private static void elimina(Queue<Account> codaComparator) {
		while(true) {
			Account account = codaComparator.poll();
			if(account == null)
				break;
			System.out.println("Elaborazione del cliente: " 
				+ account.getId() + ", " + account.getUsername());
		}
	}

	private static void aggiungi(Queue<Account> codaComparator) {
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int id = rand.nextInt(100);
			codaComparator.offer(new Account(id, "Cliente" + id));
		}
	}

	// questo comparatore si inizializza come un'istanza anonima di 
	// una classe che implementa l'interfaccia Comparator
	public static Comparator<Account> idComparator = new Comparator<Account>() {
		@Override
		public int compare(Account o1, Account o2) {
			return o1.getId()- o2.getId();
		}		
	};
	
}
