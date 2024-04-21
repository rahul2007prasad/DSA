package com.binarysearch;

public class LowerBoundIndex {

	public static void main(String[] args) {
		int arr[]  = {3,5,8,15,19};
		int n = arr.length;
		System.out.println("lower bound index"+ lowerBoundBinary(arr,9,n));
		
	}
	//time compleixicity : O(log2N)
	public static int lowerBoundBinary(int arr[] ,int target , int n) {
		int low =0;
		int high = n-1;
		int ans = n;
		int mid =0;
		while(low  <= high) {
			mid= (low + high) /2;
			if(arr[mid] >= target) {
				ans = mid;
				high = mid-1;
			}
			else
				low = mid +1;
		}
		return n;
	}
}
