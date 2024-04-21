package com.binarysearch;

public class FindFloor_Ceil_binarySearch {

	public static void main(String[] args) {
		
		int [] arr = {3,4,7,8,10};
		int target =5;
		System.out.println("Floor value : "+ findFloor(arr,target));
		System.out.println("Ceil value : "+ findCeil(arr,target));
		
	}
	
	public static int findFloor(int[] arr , int target) {
		int low = 0;
		int high = (arr.length ) -1;
		int ans =-1;
		while(low <= high) {
			int mid = (low  + high) /2;
			
			if(arr[mid] <= target) {
				ans = arr[mid];
				low = mid +1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static int findCeil(int[] arr , int target) {
		int low =0;
		int high =(arr.length) -1;
		int ans =-1;
		
		while(low <= high){
			int mid =(low + high) /2;
			if(arr[mid] >=  target) {
				ans = arr[mid];
				high = mid -1;
			}else {
				low = mid+1;
			}
		}
		return ans;
	}
	
	
	
}
