package com.uy.ucu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
			if(Character.isLetter(c)) {
				if(vowels.indexOf(c) != -1) {
					vowelCounter++;
				}
				else {
					consonantCounter++;
				}
			}
		}
		
		return "Vowels:" + vowelCounter + " " + "Consonant:" + consonantCounter;
	}
	
	
	public static String wordswithxLarge(String sentence, int large) {
		
		int wordsCounter= 0;
		String[] words= sentence.split(" ");
		for(String c: words) {
			if(c.length() >= large) {
				wordsCounter++;
			}
		}
		return "Words:" + wordsCounter;
	}
	
	public static ArrayList<String> getfileLines(String file) {
		
		ArrayList<String> output = new ArrayList();
		int counter= 0;
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			String lineaActual= br.readLine();
				
			while(lineaActual != null) {
				output.add(lineaActual);
				counter++;
				lineaActual= br.readLine();
			}
			
			br.close();
		
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
		
		output.add("Lines:"+ counter);
		return output;
	}
	
	public static String filewordsCounter(ArrayList<String> fileLines) {
		int counter=0;
		for(String line: fileLines) {
			String[] words = line.trim().split("\\s+");
	        counter += words.length;
		}
		
		return "File words:" + counter;
	}
	
}


