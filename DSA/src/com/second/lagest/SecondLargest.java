package com.second.lagest;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = {2,3,4,6,7,8};
		secondLargset(arr);
	}
	
	public static void  secondLargset(int [] arr) {
		
		int first,second ;
		first = second = Integer.MIN_VALUE;
		
		for(int i = 0 ;  i < arr.length ; i ++) {
			
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second)
				second = arr[i];
			
		}
		System.out.println("Second largest " + second + first );
	}

}
