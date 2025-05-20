package EdabitChallenges;

import java.util.Arrays;

public class Challenges {

// You have a pack of 5 randomly numbered cards, which can range from 0-9. You can win if you can produce a higher two-digit number from your cards than your opponent. Return true if your cards win that round.
	
	public static boolean winRound(int[] you, int[] opp) {
		Arrays.sort(you);
		Arrays.sort(opp);
		
		if(you[you.length-1] > opp[opp.length-1]) {
			return true;
		}
		return false;
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
