package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Prime_Stack {

	public static void main(String[] args) {

		int[] prime = Utility.prime();
		int[] anagram = Utility.anagram(prime);

		Stack<Integer> anagramStack = new Stack<Integer>();

		for (int i = 0; i < anagram.length; i++) {
			anagramStack.push(anagram[i]);
		}
		System.out.println("Your Stack..");
		System.out.println();

		anagramStack.show();
		System.out.println();
		System.out.println("reversed Stack..");

		Stack<Integer> ReversedStack = new Stack<Integer>();

		while (anagramStack.length() > 0) {
			int stackpop = anagramStack.pop();
			ReversedStack.push(stackpop);
		}
		ReversedStack.show();
	}

}
