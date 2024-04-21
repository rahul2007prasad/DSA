package com.second.lagest;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateDPlaceByOptimal {
	public static void main(String[] args) {
		Integer arr[] = {2,3,4,5,6,7};
		for(int i = 0; i < arr.length ;i++)
		System.out.print(" "+ arr[i]);
		System.out.println("");
		
		Collections.reverse(Arrays.asList(arr));
		
		for(int i =0 ; i < arr.length ; i++) 
			System.out.print(" "+ arr[i]);
	}
}
