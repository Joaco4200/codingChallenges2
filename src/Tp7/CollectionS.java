package Tp7;

import java.util.Stack;

public class CollectionS {
//1. Simular una pila de platos: apilar y desapilar varios elementos.
	public static void Plates(){
		
		Stack<String> plates= new Stack<>();
		
		plates.push("Red plate");
		plates.push("Blue plate");
		plates.push("White plate");
		
		while(!plates.isEmpty()) {
			plates.pop();		}
	}

//
}
