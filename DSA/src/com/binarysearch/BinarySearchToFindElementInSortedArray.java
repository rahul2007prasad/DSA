package com.binarysearch;

public class BinarySearchToFindElementInSortedArray {
//Time complexicity  : O(log2N)
	public static void main(String[] args) {
		
		int ar[] = { 3,4,6,7,8,9,11,15,18};
		//List<Integer> asList = Arrays.asList(ar);
		int index = findElementBinarySearch(ar, 7);
		System.out.println("New " + findElementBinarySearch(ar, 7));
		System.out.println("Index of target elemtm" + index);
		int n = ar.length;
		int low = 0;
		int high = n-1;
		
		System.out.println("recursive approach : " + findElementbinarySearchReursiveApproach(ar ,low ,high , 7));
	}
	public static int findElementBinarySearch(int[] al ,int target) {
		System.out.println("hellow");
		int n = al.length;
		int low =0;
		int high = n-1;
		
		while(low <= high) {
			int mid = (low + high) /2;
			if(al[mid] == target)
				return mid;
			else if(target > al[mid])
				low = mid + 1;
			else
				high = mid -1 ;
		}
		return -1;
	}
	public static int findElementbinarySearchReursiveApproach(int[] arr , int low ,int high , int target) {
		if(low > high)
			return -1;
		int mid= (low + high) /2;
		if(arr[mid] == target)
			return mid;
		else if(target > arr[mid])
			return findElementbinarySearchReursiveApproach(arr , mid+1 , high , target);
		return findElementbinarySearchReursiveApproach(arr , low , mid-1 , target);
		
	
	}
}


