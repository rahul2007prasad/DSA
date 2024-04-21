package com.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	
	public static void main(String[] args) {
		System.out.println("Remove duplicate element from sorted array by bRUTE FORCE ATTACK");
		// Time complexicity : O(
		RemoveDuplicateElement rmDupl = new RemoveDuplicateElement();
		int [] arr = new int[] {1,2,2,3,3,4,4,5,5,5,6};
		rmDupl.removeDeuplicateElement(arr);
	}
	public void removeDeuplicateElement(int [] arr) {
		Set<Integer> setElement= new HashSet<Integer>() ;
		for(int i = 0 ; i < arr.length ; i++)
		setElement.add(arr[i]);
		
		for(int a : setElement)
			System.out.println(a);
		
	}
}
