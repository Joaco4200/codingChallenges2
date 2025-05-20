package Recursion;

import java.util.ArrayList;

public class RecursiveFunctions {
	
//Determine recursivamente si un número dado es par o impar, usando sólo la operación resta.
	
	public static String itsevenorOdd(int n) {
		
		if(n==0) {
			return  "Its even";
		}
		else if(n==1) {
			return "Its odd";
		}
		else {
			return itsevenorOdd(n-2);
		}
	}

//Construir un algoritmo recursivo que permita determinar si los dígitos de un numero dado son todos pares.
	
	public static boolean evenDigits(int n) {
		
		if(n%2 != 0) {
			return false;
		}
		else if(n<=0 & n%2 == 0) {
			return true;
		}
		
		else {
			return evenDigits(n/10);
		}
	}
	
//Suma de los dígitos de un número: Escribe un método recursivo que calcule la suma de los dígitos de un número entero. El método debe aceptar un solo parámetro: el número entero del cual se calculará la suma de los dígitos.

	public static int sumDigits(int n) {
		
		n= Math.abs(n);
		
		if(n<10) {
			return n;
		}
		else {
			return n%10 + sumDigits(n/10);
		}
	}
	
//Impresión de una cadena en orden inverso: Escribe un método recursivo que imprima una cadena dada en orden inverso. El método debe aceptar un solo parámetro: la cadena que se imprimirá en orden inverso.

	public static String stringReverse(String sentence) {
		
		if(sentence.length() == 0){
			return sentence;
		}
		else {
			return sentence.substring(sentence.length()-1) + stringReverse(sentence.substring(0,sentence.length()-1));
		}	
	}
	
//Cálculo del factorial de un número: Escribe un método recursivo que calcule el factorial de un número entero.
	
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		else {
			return n * factorial(n-1);
		}
	}

//Cálculo de la suma de los primeros n números naturales: Escribe un método recursivo que calcule la suma de los primeros n números naturales.

	public static int sumNaturals(int n) {
		if(n==1) {
			return n;
		}
		else {
			return n + sumNaturals(n-1);
		}
	}

//Impresión de números naturales en orden ascendente: Escribe un método recursivo que imprima todos los números naturales desde 1 hasta n en orden ascendente.
	
	public static String numString(int n) {
		if(n==1) {
			return String.valueOf(n);
		}
		else {
			return numString(n-1) + String.valueOf(n);
		}
	}

//Cálculo de la suma de los dígitos de un número binario: Escribe un método recursivo que calcule la suma de los dígitos de un número binario.

	public static int sumbinaryDigits(String binarystring) {
		if(binarystring.length()==0) {
			return 0;
		}
		else{
			int lastdigit= Integer.parseInt(""+binarystring.charAt(binarystring.length()-1));
			return lastdigit + sumbinaryDigits(binarystring.substring(0,binarystring.length()-1));
		}
	}

//Generación de todas las permutaciones de una cadena: Escribe un método recursivo que genere todas las permutaciones de los caracteres de una cadena dada. Por ejemplo, las permutaciones de la cadena "abc" son "abc", "acb", "bac", "bca", "cab" y "cba".

	public static void permutations(String sentence, String permutation) {
		if(sentence.length()==0) {
			System.out.println(permutation);
		}
		else {
			for(int i=0; i<sentence.length(); i++) {
				char c= sentence.charAt(i);
				String next= sentence.substring(0,i) + sentence.substring(i+1);
				permutations(next,permutation + c);
			}
		}
	}
	
//fibonacci
	
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
	