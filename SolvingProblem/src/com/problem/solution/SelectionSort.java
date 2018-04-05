package com.problem.solution;

import java.util.Arrays;

public class SelectionSort {

	
	public static int [] selectionsort(int [] a)
	{
		int i,j,min,temp;
		for(i=0;i<a.length;i++)
		{
			min = i;
			for(j = i+1;j<a.length;j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			temp = a[min];
			a[min]= a[i];
			a[i] = temp;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		
		
		int [] a = {12,14,13,23,19,24,21};
		System.out.println(Arrays.toString(selectionsort(a)));
	}
}
