package com.problem.solution;

public class QuickSort {
	
	
	private int [] array;
	private int length;
	
	
	public void sort(int a[])
	{
		if(a == null ||a.length == 0)
		{
			return;
		}
		this.array = a;
		length = a.length;
		quicksort(0,length-1);
	}
	
	
	public void quicksort(int lowerIndex,int higherIndex)
	{
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex-lowerIndex)/2];
		while(i<=j)
		{
			while(array[i]<pivot)
			{
				i++;
			}
			while(array[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
				
			}
		}
		
		if(lowerIndex<j)
		{
			quicksort(lowerIndex, j);
		}
		
		if(i<higherIndex)
		{
			quicksort(i, higherIndex);
		}
		
	}
	
	
	
   public static void main(String[] args) {
	   
		
		QuickSort sorter = new QuickSort();
	   int [] a = {12,10,3,5,13,15};
	   sorter.sort(a);
	   for(int i: a)
	   {
		   System.out.print(i + " ");
	   }
}

}
