package com.second.lagest;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemWithHashing {
	public static void main(String[] args) {
		int arr[]= {1,6,5,7,8};
		int target = 8;
		
		int[] twoSumHashing = twoSumHashing(arr , target);
		for(int i = 0 ; i< twoSumHashing.length ; i++)
		System.out.print(" " + i);
		
		
		int[] findTwoSum = findTwoSum(arr ,target);
	System.out.println("  --");
		for(int el : findTwoSum)
			System.out.print(" " + el);
	}

	private static int[] twoSumHashing(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int [] result = new int[2];
		for(int i =0 ; i< arr.length ; i++) {
			if(map.containsKey(target -arr[i])) {
				//result[0] = i;
				//result[1] = map.get(target - arr[i]);
				System.out.print(i +" "+ " "+map.get(target - arr[i]) );
				return new int[] {map.get(target - arr[i]), i};
				
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}
	
	 private static int[] findTwoSum(int[] nums, int target) {
	        Map<Integer, Integer> numMap = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) {
	                return new int[] { numMap.get(complement), i };
	            } else {
	                numMap.put(nums[i], i);
	            }
	        }
	        return new int[] {};
	    }
}
