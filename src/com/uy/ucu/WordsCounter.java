package com.uy.ucu;

//Desarrollo un metodo que cuente la cantidad de palabras dentro de una oracion, declaro un entero como contador, y un bucle for (que inicio en el indice 1 y lo finalizo en -1, para evitar que caracteres al principio o final de la oracion se cuente como una palabra, y dentro del bucleo cheque si encuentra un caracter que no es una letra sumo una palabra al contador

public class WordsCounter {
	
	public static int wordCounter(String sentence) {
		
		int counter= 0;
		for(int i=1	; i< sentence.length()-1; i++) {
			
			if(!Character.isLetter(sentence.charAt(i))) {
				counter++;
			}
		}
		
		return counter +1;
			
		}
	
	public static String vowelsandconsonantsCounter(String sentence) {
		
		int vowelCounter= 0;
		int consonantCounter= 0;
		String vowels= "aeiouAEIOU";
		
		for(char c: sentence.toCharArray()) {
			if(vowels.indexOf(c) != -1) {
				vowelCounter++;
			}
			else {
				consonantCounter++;
			}
		}
		
		return 
	}
}

