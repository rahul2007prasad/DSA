package com.second.lagest;

public class CheckIsArraySorted {
	//Time complexicit : O(N)
	public static void main(String[] args) {

		int arr[]= {1,2,5,4};
		int negArr[] = {-3,-2,-1};
		
		System.out.println("Check is array sorted: "+ checkIsArraySorted(negArr));
	}
	
	public static boolean checkIsArraySorted(int []arr) {
		for(int i=1 ; i < arr.length ;  i++) {
			if(arr[i] >= arr[i-1])
			{
				///return true;
			}
			else
				return false;
		}
		return true;
	}
}
