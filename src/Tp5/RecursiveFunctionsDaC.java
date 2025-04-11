package Tp5;

public class RecursiveFunctionsDaC {
	
	public static String reverseString(String sentence) {
		
		if(sentence.length()==1) {
			return sentence;
		}
		else {
			return reverseString(sentence.substring(sentence.length()/2)) + reverseString(sentence.substring(0,sentence.length()/2));
		}
	}
}
