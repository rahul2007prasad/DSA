package com.second.lagest;

import java.util.HashMap;

public class MajorityElementGreaterThanNByTwoOptimalSoln {
	//More Voting algoithm
	//Time complexicity :  O(N)
	//space complexicity  : O(1)
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,1,1,1,1,1,1,1,2,2};
		
		int majority = majority(arr);
		System.out.println("Majority element : "+ majority);
		 
	}

	private static int majority(int[] arr) {
			int count =0;
			int element=0;
			for(int i = 0; i < arr.length ; i++) {
				if(count==0) {
					count =1;
					element  = arr[i];
				}
				else if(arr[i] == element) {
					count++;
				}
				else
					count--;
			}
		for(int  i=0; i < arr.length ; i++) {
			if(arr[i] == element)
				count++;
		}
		if(count  > (arr.length /2))
			return element;
	return -1;
	}
	
}
