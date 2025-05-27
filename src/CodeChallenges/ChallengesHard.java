package CodeChallenges;

import java.util.ArrayList;
import java.util.Collections;

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
	 
//Create a solution that can format the dmv number into a plate number with correct grouping. The function input consists of string s and group length n. The output has to be upper case characters and digits. The new groups are made from right to left and connected by -. The original order of the dmv number is preserved.

	 public static String licensePlate(String code, int group) {
		  code= code.replace("-", "");
		  code.toUpperCase();
		  ArrayList<String> codegroups= new ArrayList<>();
		  
		  for(int i= code.length(); i>0; i-=group) {
			  int inicio= Math.max(i-group, 0);
			  codegroups.add(code.substring(inicio,i));
		  }
		  Collections.reverse(codegroups);
		  
		  String result= String.join("-", codegroups);
		  return result;
	  }

//Given a YouTube URL, extract the video ID and return it as a string.
	 
	 public static String youtubeId(String link) {
		}

}
