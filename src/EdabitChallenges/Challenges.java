package EdabitChallenges;

public class Challenges {
	
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
}
