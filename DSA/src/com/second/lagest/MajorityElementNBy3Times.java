package com.second.lagest;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementNBy3Times {

	public static void main(String[] args) {
		//int arr[] = {1,1,1,3,3,2,2,2};
		int[] arr = {11, 33, 33, 11, 33, 11};
		majorityElementNBy3Times(arr);
		
		majorityElementBetterSolution(arr);
	}
	
	//brute force
	public static void majorityElementNBy3Times(int [] arr) {
		// Time complexicity O(n2)
		// Space Complexicity O(1)
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< n; i++) {
			if(list.size() == 0 || list.get(0) != arr[i]) {
				int count =0;
				for(int j= 0;  j < n ;j++ ) {
					if(arr[j]== arr[i])
						count++;
				}
				if(count > (n/3))
					list.add(arr[i]);
			}
			if(list.size() ==2)
				break;
			}
		
		list.stream().forEach( System.out :: println);
			
	}
	
	//better solution
	
	public static void majorityElementBetterSolution(int arr[]) {
		System.out.println("better solution");
		int n = arr.length;
		  int mini = (int)(n / 3) +1;
		  ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int count =0;
		for(int i = 0; i < n ; i++ ) {
			Integer orDefault = map.getOrDefault(arr[i], 0);
			map.put(arr[i], orDefault+1);
			
			if(map.get(arr[i]) == mini)
				list.add(arr[i]);
				
			if(list.size() == 2)
				break;
		}
		
		list.stream().forEach(System.out:: println);
		
		
	}
}
