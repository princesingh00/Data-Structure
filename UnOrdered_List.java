package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;


public class UnOrdered_List
{
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		String[] string = Utility.buffer();
		for(int i = 0; i<string.length; i++) {
		list.add(string[i]);
		}
		list.show();
		System.out.println(); 
		System.out.println("Enter the word to search ");
	    String userinput = Utility.getString();
	    
	    if(list.search(userinput) == true) {
	    	list.remove(userinput);
	    }
	    else {
	    	list.add(userinput);
	    }
		list.show();
		
		
	}
	}

		