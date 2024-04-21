package com.second.lagest;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {1,3,5,2,6,8,4,6};
		int key =0;
		System.out.println("Found at" + linearSearching(arr, key));
	}
	
	public static int linearSearching(int [] arr ,int key) {
		for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
}
