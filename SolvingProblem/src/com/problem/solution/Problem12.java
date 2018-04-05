package com.problem.solution;

public class Problem12 {
  
	
	public static int sum(int [] a) {
		int s =0;
		for(int i=0;i<a.length;i++)
		{
			s = s + a[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		int [] a1 = {1,2,3,5,6,7,8,9,10};
		int x = sum(a)-sum(a1);
		
		System.out.println(x);
		
		
		
		
	}
}
