package com.second.lagest;

public class MajorityElementGreaterThanNByTwoBruteForce {

	//Time complexicty : O(N2)
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,1,2,2};
		
		int majority = majority(arr);
		System.out.println("Majority element : "+ majority);
	}

	private static int majority(int[] arr) {
		for(int i =0; i < arr.length ;i++) {
			int count = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j] == arr[i])
					count++;
			}
			if(count > (arr.length /2))
				return arr[i];
		}
		return -1;
		
	}
	
}
