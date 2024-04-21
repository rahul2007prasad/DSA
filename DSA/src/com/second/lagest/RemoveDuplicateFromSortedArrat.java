package com.second.lagest;

public class RemoveDuplicateFromSortedArrat {

	public static void main(String[] args) {
		int arr[]= {2,3,3,4,4,5,6,7,7,9};
		int[] removeDuplicateArray = removeDuplicateArray(arr);
		
		for(int i = 0 ; i < removeDuplicateArray.length ;i++)
		 System.out.println("Array duplicate removal :"+ removeDuplicateArray[i]);
	}
	public static int[] removeDuplicateArray(int arr[]) {
		int i = 0;
		for(int j = 1; j< arr.length ; j++) {
			if(arr[i+1] != arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
			System.out.println("new arr"+arr[i]);
		}
		return arr;
	}
}
