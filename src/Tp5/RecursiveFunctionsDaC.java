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
	
	public static int sumbinaryDigits(String binarystring) {
		
		if (binarystring.length() == 1)
            return binarystring.charAt(0) - '0';
		else {
			int mid= binarystring.length()/2;
			return sumbinaryDigits(binarystring.substring(0,mid)) + sumbinaryDigits(binarystring.substring(mid));
		}
	}
}

