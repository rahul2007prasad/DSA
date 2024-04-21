package com.second.lagest;

public class MissingElementInArrayUsingSum {
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,6,7};
		int n = 7;
		int missingElement = missingElement(arr, n);
		System.out.println("Missing element : "+ missingElement);
	}
	
	public static int missingElement(int ar[] , int n) {
		int sum = n * (n+1)/2;
		int sumOfArray =0;
		for(int i = 0; i < n-1 ; i++){
			sumOfArray += ar[i];
		}
		return sum - sumOfArray;
	}
}
