package com.second.lagest;

public class LeftRotateArrayByDPlace {
	//Time complexicity : O(N+d)
	// space complexxicity : O(D)
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		leftRotateByDplace(arr ,16);
	}
	
	public static void leftRotateByDplace(int []arr , int d) {
		 d = d % arr.length;
		int [] temp =new int[d];
		for(int i = 0 ; i < d ; i++) {
			temp[i] = arr[i];
		}
		
		//shift d pleces
		
		for(int i=d ; i< arr.length ; i++) {
			arr[i-d] = arr[i];
		}
		
		//put back temp to arr 
		for(int i= arr.length-d ; i <arr.length ; i++) {
			arr[i] = temp[i-(arr.length-d)];
		}
		
		//print
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(" "+ arr[i]);
		}
	}
}
