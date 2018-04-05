package com.problem.solution;

public class Problem7 {

	// http://javaconceptoftheday.com/java-program-to-find-duplicate-elements-in-an-array/
	public static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     String s1 = recursiveMethod(str.substring(1)) + str.charAt(0);
	     System.out.println(s1);
	     return s1;
	}
	
	public static void main(String[] args) {
		
		String s = "Java";
		recursiveMethod(s);
	}
}
