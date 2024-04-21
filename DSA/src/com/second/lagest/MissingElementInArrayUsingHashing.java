package com.second.lagest;

import java.util.HashSet;

public class MissingElementInArrayUsingHashing {
	public static void main(String[] args) {

		int arr[] =  {1,2,3,4,5,6,8};
		int n =arr.length;
		int missingElement = missingElement(arr, n);
		System.out.println("Missing element in array : "+ missingElement);
	}
	
	public static int missingElement(int arr[] , int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0 ; i < n-1 ; i++) {
			hs.add(arr[i]);
		}
		
		
		for(int i =1 ; i <= arr.length ; i++) {
			if(!hs.contains(arr[i]))
				return i;
		}
		return -1;
	}
}
