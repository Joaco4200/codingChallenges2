package Collections;

import java.util.ArrayList;

public class ArrayLists {
	
//1. Agregar 10 números enteros a una ArrayList y mostrar solo los pares.
	
	public static ArrayList<Integer >showPairs(ArrayList<Integer> nums) {
		ArrayList <Integer> pairsList= new ArrayList<>();
		
		for(int c: nums) {
			if(c%2 == 0) {
				pairsList.add(c);
			}
		}
		return pairsList;
	}
	
//2. Leer una lista de nombres e imprimirlos en orden inverso.
	
	public static void reverseNames(ArrayList<String> names){
		System.out.println((ArrayList<String>) names.reversed()); //casteo de List a ARRAYlist
	}
	
//3. Eliminar todos los elementos mayores a 50 de una ArrayList de enteros.
	
	public static void deletehighNums(ArrayList<Integer> nums) {
		nums.removeIf(n -> n>50);
		System.out.println(nums);
	}
	
//4. Crear una ArrayList de strings y verificar si contiene una palabra específica.
	
	public static boolean existingWord(ArrayList<String> words, String word) {
		for(String s:words) {
			if(s==word) {
				return true;
			}
		}
		return false;
	}
	
//5. Sumar todos los elementos de una ArrayList de números flotantes.
	
	public static float sumElements(ArrayList<Float> nums) {
		float result=0;
		for(Float n:nums) {
			result+=n;
		}
		return result;
	}

	public static int sumevenNums(ArrayList <Integer> list) {
		int counter= 0;
		for(int c:list) {
			if(c%2==0) {
				counter+=c;
			}
		}
		return counter;
	}
	
	public static ArrayList<String> norepeateStrings(ArrayList <String> array){
		ArrayList<String> newArray = new ArrayList<>();
		
		for(String s:array) {
			if(!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		return newArray;
	}
}
