package com.binarysearch;

public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,6,7,8};
		int n = arr.length;
		minimumInSortedArray(arr, n);
		
	}
	
	public static int minimumInSortedArray(int []arr , int n) {
		int low =0;
		int high = n-1;
		int ans = Integer.MAX_VALUE;
		
		while(low <= high) {
			int mid = (low + high) /2;
			
			if(arr[low] <= arr[mid]) {
				ans = Integer.min(ans, arr[low]);
				low = mid +1;
			}
			else {
				ans= Integer.min(ans, arr[mid]);
			    high = mid +1;
			}
		}
		System.out.println("Minimum is "+ ans);
		return ans;
	}
}
