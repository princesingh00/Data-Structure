package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Palindrome_Deque {

	public static void main(String args[]) {

		System.out.print("Enter the String :");
		String string = Utility.getString();

		Deque palindrome = new Deque();

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			palindrome.addRear(c);
		}
		
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			char c = palindrome.RemoveRear();
			str = str + c;
		}

		if (string.equals(str)) {
			System.out.println("Palidrome..");
		} else {
			System.out.println("Not Palindrome..");
		}
	}
}
