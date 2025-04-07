package Tp4;

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
	
	public static boolean evenNumbers(int n) {
		
		if(n%2 != 0) {
			return false;
		}
		else if(n<=0 & n%2 == 0) {
			return true;
		}
		
		else {
			return evenNumbers(n/10);
		}
	}
}
