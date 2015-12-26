package com.aap.list;

import java.util.ArrayList;

public class ArryalistDemo {

	public static void main(String[] args) {
		//Create Array list
		ArrayList list = new ArrayList();
		//size of array list
		System.out.println(list.size());
		//insert element in array list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		//after intializing array list
		System.out.println("A I S="+list.size());
		//elemnet in array list
		System.out.println(list);
	}
}
