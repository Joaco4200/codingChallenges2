package Tp4;

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
			return (n) * factorial(n-1);
		}
	}
}
	