package com.binarysearch;

import java.util.ArrayList;

public class SearchInSortedRotatedArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		int target = 7;
		int searchInSortedRotatedArray = searchInSortedRotatedArray(arr , n , target);
		if(searchInSortedRotatedArray == -1)
		System.out.println("Element is not pesent ");
		else
			System.out.println("Element is present at "+ searchInSortedRotatedArray);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);al.add(8);al.add(9);al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);
		
		int search = search(al, n, searchInSortedRotatedArray);
		if(search == -1)
			System.out.println("Element is not pesent ");
			else
				System.out.println("Element is present at "+ searchInSortedRotatedArray);
	}
	
	//Time Complexicity O(log2N)
	public static int searchInSortedRotatedArray(int [] arr , int n , int target) {
		
		int low =0;
		int high =n-1;
		
		while(low  <= high) {
			int mid = (low  + high) /2;
			
			if(arr[mid] == target)
				return mid;
			
			//left hals is sorted
			if(arr[low] < arr[mid]) {
				if(arr[low] <= target && target <= arr[mid]) 
					high = mid -1;
				else
					low = mid +1;
			}
			//right half is sorted
			else {
				if(arr[mid] <= target && target <= arr[high])
					low = mid + 1;
				else
					high = mid -1;
			}
		}
		return -1;
	}
	
	 static int search(ArrayList<Integer> arr, int n, int k) {
	        int low = 0, high = n - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;

	            // if mid points to the target
	            if (arr.get(mid) == k)
	                return mid;

	            // if left part is sorted
	            if (arr.get(low) <= arr.get(mid)) {
	                if (arr.get(low) <= k && k <= arr.get(mid)) {
	                    // element exists
	                    high = mid - 1;
	                } else {
	                    // element does not exist
	                    low = mid + 1;
	                }
	            } else { // if right part is sorted
	                if (arr.get(mid) <= k && k <= arr.get(high)) {
	                    // element exists
	                    low = mid + 1;
	                } else {
	                    // element does not exist
	                    high = mid - 1;
	                }
	            }
	        }
	        return -1;
	    }

}
