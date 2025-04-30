package Tp7.Collections;

import java.util.Stack;

public class Stacks {
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
