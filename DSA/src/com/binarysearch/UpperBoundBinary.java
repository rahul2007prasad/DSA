package com.binarysearch;

public class UpperBoundBinary {

	public static void main(String[] args) {
		int arr[]  = {2,3,4,5,6,7,8,8,11,11,11,12};
		int n = arr.length;
		System.out.println("Upper bound index : "+ upperBoundBinary(arr,6,n));
		
	}
	//time compleixicity : O(log2N)
	public static int upperBoundBinary(int arr[] ,int target , int n) {
		int low =0;
		int high = n-1;
		int ans = n;
		int mid =0;
		while(low  <= high) {
			mid= (low + high) /2;
			if(arr[mid] > target) {
				ans = mid;
				high = mid-1;
			}
			else
				low = mid +1;
		}
		return n;
	}
}
