 package com.bridgeit.datastructure;

public class Runner {
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(55);
		list.add(57);
		list.add(59);
		list.add(359);
		list.add(595);
		list.add(559);
		list.add(5677);
//		list.show();
//		list.deleteat(2);
//		list.remove(359);
//		System.out.println(list.search(5677));
//		list.insertat(2,100);
		list.show();
		System.out.println();
//		System.out.println("After removing ");
		System.out.println(list.pop());
		list.show();

//		list.remove(559);
//		list.remove(59);
//	    list.remove(55);
//		list.show();
//		System.out.println(list.isempty());
//		System.out.println("List size : " + list.size());
//		System.out.println("Item index : " + list.index(559));
	}
	
}
