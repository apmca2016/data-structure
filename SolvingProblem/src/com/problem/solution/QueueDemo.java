package com.problem.solution;

public class QueueDemo {

	private int [] queue;
	
	private int size;
	private int capacity;
	
	public QueueDemo()
	{
		capacity = 5;
		queue = new int[capacity];
	}
	
	public QueueDemo(int capacity)
	{
		this.capacity = capacity;
		queue = new int [capacity];
	}
	

	 public void enqueue(int val)
	 {
		 if(size ==  capacity)
		 {
			 System.out.println("Queue is full");
			 //altercapacity();
		 }
		 else
		 {
			 altercapacity();
		 }
		 queue[size] = val;
		 size++;
	 }
	 
	 public void altercapacity() {
		 
		 int [] temp = queue;
		 capacity = 2 * capacity;
		 queue = new int [capacity];
		 for(int i=0;i<temp.length;i++)
		 {
			 queue[i] = temp[i];
		 }
	}
	
	public int dequeue()
	{
		int obj = queue[0];
		for(int i=0;i<size-1;i++)
		{
			queue[i] = queue[i+1];
		}
		size--;
		return obj;
		
	}
	
	public int get(int index)
	{
		int obj =0;
		if(index<0 || index>=size)
		{
			return obj;
		}
		return queue[index];
	}
	
	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueDemo demo = new QueueDemo();
		demo.enqueue(12);
		demo.enqueue(14);
		demo.enqueue(13);
		demo.enqueue(15);
	    demo.enqueue(16);
	    demo.enqueue(17);
		demo.print();
		demo.dequeue();
		demo.print();
		demo.enqueue(18);
		demo.print();
		System.out.println(demo.get(2));
	}
}
