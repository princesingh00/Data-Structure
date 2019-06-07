package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Numberof_BST {

	public static void main(String[] args) {
		System.out.print("Ënter the number of nodes in between 1 to 10 : ");
		int nodes = Utility.getInteger();

		long noOfBinaryTree = numofBST(nodes);
		System.out.println("For the entered nodes, possible Binary Tree Search combinations are.. "+ noOfBinaryTree);

	}


	static long numofBST(int number) {
		
//		formula -- (2n)!/(n+1)!*n!
		
       long num1 = Utility.factorial(2*number);
       long num2 = Utility.factorial(number + 1);
       long num3 = Utility.factorial(number);
       
     	return num1/(num2*num3);
	}
}







