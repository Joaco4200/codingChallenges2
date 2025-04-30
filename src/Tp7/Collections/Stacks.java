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

//2.Invertir una palabra utilizando una pila.
	
	public static String reverseWord(String word) {
		
		Stack<Character> pila= new Stack<>();
		
		for(char c:word.toCharArray()) {
			pila.push(c);
		}
		
		StringBuilder reversedword= new StringBuilder();
		while(!pila.isEmpty()) {
			reversedword.append(pila.pop());
		}
		
		return reversedword.toString();
	}
	
	
//3. Implementar una función que copie una pila sin modificar la original.
	
	public static <T> Stack<T> copyStack(Stack <T> originalStack) {
		Stack<T> copy= new Stack<>();
		for(T t: originalStack) {
			copy.push(t);
		}
		return copy;
	}
	
//4. Contar cuántos elementos hay en una pila sin usar size().
	
	public static <T> int countElements(Stack<T> stack){
		Stack<T> copy= new Stack<>();
		int counter=0;
		
		while(!stack.isEmpty()) {
			copy.push(stack.pop());
			counter++;
		}
		
		while(!copy.isEmpty()) {
			stack.push(copy.pop());
		}
		return counter;
	}
}
