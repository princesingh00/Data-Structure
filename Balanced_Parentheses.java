package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Balanced_Parentheses {
	
	static boolean check(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
		
			char c = s.charAt(i);
			if (c == '(')
				stack.push(s.charAt(i));
			else if (c == ')')
				stack.pop();
		}
		return stack.isempty();
	}

	public static void main(String[] args) {

//		String expression = "(5+6)*(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		System.out.print("Enter your Expression : ");
		String expression = Utility.getString();
		String result = (check(expression)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
		
	}
}

