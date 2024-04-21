package com.largest.of.three;

import java.util.Arrays;

public class ThreeLargestNumber {

	public static void main(String[] args) {
		int arr[] = {7,4,16,2,6,9};
		ThreeLargestNumber.threeLargest(arr);
		ThreeLargestNumber.largestThree(arr);
	}
	
	public static void  threeLargest(int [] arr) {
		
		int i , first, second , third;
		first=second=third = Integer.MIN_VALUE;
		
		for( i = 0; i < arr.length ; i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i] > third) {
				third = second;
				second = arr[i];
			}
			else if (arr[i] > third)
				third = arr[i];
		}
		System.out.println("Three largest element"+first +" " + second + " " + third);
	}
	
	public static void largestThree(int [] arr) {
		
		Arrays.sort(arr);
		int check=0 , count =1;
		int n = arr.length;
		
		for(int i = 0 ; i <= n ; i++) {
			if(count < 4) {
				if(check != arr[n -i]) {
					System.out.println(arr[i-1] +" ");
					check = arr[ n - i];
					count++;
				}
				else break;
			}
		}
	}
}
