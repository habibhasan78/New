package com.sortingArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList_Method {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		
		alist.add(9);
		alist.add(10);
		alist.add(11);
		alist.add(12);
		alist.add(13);
		
		System.out.println("default order: "+alist);
		Collections.sort(alist);
		System.out.println("Ascending order: "+alist);
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("Descending order: "+alist);
		

	}

}
