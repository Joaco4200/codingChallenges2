package Tp6;

import java.util.List;

public class NodeExercises {

//Implementar un método que recorra la lista y cuente cuántos nodos contienen valores pares.
	public static int countPairNodeValues(Node node) {
		
		int counter= 0;
		
		while(node.getNext() != null) {
			if(node.getValue()%2 ==0) {
				counter++;
			}
			
			node=node.getNext();
		}
		return counter;
	}

//Crear un método que devuelva una nueva lista con los mismos elementos que la lista original, en el mismo orden.

	public static List cloneList(Node node) {
		
				
	}
//Crear un método que genere una nueva lista con los mismos valores pero en orden inverso.

//Crear un método que sume los valores de los nodos ubicados en posiciones pares (0, 2, 4, ...). 
}
