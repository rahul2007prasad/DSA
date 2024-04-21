package com.second.lagest;

public class MoveNonZeroElementToFrontOptimal {
	public static void main(String[] args) {

		int ar[] = {2,3,0,3,0,4,0,5,0};
		int[] moveZeroToEnd = moveZeroToEnd(ar);
		for (int i = 0; i < moveZeroToEnd.length; i++) { 
            System.out.print(moveZeroToEnd [i] + " "); // Print the array 
        }
	}
	
	public static int[] moveZeroToEnd(int [] arr) {
		int j= -1;
		for(int i = 0; i< arr.length ; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		if(j== -1)
			return arr;
		
		for(int i = j+1 ; i < arr.length ; i++) {
			if(arr[i] !=0) {
				swap(arr[i] , arr[j]);
				j++;
			}
		}
		return arr;
		 
	}
	public static void swap(int ithElement , int jthElement) {
		int temp =0;
		temp = ithElement;
		ithElement = jthElement;
		jthElement =temp;
	}
}
