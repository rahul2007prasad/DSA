package com.second.lagest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionOfSortedArrayBruteForce {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,3,4,5,7};
		int arr2 [] = {0,3,4,6,9,8};
		int[] unionOfSortedArray = unionOfSortedArray(arr, arr2);
		for(int i=0; i< unionOfSortedArray.length ; i++)
			System.out.print(" "+unionOfSortedArray[i]);
	}
	public static int [] unionOfSortedArray(int arr[] ,int arr2[]) {
		Set<Integer> st = new HashSet<Integer>();
		for(int i = 0; i < arr.length  ; i++) {
			st.add(arr[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			st.add(arr2[i]);
		}
		int union[] = new int[st.size()];
		int j =0;
		
		Iterator<Integer> iterator = st.iterator();
		while(iterator.hasNext())
			union[j++] = iterator.next();
		
		return union;
	}
}
