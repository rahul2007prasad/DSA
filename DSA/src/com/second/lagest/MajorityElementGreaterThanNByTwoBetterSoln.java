package com.second.lagest;

import java.util.HashMap;

public class MajorityElementGreaterThanNByTwoBetterSoln {

	//Time complexicity : O(NlogN) + O(N)
	//space complexicity  : O(N)
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,1,1,1,1,1,1,1,2,2};
		
		int majority = majority(arr);
		System.out.println("Majority element : "+ majority);
		 
	}

	private static int majority(int[] arr) {
		int ans = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i]) > (arr.length /2)) {
				ans = arr[i];
			}
			
		}
		return ans;
		
	}
	
}
