package com.problem.solution;

public class LinkedListDemo {

	class Node
	{
		private Node next;
		private int data;
		
		public Node(int data) {
		
		this.data = data;
		
		}

		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}		
	     
	}
	
	private Node head;
	
	public void add(int element)
	{
		Node node = new Node(element);
		if(head == null)
		{
			head = node;
			return;
		}
		else
		{
			Node current = head;
			while(current!=null)
			{
				if(current.getNext() == null)
				{
					current.setNext(node);
					return;
				}else
				{
					current = current.getNext();
				}
			}
		}
		
	}
	
	public void display()
	{
		if(head == null)
		{
			return;
		}else
		{
			Node temp = head;
			while(true)
			{
				if(temp == null)
				{
					return;
				}else
				{
					System.out.print(temp.getData()+"\t");
					temp = temp.getNext();
				}
			}
		}
	}
	
	public void reverseLinkedList()
	{
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next = previous;
			previous= current;
			current = next;
			
		}
		head = previous;
	}
	
	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
		demo.add(12);
		demo.add(13);
		demo.add(14);
		demo.add(15);
		demo.display();
		System.out.println();
		demo.reverseLinkedList();
		demo.display();
	}
	
}
