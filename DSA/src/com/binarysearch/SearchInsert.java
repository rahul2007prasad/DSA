package com.binarysearch;

public class SearchInsert {
	public static void main(String[] args) {

		int [] arr = {1,2,4,7};
		int target =5;
		System.out.println("The index is : " + searchInsert(arr, target));
	}
	
	public static int searchInsert(int [] arr , int target) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int ans =n;
		
		while(low <= high) {
			int mid = (low +high) /2;
			
			if(arr[mid] >= target) {
				ans= mid;
				high = mid -1;
			}else {
				low = mid +1;
			}
				
		}
		return ans;
	}
}
