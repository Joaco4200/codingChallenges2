package CodeChallenges;

import java.util.ArrayList;

public class ChallengesHard {

//Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.
	
	 public static String actualMemorySize(String ms) {
		 ArrayList<Integer> nums= new ArrayList<>();
		 for (char n: ms.toCharArray()) {
			 if(Character.isDigit(n)){
				 nums.add(Character.getNumericValue(n));
			 }
		 }
		 
		 StringBuilder stringBuilder= new StringBuilder();
		 for(Integer n: nums) {
				 stringBuilder.append(n); 
		 }
		 
		 double value= Integer.parseInt(stringBuilder.toString());
		 double porcent= (7 * value) /100;
		 double finalvalue= value - porcent;
		 
		 if(ms.contains("G")) {
			 return finalvalue+ "GB";
		 }else {
			 return finalvalue+"MB";
		 }
	 }
}
