package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Ordered_List {

	static void addRemove(int num, LinkedList<Integer> list) {
		if (list.search(num)) {
			list.remove(num);
			System.out.println("found and removed");
			list.show();
		} else {
			list.add(num);
			System.out.println("number not found hence added");
			list.show();
			
		}
	}

	
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list = new LinkedList<>();
		
		File f1=new File("/home/user/integer.txt");
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str;
		str=br.readLine();
		
		if(str!=null) {
			System.out.println("File Contains are:"+str);
		}else System.out.println("File is empty");
		
		
		String[] strarr=str.split(" ");
	
		int [] intarr= new int[strarr.length];
		for(int i=0;i<strarr.length;i++) {
			intarr[i]=Integer.parseInt(strarr[i]);
		}
		
		int []sorting = new int[intarr.length];
		sorting = Utility.BubbleSort(intarr,strarr.length);
		for (int i = 0; i < sorting.length; i++) {
			list.add(sorting[i]);
		}
					
		System.out.print("Enter number to search : ");
		int number = Utility.getInteger();
		
		addRemove(number, list);

	}

}
