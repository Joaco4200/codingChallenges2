package CodeChallenges;

import java.util.ArrayList;

public class ChallengesHard {

//Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.
	
	 public static String actualMemorySize(String ms) {
		 ArrayList<Integer> nums= new ArrayList<>();
		 for (int n: ms.toCharArray()) {
			 if(Character.isDigit(n)){
				 nums.add(n);
			 }
		 }
		 StringBuilder stringBuilder= new StringBuilder();
		 for(int n: nums) {
			 stringBuilder.append(n);
		 }
		 
		 long value= Long.parseLong(stringBuilder.toString());
		 long finalvalue= value * (7/100);
		 
		 if(ms.contains("G")) {
			 return finalvalue+ "GB";
		 }else {
			 return finalvalue+"MB";
		 }
	 }
}
