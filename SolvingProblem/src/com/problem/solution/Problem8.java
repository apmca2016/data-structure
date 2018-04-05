package com.problem.solution;

public class Problem8 {
	
	public static void reverseString(String s)
	{
		char[] c = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}
	
	public static void reverseStr(String s)
	{
		StringBuilder s1 = new StringBuilder(s);
		
		System.out.println(s1.reverse());
		
	}
	
	
	public static void main(String[] args) {
		String s="My name is anand";
		Problem8.reverseString(s);
		String s2 = s.substring(1);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		System.out.println("---------------------------------------->");
		Problem8.reverseStr(s);
		
	}

}
