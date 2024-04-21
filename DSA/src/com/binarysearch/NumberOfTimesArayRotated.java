package com.binarysearch;

public class NumberOfTimesArayRotated {

	public static void main(String[] args) {
		
		int [] arr = {3,4,5,1,2};
		int n = arr.length;
		int numberOfRotation = numberOfRotation(arr, n);
		System.out.println("Number of rotation "+ numberOfRotation);
		
		
		
	}
	
	public static int numberOfRotation(int []arr , int n) {
		int low =0;
		int high = n-1;
		int ans = Integer.MAX_VALUE;
		int index =0;
		while(low <= high) {
			int mid = (low + high) /2;
			if(arr[low] <= arr[high]) {
				if(arr[low] < ans) {
					index = low;
					ans = arr[low];
					break;
				}
			}
			
			if(arr[low] <= arr[mid]) {
				if(arr[low ] < ans) {
					index = low;
					ans = arr[low];
					
				}
				low = mid +1;
			}
			else {
				if(arr[mid] <ans) {
					index= mid;
					ans= arr[mid];
				   
				}
				 high = mid +1;
			}
		}
		System.out.println("Minimum is "+ ans);
		return index;
	}
}
