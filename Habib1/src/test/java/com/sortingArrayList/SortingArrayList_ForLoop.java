package com.sortingArrayList;

import java.util.Arrays;
public class SortingArrayList_ForLoop {

	public static void main(String[] args) {
		int[] number= {10,-3,18,5};
		
		Arrays.sort(number);
		
		for(int i=0; i<4; i++) {
			System.out.print(" " +number[i]);
		}
		System.out.println();
		
		for(int i=3; i>=0; i--) {
			System.out.print(" " +number[i]);
			
		}
	}

}
