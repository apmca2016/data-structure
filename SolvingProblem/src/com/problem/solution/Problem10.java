package com.problem.solution;

public class Problem10 {
	
	public static void removeAllSpace(String s)
	{
		char[] c = s.toCharArray();
		
		StringBuilder s1 = new StringBuilder();
		for(int i=0;i<c.length;i++)
		{
			if((c[i] != ' ') && (c[i] != '\t'))
			{
				s1.append(c[i]);
			}
		}
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		String s = "My name is anand";
		String s1 = s.replaceAll("\\s","");
		System.out.println(s1);
		removeAllSpace(s);
	}
}
