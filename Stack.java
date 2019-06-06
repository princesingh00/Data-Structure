package com.bridgeit.datastructure;

import java.util.EmptyStackException;

public class Stack<T> {

	Listnode top;
	int length;

	public class Listnode {
		T data;
		Listnode next;

		public Listnode(T data) {
			this.data = data;
		}	
	}

	public void stack() {
		top = null;
		length = 0;		
	}

	public int length() {
		return length;
	}

	public boolean isempty() {
		return length == 0;
	}

	public void push(T data) {

		Listnode temp = new Listnode(data);
		temp.next = top;
		top = temp;
		length++;
	}

	public T pop() {
		if(isempty()) {
			throw new EmptyStackException();
		}
		T result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public T peak() {

		if(isempty()) {
			throw new EmptyStackException();
		}		
		return top.data;
	}	


}
