package com.second.lagest;

public class LeftRotateArrayByOnePlace {
// Time Complexicity : O(N)
	//Space complexicity : O(1)
	public static void main(String[] args) {
	int []arr = {9,5,7,1,3};
	leftRotateArryByOnePlace(arr);
}
 public static void leftRotateArryByOnePlace(int arr[]) {
	 int temp = arr[0];
	 for(int i = 1 ; i < arr.length ; i++) {
		 arr[i-1] = arr[i];
	 }
	 arr[arr.length - 1] = temp;
	 for(int i = 0 ; i< arr.length ; i++)
	 System.out.println("Left rotation of array" + arr[i]);
 }
 
}
