package com.problem.solution;

import java.util.HashSet;

public class Problem11 {
	
	
	public static void commonElelment(String [] s2,String [] s3)
	{
		HashSet<String> h1 = new HashSet<>();
		for(int i=0;i<s2.length;i++)
		{
			for(int j=0;j<s3.length;j++)
			{
				if(s2[i].equals(s3[j]))
				{
					h1.add(s2[i]);
				}
			}
		}
		System.out.println(h1);
	}

	public static void main(String[] args) {
		
		String [] s2 = {"one","two","three","four","five","six"};
		
		String [] s3 = {"two","three","four","seven","eight","nine"};
		Problem11.commonElelment(s2, s3);
		
		
	}
}
