package Tp7.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void filaCaja() {
		Queue<String> fila= new LinkedList<>();
		
		fila.add("Juan");
		fila.add("Seba");
		fila.add("Belu");
		
		System.out.println("Fila:"+ fila);
		
		while(!fila.isEmpty()) {
			String person= fila.poll();
			System.out.println(person);
		}
	}
}
