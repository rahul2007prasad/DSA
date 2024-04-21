package com.binarysearch;

public class FirstAndLastOccuranceInArray {
	public static void main(String[] args) {

		int arr[] = {2,4,4,6,7,8,9};
		int n = arr.length;
		int target =4;
		System.out.println("Lower boud :" + lowerBound(arr , n, target));
		System.out.println("upper boud :" + lowerBound(arr , n, target));
		int lowerBound = lowerBound(arr , n, 5);
		int upperBound = upperBound(arr , n, 5);
		
		if(lowerBound == n || arr[lowerBound] !=target)
			System.out.println("not found");
		else
		System.out.println("First and Last occurance " +lowerBound + " " + (upperBound -1));
		
		
		System.out.println("---");
		int firstOccuranceBinarySearch = firstOccuranceBinarySearch(arr, n, target);
		int lastOccuranceBinarySearch = lastOccuranceBinarySearch(arr, n, target);
		
		if(firstOccuranceBinarySearch ==-1)
			System.out.println("not found");
		else
			System.out.println("First :" + firstOccuranceBinarySearch + " last occ :" + lastOccuranceBinarySearch);
	
		
		totalNumberTimesOfoCcurance(arr, n, target);
	}
	
	public static int lowerBound(int [] arr , int n , int target) {
		int low =0;
		int high = n-1;
		int ans =0;
		
		while(low <= high) {
			int mid = (low + high) /2;
			if(arr[mid] >= target) {
				ans = mid;
				high = mid -1;
				
			}
			else {
				low = mid +1;
			}
		}
		return ans;
		
	}
	public static int upperBound(int [] arr , int n , int target) {
		int low =0;
		int high = n-1;
		int ans =0;
		while(low  <= high) {
			int mid = (low + high) /2;
			if(arr[mid] > target) {
				ans = mid;
				high = mid -1;
				
			}else {
				low = mid+1;
			}
		}
		return ans;
	}
	
	public static int firstOccuranceBinarySearch(int [] arr ,int n , int target) {
		int low =0;
		int high=n-1;
		int first=-1;
		
		while(low  <= high) {
			int mid = (low + high)/2;
			if(arr[mid] == target) {
				first = mid;
				high = mid -1;
				
			}
			else if(arr[mid] < target) {
				low = mid +1;
			}
			else
				high = mid -1;
		}
		return first;
	}
	
	public static int lastOccuranceBinarySearch(int[] arr , int n , int target) {
		int low=0;
		int high =n-1;
		int last = -1;
		
		while(low  <= high) {
			int mid = (low + high) /2;
			if(arr[mid] == target) {
				last = mid;
				low = mid + 1;
			}
			else if(arr[mid] < target) {
				high = mid -1;
			}
			else
				high = mid -1;
		}
		return last;
	}
	
	public static int totalNumberTimesOfoCcurance(int [] arr , int n ,int target) {
		
		// Time Complexity: O(2*logN)
		int firstOccuranceBinarySearch = firstOccuranceBinarySearch(arr, n, target);
		int lastOccuranceBinarySearch = lastOccuranceBinarySearch(arr, n, target);
		System.out.println("In total occurance : last "+ lastOccuranceBinarySearch + " first " + firstOccuranceBinarySearch);
		int totalOccurance = (lastOccuranceBinarySearch - firstOccuranceBinarySearch ) + 1;
		System.out.println("Total occurance times " + totalOccurance);
		return totalOccurance;
	}
	
}
