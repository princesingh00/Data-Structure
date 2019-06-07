package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Banking_CashCounter {

	
	public static void main(String args[]) {
			
		int amount = 1000;		
		
	    System.out.print("Number of peoples coming to bank : ");
	    int people = Utility.getInteger();
	     
	    Queue<String> queue = new Queue<>();
	    
	    for(int i =0; i<people ;i++) {
	    	System.out.print("Enter the name of person : ");
	    	String name = Utility.getString();
	    	queue.enqueue(name);	    	
	    }
	    System.out.println();
	    System.out.println("Your Queue as follow /");
    	queue.print();	    	

    	for(int i =0; i<people ;i++) {
	    System.out.println("what do you want ?");
	    System.out.println("1. Cash Deposit ");
	    System.out.println("2. Cash Withdraw ");
	    int ch  = Utility.getInteger();

	    switch(ch) {
	    
	    case 1: {
		    System.out.print("Enter Cash : ");
		    long cash = Utility.getInteger();
		     
		    amount += cash;
	    }break;
	    
	    case 2: {
		    System.out.print("Enter Cash : ");
		    long cash = Utility.getInteger();
		     if(cash>amount) {
		    System.out.print("Invalid cash, Enter cash less than " + amount);
		    }
		     	    amount -= cash;
	    }break;
	    
	    default : System.out.print("Invalid choice");
	    break;
	    }
	    
	    queue.dequeue();	
	    System.out.println();
	    System.out.println("Your Queue as follow /");
    	queue.print();	    
    
	}
	}
	
	
    
}
