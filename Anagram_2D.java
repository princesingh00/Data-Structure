package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Anagram_2D {

	public static void main(String args[]) {

		int[] array = Utility.prime();
		int[] array1 = Utility.anagram(array);
		int k =0;
		
		int [][] a = new int[79][2]; 

		for(int i =0 ; i < 79; i++) {
			for(int j =0 ; j < 2 ; j++) {
				
				a[i][j] = array1[k];
				k++;      			
			}
		}
		for(int i =0 ; i < 79; i++) {
			for(int j =0 ; j <  2; j++) {
				System.out.print(a[i][j] + " ");	
			}	
			System.out.println();
		}
		}
}
