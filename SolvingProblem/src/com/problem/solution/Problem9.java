package com.problem.solution;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem9 {
	
	
	public static void dublicateString(String [] arr)
	{
		 // List<String> list = new ArrayList<>();
		
// this technique is called Brute Force method.this method is not recommended in real time. It gives time complexity of O(n^2).
		
		Set<String> s1 = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				 String s =null;
				if(arr[i] == arr[j] && i!=j)
				{
					System.out.println(arr[j]);
					s = arr[j];
				}
			}	
			s1.add(arr[i]);
		}
		System.out.print(s1);
	}
	
	
	public static void dublicateStr(String [] s)
	{
		// using HashSet ,This method is better than the Brute Force method. It gives O(n) performance.
		HashSet<String> h1 =  new HashSet<>();
		for(String arrayelement: s)
		{
			if(!h1.add(arrayelement))
			{
				System.out.println("Dublicate Elelment is:" + arrayelement);
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		String [] s = {"anand","aman","ashish","amit","andri","anand"};
		Problem9.dublicateStr(s);
		
	}
	
}
