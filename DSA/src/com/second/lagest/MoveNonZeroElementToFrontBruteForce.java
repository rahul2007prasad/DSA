package com.second.lagest;

import java.util.ArrayList;

public class MoveNonZeroElementToFrontBruteForce {
	//TimeComplexicity = O(2N)
	//Space complexicity = O(x)
	public static void main(String[] args) {
		MoveNonZeroElementToFrontBruteForce mv = new MoveNonZeroElementToFrontBruteForce();
		int arr[] = {2,3 ,4,10,0,2,0,2,0};
		mv.moveZeroToEnd(arr);
	}
	
	public  void moveZeroToEnd(int arr[]) {
		 ArrayList<Integer> temp = new ArrayList<Integer>();
		 for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] !=0 ) {
				temp.add(arr[i]);
			}
		}
		
		for(int i=0 ; i <temp.size() ; i++) {
			arr[i] = temp.get(i);
		}
		
		for(int i= temp.size() ; i < arr.length ; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(" "+ arr[i]);
	}
}
