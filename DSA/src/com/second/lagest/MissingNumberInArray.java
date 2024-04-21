package com.second.lagest;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6};
		int n =6;
		
		System.out.println("missing number" +missingElement( arr , n));
	}

	private static int missingElement(int arr[] , int n) {
		int flag =0 ;
		
		for(int i = 0;  i < n-1 ; i++) {
			for(int j = 0 ;  j< n-1 ; j++) {
				if(arr[j] != i ) {
					flag =1;
				break;
				}
			}
			if(flag==0)
				return i;
		}
		return 0;
	}
	
	
	
}
