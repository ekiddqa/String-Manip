package com.qa.main;

public class StringManip {
	public static int method1(String input) {
		return input.length();
	}
	
	public static String method2(String input) {
		String output = "";
		for(int i=0; i<= input.length()-1; i++) {
			if(input.charAt(i)==' ') {
				output += "\n";
			} else {
			output += input.charAt(i);
		
		} 
		 
	}
		return output;
	} // not sure how you'd do this within the string method limitations but that might because the question wants the letter order reversed in each word. This preserves the letter order in intra-words.
	public static String method3(String input) {
		String output ="";
		String interput = input;
		for(int i= input.length()-1; i>= 0; i--) {
			if(interput.contains(" ") == false) {
				output += input.substring(0,i+1);
				break;
			} else if(input.charAt(i)==' ') {
				interput = interput.substring(0,i);
				output += "\n";
			} else {
				output += input.substring(interput.lastIndexOf(' ')+1,i+1);
				interput = interput.substring(0,interput.lastIndexOf(' ')+1);
				i = interput.length();
			}
			// reverse whole input
			//print it out, replace space with \n
			//create a counter for every space in input
			//
	}	return output;
}	public static boolean method4(String input1, String input2) {
		return input1.contains(input2);
}
}
