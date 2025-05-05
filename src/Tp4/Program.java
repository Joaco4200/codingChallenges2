package Tp4;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		int num=2;
		System.out.println(RecursiveFunctions.itsevenorOdd(num));
		System.out.println(RecursiveFunctions.evenDigits(num));
		System.out.println(RecursiveFunctions.sumDigits(num));
		System.out.println(RecursiveFunctions.stringReverse("Hellooo"));
		System.out.println(RecursiveFunctions.factorial(5));
		System.out.println(RecursiveFunctions.sumNaturals(5));
		System.out.println(RecursiveFunctions.numString(5));
		System.out.println(RecursiveFunctions.sumbinaryDigits("101011"));
		System.out.println(RecursiveFunctions.fibonacci(7));
		RecursiveFunctions.permutations("abc", "");
	}	
}
