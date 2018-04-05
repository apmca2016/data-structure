package com.problem.solution;

public class DemoStack {
	
	private int [] a;
	
	private int size;
	
	private int capacity;
	
	
	public DemoStack()
	{
		capacity = 10;
		a = new int[capacity];
	}
	
	public DemoStack(int capacity)
	{
		this.capacity = capacity;
		a = new int[capacity];
	}
	
	public void add(int val)
	{
		if(size == capacity)
		{
			altercapacity();
		}
		a[size] = val;
		size++;
	}
	
	public void altercapacity()
	{
		int[] temp = a;
		capacity = 2 * capacity;
		a = new int[capacity];
		for(int i = 0;i<temp.length;i++)
		{
			a[i] = temp[i];
		}
		
	}
	
	public void print()
	{
		for(int i = 0;i<size;i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
	public int remove()
	{
		int obj = a[size-1];
		size--;
		return obj;
	}
	
	public void insert(int val,int index)
	{
		if(size == capacity)
		{
			altercapacity();
		}
		int temp1 = 0;
		int temp2 = val;
		for(int i=index;i<size;i++)
		{
			temp1 = a[i];
			a[i] = temp2;
			temp2 = temp1;
		}
		a[size] = temp2;
		size++;
	}
	
	public static void main(String[] args) {
		DemoStack ds = new DemoStack();
		ds.add(34);
		ds.add(45);
		ds.add(23);
		ds.add(14);
		ds.add(15);
		ds.print();
		ds.remove();
		ds.print();
		ds.insert(15, 4);
		ds.print();
	}

}
