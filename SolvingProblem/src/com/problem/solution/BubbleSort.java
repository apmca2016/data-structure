package com.problem.solution;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static int[] sort(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
			{
				break;
			}
			
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		
		int [] input = {12,14,13,23,19,24,21};
		System.out.println(Arrays.toString(sort(input)));
		
	}

}
