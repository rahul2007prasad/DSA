package com.second.lagest;

public class SecondLargestElement {

	// Time Complexicity = O(N) + O(N) = O(2N)
	public static void main(String args[]) {
        System.out.println("Second Largest Elemet in an array");
        //int arr[] = {2, 3, 5,1, 7,9 , 11,0 ,-1};
        int arr [] = {-1,-2,-5,-7 ,-8,1,2};
        System.out.println("second largest is :" + secondLargestElement(arr));
    }

    public static int secondLargestElement(int arr[]){

    	
           
           // int largest =  0;
            int largest = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
            int secondLargest = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length ; i++) {
            	if(arr[i] > secondLargest && arr[i] != largest) {
            		secondLargest = arr[i];
            	}
            }
            
            return secondLargest;
    }
}
