package Tp3;

import java.util.ArrayList;

public class Program {
	
	public static void main(String[] args) {
		
		String sentence= "Hola buenos dias saludos";
		System.out.println(WordsCounter.wordCounter(sentence));
		
		String sentencee= "Hola buenos dias saludos";
		System.out.println(WordsCounter.vowelsandconsonantsCounter(sentencee));
		
		String sentenceee= "Hola buenos dias saludos";
		System.out.println(WordsCounter.wordswithxLarge(sentenceee, 6));
		
		String file= "/Users/joaquinscarone/txtexample.txt";
		System.out.println(WordsCounter.getfileLines(file));
		
		String filee= "/Users/joaquinscarone/txtexample.txt";
		ArrayList<String> fileLines= WordsCounter.getfileLines(file);
		System.out.println(WordsCounter.filewordsCounter(fileLines));
	}
}
