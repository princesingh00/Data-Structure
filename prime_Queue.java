package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class prime_Queue {

	public static void main(String[] args) {

		int[] prime = Utility.prime();
		int[] anagram = Utility.anagram(prime);

		Queue<Integer> QUEUE = new Queue<Integer>();

		for (int i = 0; i < anagram.length; i++) {
			QUEUE.enqueue(anagram[i]);
		}
		
		System.out.println("Your Queue..");
		System.out.println();
		QUEUE.print();

	}
}
