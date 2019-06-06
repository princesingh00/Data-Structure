package com.bridgeit.datastructure;

public class LinkedList<T> {
	Node head;
	int length = 0;

	public class Node{
		T data;
		Node next;
	}

	public void add(T data) {

		Node node=new Node();
		node.data = data;
		node.next =null;

		if(head == null) {
			head = node;
		}

		else {
			Node n = head;
			while(n.next!= null) {
				n=n.next;
			}
			n.next= node;
		}

	}

	public void show() {

		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public int index(T item) {

		Node n = head;
		int index = 0;

		while(n.data != item) {
			index++;
			n = n.next;
		}	
		return index;

	}

	public void deleteat(int index) {

		Node n = head;
		Node n1 = null;
		if (head == null) {
			head = n;
		}
		for(int i= 0; i<index-1;i++)
		{
			n = n.next;
		}
		n1= n.next;
		n.next = n1.next;

	}

	public boolean search(T item) {

		Node n = head;
		if(head == null) {
			return false;
		}
		while(n.next!=null) {
			if(n.data .equals(item)) 
			{
				return true;
			}
			n =n.next;
		}	
		if (n.data .equals(item))
		{
			return true;
		}
		return false;	
	}

	public void insertat(int index,T item) {

		Node n = head;
		Node n1 = new Node();
		n1.data = item;

		if (head == null) {
			head = n1;
		}
		for(int i= 0; i<index-1;i++)
		{
			n = n.next;
		}
		n1.next = n.next;
		n.next = n1;

	}
	public boolean isempty() {

		if (head == null) {
			return true;
		}
		return false;
	} 

	public int size()
	{
		Node n = head;
		int counter =1;
		while(n.next!= null) {
			counter++;
			n = n.next;
		}
		return counter;
	}

	public void remove(T item) {

		Node n = head;
		Node n1 = n.next;

		if(n.data == item)
		{
			head = n.next;
		}

		while(n.next!=null && n1.next!= null){
			if(n1.data.equals(item))
			{
				break;
			}		
			n = n.next;
			n1 = n1.next;
		}	
		n.next = n1.next;

	}		

	public String getString() {

		String Output = " ";
		Node n = head;

		while(n.next!= null) {
			Output+= n.data + "";
			n=n.next;
		}
		Output+=n.next;

		return Output;
	}

	public T pop()
	{

		Node last = head;
		Node prevtolast = null;

		while(last.next!= null) {
			prevtolast = last;
			last=last.next;

		}
		prevtolast.next = null;

		return last.data;

	}

	public T pop(int pos)
	{
		Node n = head;
		Node n1 ;
		int i =0;

		while( i != pos) {
			n = n.next;
		}
		n1 = n.next;
		return n1.data;
	}


}






