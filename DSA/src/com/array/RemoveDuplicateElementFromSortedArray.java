package com.array;

public class RemoveDuplicateElementFromSortedArray {

	public static void main(String[] args) {
		
		RemoveDuplicateElementFromSortedArray remSort = new RemoveDuplicateElementFromSortedArray();
		System.out.println("Remove duplicate element form sorted array");
		int [] arr= new int []{1,1,2,2,3,3,3,3,4,4,4,4,6,6,6,6,7,7,7,9};
	  

		int removeDuplicate = remSort.removeDuplicate(arr);
		
		for (int i = 0; i < removeDuplicate; i++)
			System.out.println(arr[i]);
	}
	
	public int  removeDuplicate(int [] originalSortedArray) {
		
		int i = 0;
		
		for(int j =1 ; j < originalSortedArray.length ; j++) {
			if(originalSortedArray[i] != originalSortedArray[j]) {
			originalSortedArray[i+1] = originalSortedArray[j];
			i++;
			}
		}
		return i+1;
	}
}
