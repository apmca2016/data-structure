package com.problem.solution;

public class StackDemo {

	private int [] elements;
	
	private int capacity;
	
	private int size;
	
	
	public StackDemo()
	{
		capacity = 10;
		elements = new int[capacity];
	}

	public StackDemo(int capacity)
	{
		this.capacity = capacity;
		elements = new int [capacity]; 
	}
	
	public void add(int value)
	{
		if( size == capacity)
		{
			altercapacity();
			
		}
		elements[size] = value;
		size++;
	}
	
	public void altercapacity()
	{
		int [] temp = elements;
		int newcapacity = 2  * capacity;
		elements = new int [newcapacity];
		for(int i= 0;i<temp.length;i++)
		{
			elements[i] = temp[i];
		}
		
	}
	
	public void print()
	{
		for(int i =0;i<size;i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();
	}
	
	public int remove() {
		int obj = elements[size-1];
		size--;
		return obj;
	}
	
	public int get()
	{
		return elements[size-1];
	}
	
	public static void main(String[] args) {
		
		StackDemo demo = new StackDemo();
		demo.add(90);
		demo.add(23);
		demo.add(50);
		demo.add(60);
		demo.print();
		System.out.println(demo.remove());
		demo.print();
		demo.add(55);
		demo.print();
	}
	
	
	
}
