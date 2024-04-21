package com.second.lagest;

public class TwoSumProblem {

	//brute force approach
	public static void main(String[] args) {
		int arr[]  = {2,4,5,7,9};
		int target = 12;
		
		twoSum(arr , target);
		
	}

	private static void twoSum(int[] arr, int target) {
		for(int i =0 ; i < arr.length ; i++) {
			for(int j =0 ; j < arr.length ; j++) {
				if(i==j)
					continue;
				if((arr[i] + arr[j]) ==  target) {
					System.out.println(i + " " + j + " "+ (arr[i] + arr[j]));
				
					break;
				}
					
			}
			
		}
		
		
	}
}
