package CodeChallenges;

import java.util.Arrays;

public class Challenges {

// Create a logarithm basic function.
	
	public static Object logarithm(Object base, Object num) {
		Object result= 0;
		int baseint= (int) base;
		int numint=(int) num;
		
		for(int i= 0; i<=numint ;i++) {
			if(Math.pow(baseint, i)== numint){
				result= i;
			}
		}
		return result;
	}

//Create a function that will test if a string is a valid PIN or not via a regular expression. Exactly 4 or 6 characters. Only numeric characters (0-9). No whitespace.
	
	public static boolean validate(String pin) {
		int counter= 0;
		for(char c:pin.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
			counter++;
		}
		if(counter == 4 | counter==6) {
			return true;
		}else {
			return false;
		}
	}

//Create a function which replaces all the x's in the string in the following ways: Replace all x's with "cks" UNLESS: The word begins with "x", therefore replace it with "z", The word is just the letter "x", therefore replace it with "ecks".

	public static String xPronunce(String sentence) {
		
		StringBuilder stringBuilder= new StringBuilder();
		String[] words = sentence.split(" ");
		for(String w: words) {
			if(w.equals("x")) {
				stringBuilder.append("ecks");
				stringBuilder.append(" ");
			}else if(w.charAt(0) == 'x') {
				stringBuilder.append('z' + w.substring(1));
				stringBuilder.append(" ");
			}else {
				stringBuilder.append(w.replace("x", "cks"));
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();
		
	}
	
// You have a pack of 5 randomly numbered cards, which can range from 0-9. You can win if you can produce a higher two-digit number from your cards than your opponent. Return true if your cards win that round.
	
	public static boolean winRound(int[] you, int[] opp) {
		Arrays.sort(you);
		Arrays.sort(opp);
		
		if(you[you.length-1] > opp[opp.length-1]) {
			return true;
		}
		return false;
	}
	
//Create a function that finds how many prime numbers there are, up to the given integer.
	
	public static int 	primeNumbers(int num) {
		for()
	}
	
//A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.
	
	public static boolean harshadNumber(int number) {
		if (number == 0) return false;

        int sumOfDigits = 0;
        int aux = number;

        while (aux > 0) {
            sumOfDigits += aux % 10;
            aux /= 10;
        }

        return number % sumOfDigits == 0;
	}
	

//You are counting points for a basketball game, given the amount of 3-pointers scored and 2-pointers scored, find the final points for the team and return that value ([2 -pointers scored, 3-pointers scored]).
	
	public static int basketpointsCounter(int doubles, int triples){
		return doubles * 2 + triples *3;
	}

//Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
	
	public static String if7Boom (int[] numbers) {
		for(int n: numbers) {
			if (n == 7) {
				return "Boom!";
			}
		}
		return "there is no 7 in the array";
	}

//Create a function that recursively counts the integer's number of digits.
	
	public static int digitSum(int num) {
		if(num<10) {
			return 1;
		}
		else {
			return 1+ digitSum(num/10);
		}
	}
}
